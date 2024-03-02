package com.marco.gestioneattori.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.gestioneattori.model.Attore;
import com.marco.gestioneattori.model.Film;
import com.marco.gestioneattori.model.Partecipa;

public interface FilmRepository extends JpaRepository<Film, Integer>{

}
