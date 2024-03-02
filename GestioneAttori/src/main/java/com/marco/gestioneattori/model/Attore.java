package com.marco.gestioneattori.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public final class Attore {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	public String nomeAttore = "Ciccio";
	
	@OneToMany(mappedBy = "attorePartecipante", cascade = CascadeType.REMOVE)
	private List<Partecipa> partecipa;
	
	
	public final String metodoFinal(String x) {
		return x;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeAttore() {
		return nomeAttore;
	}
	public void setNomeAttore(String nomeAttore) {
		this.nomeAttore = nomeAttore;
	}
	
	public List<Partecipa> getPartecipa() {
		return partecipa;
	}
	public void setPartecipa(List<Partecipa> partecipa) {
		this.partecipa = partecipa;
	}

}
