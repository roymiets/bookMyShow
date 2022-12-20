package com.bootninza.movieticketbooking.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDao {
    private Long id;
    private String name;
    private String language;
    private String duration;
}
