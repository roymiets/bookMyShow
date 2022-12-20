package com.bootninza.movieticketbooking.controller;

import com.bootninza.movieticketbooking.entity.Movie;
import com.bootninza.movieticketbooking.request.MovieDao;
import com.bootninza.movieticketbooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @PostMapping("/add")
    public Movie add(@RequestBody MovieDao movieDao){
        return movieService.add(movieDao);
    }

}
