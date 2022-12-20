package com.bootninza.movieticketbooking.service;

import com.bootninza.movieticketbooking.entity.Theatre;
import com.bootninza.movieticketbooking.repository.TheatreRepo;
import com.bootninza.movieticketbooking.request.TheatreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheatreService {

    @Autowired
    TheatreRepo theatreRepo;

    public Theatre addTheatre(TheatreDao theatreDao) {
        Theatre theatre = new Theatre();
        theatre.setName(theatreDao.getName());
        theatre.setRegNo(theatreDao.getRegNo());
        theatre.setCity(theatreDao.getCity());
        return theatreRepo.save(theatre);
    }


    public List<TheatreDao> getAll() {
        List<TheatreDao> theatreDaoList = new ArrayList<>();
        theatreRepo.findAll().forEach(theatre -> {
            TheatreDao dao = new TheatreDao();
            dao.setName(theatre.getName());
            dao.setCity(theatre.getCity());
            dao.setRegNo(theatre.getRegNo());
            dao.setId(theatre.getId());
            theatreDaoList.add(dao);
        });
        return theatreDaoList;
    }

    public List<TheatreDao> getAllByCityId(long cityId) {
        List<TheatreDao> theatreDaoList = new ArrayList<>();
        theatreRepo.findAllByCityId(cityId).forEach(theatre -> {
            TheatreDao dao = new TheatreDao();
            dao.setName(theatre.getName());
            dao.setCity(theatre.getCity());
            dao.setRegNo(theatre.getRegNo());
            dao.setId(theatre.getId());
            theatreDaoList.add(dao);
        });
        return theatreDaoList;
    }
}
