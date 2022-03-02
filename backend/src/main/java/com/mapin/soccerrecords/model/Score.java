package com.mapin.soccerrecords.model;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_score")
public class Score implements Serializable {
    private static final long serialVersionUID = 1L;

    // por ser uma chave composta é importante instanciar para evitar nullpointerexception
    @EmbeddedId
    private ScorePK id = new ScorePK();
    private Double value;

    public void setRecord(Record record) {
        id.setRecord(record);
    }

    public void setUser(User user) {
        id.setUser(user);
    }
}
