package com.sceapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PROTOCOLO")
public class Protocolo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    private String nomeDocente;
    private String justificativa;
	private String resumoPt;
	private String resumoEn;
	private String dataInicio;
	private String dataFim;
    private String status;

	public long getId() {
		return id;
	}
	
    public void setId(long id) {
		this.id = id;
	}
	
    public String getNomeDocente() {
		return nomeDocente;
	}
	
    public void setNomeDocente(String nomeDocente) {
		this.nomeDocente = nomeDocente;
	}
	
    public String getJustificativa() {
		return justificativa;
	}
	
    public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	
    public String getResumoPt() {
		return resumoPt;
	}
	
    public void setResumoPt(String resumoPt) {
		this.resumoPt = resumoPt;
	}
	
    public String getResumoEn() {
		return resumoEn;
	}
	
    public void setResumoEn(String resumoEn) {
		this.resumoEn = resumoEn;
	}
	
    public String getDataInicio() {
		return dataInicio;
	}
	
    public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	
    public String getDataFim() {
		return dataFim;
	}
	
    public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	
    public String getStatus() {
		return status;
	}
	
    public void setStatus(String status) {
		this.status = status;
	}
}
