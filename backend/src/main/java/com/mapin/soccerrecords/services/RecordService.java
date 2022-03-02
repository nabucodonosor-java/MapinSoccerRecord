package com.mapin.soccerrecords.services;

import com.mapin.soccerrecords.dto.RecordDTO;
import com.mapin.soccerrecords.model.Record;
import com.mapin.soccerrecords.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    @Transactional(readOnly = true)
    public Page<RecordDTO> findALl(Pageable pageable) {
        Page<Record> page = recordRepository.findAll(pageable);
        return page.map(RecordDTO::new);
        // return page.map(r -> new RecordDTO(r));
    }

    @Transactional(readOnly = true)
    public RecordDTO findById(Long id) {
        Optional<Record> obj = recordRepository.findById(id);
        return new RecordDTO(obj.get());
    }
}
