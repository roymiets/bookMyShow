package com.bootninza.movieticketbooking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Customer customer;

    @OneToOne
    private Show show;

    @OneToOne
    private Theatre theatre;

    @OneToOne
    private Audi audi;





}