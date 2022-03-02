package com.mapin.soccerrecords.services;

import com.mapin.soccerrecords.dto.RecordDTO;
import com.mapin.soccerrecords.dto.ScoreDTO;
import com.mapin.soccerrecords.model.Record;
import com.mapin.soccerrecords.model.Score;
import com.mapin.soccerrecords.model.User;
import com.mapin.soccerrecords.repositories.RecordRepository;
import com.mapin.soccerrecords.repositories.ScoreRepository;
import com.mapin.soccerrecords.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    @Autowired
    private RecordRepository recordRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    public RecordDTO saveScore(ScoreDTO obj) {
        User user = userRepository.findByEmail(obj.getEmail());
        if (user == null) {
            user = new User();
            user.setEmail(obj.getEmail());
            // Utilizei o saveAndFlush para garantir que o obj estará atualizado após término da op.
            user = userRepository.saveAndFlush(user);
        }
        Record record = recordRepository.findById(obj.getRecordId()).get();

        Score score = new Score();
        score.setRecord(record);
        score.setUser(user);
        score.setValue(obj.getScore());

        score = scoreRepository.saveAndFlush(score);
        double sum = 0.0;
        for (Score s : record.getScores()) {
            sum += s.getValue();
        }
        double avg = sum / record.getScores().size();

        record.setScore(avg);
        record.setCount(record.getScores().size());

        record = recordRepository.save(record);

        return new RecordDTO(record);
    }
}
