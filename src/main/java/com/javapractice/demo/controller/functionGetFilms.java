package com.javapractice.demo.controller;

import com.javapractice.demo.dao.FilmRepository;
import com.javapractice.demo.entities.FimGets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class functionGetFilms {
    @Autowired
    FilmRepository filmRepository;
    public List<FimGets> getFilms(){
        return filmRepository.getAllFilms();
    }
}
