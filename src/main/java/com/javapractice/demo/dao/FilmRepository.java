package com.javapractice.demo.dao;

import com.javapractice.demo.entities.Film;
import com.javapractice.demo.entities.FimGets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.UUID;
public interface FilmRepository extends JpaRepository<Film, UUID> {
    @Query(value = "SELECT * from film", nativeQuery = true)
    List<FimGets> getAllFilms();
}