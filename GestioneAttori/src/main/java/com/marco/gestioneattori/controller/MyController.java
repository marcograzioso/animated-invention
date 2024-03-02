package com.marco.gestioneattori.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.marco.gestioneattori.model.Attore;
import com.marco.gestioneattori.model.Film;
import com.marco.gestioneattori.model.Partecipa;
import com.marco.gestioneattori.service.AttoreService;
import com.marco.gestioneattori.service.FilmService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	
	@Autowired
	private AttoreService attoreService;
	
	@Autowired
	private FilmService filmService;
	
	@GetMapping("prova/prova2")
	public String prova(Model m, HttpSession session) {
		
		session.setAttribute("nomeutente", "Marco");
		session.setMaxInactiveInterval(2000);

	
		List<Film> list  = filmService.findAll();
		//qui si fa un upcasting
		m.addAttribute("listafilm", list);//aggiungo la lista agli attributi della richiesta
		return "list";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "index";
	}

}
