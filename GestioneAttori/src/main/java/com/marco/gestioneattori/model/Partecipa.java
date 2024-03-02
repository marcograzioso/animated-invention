package com.marco.gestioneattori.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Partecipa {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column
	private String personaggio;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Attore attorePartecipante;
	

	@ManyToOne(cascade = CascadeType.ALL)
	private Film film;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPersonaggio() {
		return personaggio;
	}
	public void setPersonaggio(String personaggio) {
		this.personaggio = personaggio;
	}
	
	public Attore getAttorePartecipante() {
		return attorePartecipante;
	}
	public void setAttorePartecipante(Attore attore) {
		this.attorePartecipante = attore;
	}
	
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
}
