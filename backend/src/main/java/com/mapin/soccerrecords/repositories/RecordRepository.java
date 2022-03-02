package com.mapin.soccerrecords.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mapin.soccerrecords.model.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
