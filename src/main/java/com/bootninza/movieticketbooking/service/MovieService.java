package com.bootninza.movieticketbooking.service;

import com.bootninza.movieticketbooking.entity.Movie;
import com.bootninza.movieticketbooking.repository.MovieRepo;
import com.bootninza.movieticketbooking.request.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    //i am using movie service class right now
     @Autowired
     private MovieRepo movieRepo;

    public Movie add(MovieDao movieDao) {
        Movie movie=new Movie();
        movie.setName(movieDao.getName());
        movie.setLanguage(movieDao.getLanguage());
        movie.setDuration(movie.getDuration());
        return  movieRepo.save(movie);
    }
}
