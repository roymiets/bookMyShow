package com.bootninza.movieticketbooking.request;

import com.bootninza.movieticketbooking.entity.City;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TheatreDao {
    private Long id;
    private String name;
    private String regNo;
    private City city;
}
