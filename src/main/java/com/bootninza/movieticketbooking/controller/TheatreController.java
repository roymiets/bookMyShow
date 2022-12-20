package com.bootninza.movieticketbooking.controller;

import com.bootninza.movieticketbooking.entity.Theatre;
import com.bootninza.movieticketbooking.request.TheatreDao;
import com.bootninza.movieticketbooking.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theatre")
public class TheatreController {

    @Autowired
    TheatreService theatreService;

    @PostMapping("/add")
    public Theatre addTheatre(@RequestBody TheatreDao theatreDao){

        return theatreService.addTheatre(theatreDao);
    }

    @GetMapping("all")
    public List<TheatreDao> getAll(){

        return theatreService.getAll();
    }

    @GetMapping("all/{id}")
    public List<TheatreDao> getAllById(@PathVariable long id){

        return theatreService.getAllByCityId(id);
    }



}
