package com.sceapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;


@Entity
@Table(name="TB_USUARIO")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;
	private String username;
	private String senha;
	private String email;
	private String cpf;
	private String dataDeNascimento;
	private String sexo;
	private String tipoDePerfil;
	private String campoDeAtuacao;
	
	public Usuario(long id, String nome, String username, String senha, String email, String cpf,
	String dataDeNascimento, String sexo, String tipoDePerfil) {
		this.id = id;
		this.nome = nome;
		this.username = username;
		this.senha = senha;
		this.email = email;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.tipoDePerfil = tipoDePerfil;
	}
	
	public Usuario(long id, String nome, String username, String senha, String email, String cpf,
			String dataDeNascimento, String sexo, String tipoDePerfil, String campoDeAtuacao) {
		this.id = id;
		this.nome = nome;
		this.username = username;
		this.senha = senha;
		this.email = email;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.tipoDePerfil = tipoDePerfil;
		this.campoDeAtuacao = campoDeAtuacao;
	}

	public Usuario() {
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	public String getCampoDeAtuacao() {
		return campoDeAtuacao;
	}
	
	public void setCampoDeAtuacao(String campoDeAtuacao) {
		this.campoDeAtuacao = campoDeAtuacao;
	}

	public String getTipoDePerfil() {
		return tipoDePerfil;
	}

	public void setTipoDePerfil(String tipoDePerfil) {
		this.tipoDePerfil = tipoDePerfil;
	}

	@Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    } 
}
