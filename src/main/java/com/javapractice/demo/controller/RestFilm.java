package com.javapractice.demo.controller;

import com.javapractice.demo.entities.FimGets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.javapractice.demo.dao.FilmRepository;
import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.UUID;
@RequestMapping("/film")
@RestController
public class RestFilm {

    private final FilmRepository FilmRepository;

    @Autowired
    public RestFilm(FilmRepository filmRepository) {
        this.FilmRepository = filmRepository;
    }

    @Autowired
    functionGetFilms filmFunction;

    @GetMapping
    public  List<FimGets> getFilms(){
        return filmFunction.getFilms();
    }
/*
    @GetMapping("/fimls_full")
    public List<Film> getAll(){
        return FilmRepository.findAll();
    }

    @GetMapping("/cars_full")
    public List<Car> getAll(){
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    public Car getById (@PathVariable("id") UUID id){
        return carRepository.findById(id).get();
    }

    @PutMapping
    public Car update (@RequestBody Car car){
        if(carRepository.existsById (car.getId())) {
            return carRepository.save(car);
        }
        throw new EntityExistsException("User with id:'"+ car.getId() +"' doesn't exists");
    }

    @PostMapping
    public Car create(@RequestBody Car car){
        return carRepository.save(car);
    }

    @DeleteMapping("/{id}")
    public void remove (@PathVariable("id") UUID id){
        carRepository.deleteById(id);
    }
    */

}
