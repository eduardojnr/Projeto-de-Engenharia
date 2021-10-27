package com.sceapp.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Especie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String especie;
	private int quantidade;
	private String bioeterio;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getBioeterio() {
		return bioeterio;
	}
	
	public void setBioeterio(String bioeterio) {
		this.bioeterio = bioeterio;
	}
}
