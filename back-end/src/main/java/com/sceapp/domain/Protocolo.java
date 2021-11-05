package com.sceapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

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
	@JsonFormat(pattern= "dd/MM/yyyy")
	private LocalDate dataInicio;
    @JsonFormat(pattern= "dd/MM/yyyy")
	private LocalDate dataFim;
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
	
    public LocalDate getDataInicio() {
		return dataInicio;
	}
	
    public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	
    public LocalDate getDataFim() {
		return dataFim;
	}
	
    public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	
    public String getStatus() {
		return status;
	}
	
    public void setStatus(String status) {
		this.status = status;
	}
}
