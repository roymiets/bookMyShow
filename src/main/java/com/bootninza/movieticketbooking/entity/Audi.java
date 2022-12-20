package com.bootninza.movieticketbooking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Audi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne
    private Theatre theatre;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Seat> seats;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Show> shows;

}