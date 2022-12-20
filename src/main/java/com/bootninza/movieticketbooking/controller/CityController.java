package com.bootninza.movieticketbooking.controller;

import com.bootninza.movieticketbooking.request.AddTheatreRequest;
import com.bootninza.movieticketbooking.request.CityDao;
import com.bootninza.movieticketbooking.entity.City;
import com.bootninza.movieticketbooking.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping("/add")
    public City add(@RequestBody CityDao cityDao) {
        return cityService.addCity(cityDao);
    }

    @PostMapping("/addAll")
    public List<City> addAll(@RequestBody List<CityDao> cityDao) {
        return cityService.addAllCity(cityDao);
    }

    @PatchMapping("/theatre")
    public City updateCity(@RequestBody AddTheatreRequest request) {

        return cityService.addTheatre(request);
    }

    @GetMapping("/all")
    public List<City> getAll() {
        return cityService.getCities();
    }
}
