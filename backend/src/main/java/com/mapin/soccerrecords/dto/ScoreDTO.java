package com.mapin.soccerrecords.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ScoreDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long recordId;
    private String email;
    private Double score;

}
