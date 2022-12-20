package com.bootninza.movieticketbooking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Getter
@Setter
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalTime startTime;
    private LocalTime endTime;
    private Integer price;

    @OneToOne
    private Movie movie;


}
