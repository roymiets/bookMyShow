package com.bootninza.movieticketbooking.service;

import com.bootninza.movieticketbooking.entity.City;
import com.bootninza.movieticketbooking.entity.Theatre;
import com.bootninza.movieticketbooking.repository.CityRepo;
import com.bootninza.movieticketbooking.request.AddTheatreRequest;
import com.bootninza.movieticketbooking.request.CityDao;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CityService {
//hi i am git right now
    @Autowired
    private CityRepo cityRepo;

    public City addCity(CityDao cityDao) {
        City city = new City();
        city.setName(cityDao.getName());
        return cityRepo.save(city);
    }

    public List<City> getCities() {

        return cityRepo.findAll();
    }

    public City addTheatre(AddTheatreRequest request) {

        City city = cityRepo.findById(request.getCityId()).orElse(null);
        request.getTheatre().setCity(city);
        Theatre theatre = new Theatre();
        theatre.setRegNo(request.getTheatre().getRegNo());
        theatre.setName(request.getTheatre().getName());
        theatre.setCity(city);
        city.getTheatres().add(theatre);
        return cityRepo.save(city);
    }

    public List<City> addAllCity(List<CityDao> citiesDao) {
        List<City> cities = new ArrayList<>();
        citiesDao.forEach(cityDao -> {
            City city = new City();
            city.setName(cityDao.getName());
            cities.add(city);
        });

        return cityRepo.saveAll(cities);
    }
}
