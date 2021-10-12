package com.sceapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.sceapp.enums.PesquisadorEnum;

@Entity
public class Pesquisador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Size(min=3 , max= 10, message="Usuario deve conter entre 3 e 10 caracteres")
	private String username;
	private String senha;
	private String cpf;
	@Email
	private String email;
	
	private String dataDeNascimento;
	private String sexo;
	private PesquisadorEnum campoDeAtuacao;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public PesquisadorEnum getCampoDeAtuacao() {
		return campoDeAtuacao;
	}

	public void setCampoDeAtuacao(PesquisadorEnum campoDeAtuacao) {
		this.campoDeAtuacao = campoDeAtuacao;
	}
	
}
