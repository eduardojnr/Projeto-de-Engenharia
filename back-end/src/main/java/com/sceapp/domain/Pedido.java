package com.sceapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PEDIDO")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long idBioterio;
	private long idEspecie;
	private int quantidade;
	private long idProtocolo;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getIdBioeterio() {
		return idBioterio;
	}
	
	public void setIdBioeterio(long idBioterio) {
		this.idBioterio = idBioterio;
	}
	
	public long getIdEspecie() {
		return idEspecie;
	}
	
	public void setIdEspecie(long idEspecie) {
		this.idEspecie = idEspecie;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public long getIdProtocolo() {
		return idProtocolo;
	}

	public void setIdProtocolo(long idProtocolo) {
		this.idProtocolo = idProtocolo;
	}
}
