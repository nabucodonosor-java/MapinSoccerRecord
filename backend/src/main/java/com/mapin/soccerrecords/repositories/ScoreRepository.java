package com.mapin.soccerrecords.repositories;

import com.mapin.soccerrecords.model.Score;
import com.mapin.soccerrecords.model.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
