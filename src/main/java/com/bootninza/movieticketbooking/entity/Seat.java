package com.bootninza.movieticketbooking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long seatNo;

    @OneToOne
    private SeatType seatType;


}
