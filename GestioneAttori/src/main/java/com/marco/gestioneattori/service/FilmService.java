package com.marco.gestioneattori.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marco.gestioneattori.model.Attore;
import com.marco.gestioneattori.model.Film;
import com.marco.gestioneattori.repository.AttoreRepository;
import com.marco.gestioneattori.repository.FilmRepository;
import com.marco.gestioneattori.repository.PartecipaRepository;

@Service
public class FilmService {
	
	@Autowired
	private FilmRepository filmRepo;

	@Autowired
	private PartecipaRepository partecipaRepo;
	

	
	public void saveFilm(Film f) {
		filmRepo.save(f);
	}



	public List<Film> findAll() {
		return this.filmRepo.findAll();
	}

}
