package com.mapin.soccerrecords.dto;

import com.mapin.soccerrecords.model.Record;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RecordDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String imgUrl;
    private String title;
    private Integer count;
    private Double score;
    private String teamName;
    private String description;

    public RecordDTO(Record obj) {
        id = obj.getId();
        imgUrl = obj.getImgUrl();
        title = obj.getTitle();
        count = obj.getCount();
        score = obj.getScore();
        teamName = obj.getTeamName();
        description = obj.getDescription();
    }
}
