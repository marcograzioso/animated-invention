package com.marco.gestioneattori.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Film {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nomeFilm;
	
	@OneToMany(mappedBy = "film", cascade = CascadeType.ALL)
	private List<Partecipa> partecipa;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeFilm() {
		return nomeFilm;
	}
	public void setNomeFilm(String nomeFilm) {
		this.nomeFilm = nomeFilm;
	}
}
