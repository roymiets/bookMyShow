package com.bootninza.movieticketbooking.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class CityDao {
    private Long id;
    private String name;
    private Set<TheatreDao> theatres;

}
