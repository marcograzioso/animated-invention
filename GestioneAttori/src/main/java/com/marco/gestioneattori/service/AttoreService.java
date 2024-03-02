package com.marco.gestioneattori.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marco.gestioneattori.model.Attore;
import com.marco.gestioneattori.model.Partecipa;
import com.marco.gestioneattori.repository.AttoreRepository;
import com.marco.gestioneattori.repository.PartecipaRepository;

@Service
public class AttoreService {
	
	@Autowired
	private AttoreRepository attoreRepo;

	@Autowired
	private PartecipaRepository partecipaRepo;
	
	
	public void saveAttore(Attore a) {
		attoreRepo.save(a);
	}


	public void salvaPartecipazione(Partecipa p) {
		this.partecipaRepo.save(p);
		
	}

}
