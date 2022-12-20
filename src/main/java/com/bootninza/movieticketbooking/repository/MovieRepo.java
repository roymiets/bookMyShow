package com.bootninza.movieticketbooking.repository;

import com.bootninza.movieticketbooking.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie,Long> {

}
