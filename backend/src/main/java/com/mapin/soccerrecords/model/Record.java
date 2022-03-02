package com.mapin.soccerrecords.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_record")
public class Record implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String imgUrl;
    @Column(nullable = false)
    private String title;
    private Integer count;
    private Double score;
    @Column(nullable = false)
    private String teamName;
    @Column(columnDefinition = "TEXT")
    private String description;
    @OneToMany(mappedBy = "id.record", fetch = FetchType.EAGER)
    private Set<Score> scores = new HashSet<>();
}
