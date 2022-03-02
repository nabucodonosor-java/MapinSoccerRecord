package com.mapin.soccerrecords.controller;

import com.mapin.soccerrecords.dto.RecordDTO;
import com.mapin.soccerrecords.dto.ScoreDTO;
import com.mapin.soccerrecords.services.RecordService;
import com.mapin.soccerrecords.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public RecordDTO saveScore(@RequestBody ScoreDTO obj) {
        RecordDTO dto = scoreService.saveScore(obj);
        return dto;
    }
}
