package com.mapin.soccerrecords.controller;

import com.mapin.soccerrecords.dto.RecordDTO;
import com.mapin.soccerrecords.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/records")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @GetMapping
    public Page<RecordDTO> findAll(Pageable pageable) {
        Page<RecordDTO> page = recordService.findALl(pageable);
        return page;
    }

    @GetMapping("/{id}")
    public RecordDTO findById(@PathVariable Long id) {
        RecordDTO obj = recordService.findById(id);
        return obj;
    }
}
