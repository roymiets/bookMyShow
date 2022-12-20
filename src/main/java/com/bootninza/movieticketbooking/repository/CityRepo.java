package com.bootninza.movieticketbooking.repository;

import com.bootninza.movieticketbooking.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<City,Long> {
}
