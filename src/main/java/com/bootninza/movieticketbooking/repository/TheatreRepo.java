package com.bootninza.movieticketbooking.repository;
import com.bootninza.movieticketbooking.entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepo extends JpaRepository<Theatre,Long> {
    Iterable<Theatre> findAllByCityId(Long cityId);
}
