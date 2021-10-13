package com.sceapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sceapp.domain.Secretario;
import com.sceapp.repository.SecretarioRepository;

@Service
public class SecretarioService {

    @Autowired
	private SecretarioRepository repository;

    public Secretario inserirPesquisador(Secretario secretario) {
	    Secretario obj = repository.save(secretario);
	    return obj;
	}
	
	public void deletarPesquisador(Secretario secretario) {
		repository.delete(secretario);
	}
	
	public Secretario atualizaePesquisador(Secretario secretario) {
		return repository.save(secretario);
	}

    public List<Secretario> listarSecretarios(){
        List<Secretario> secretario = repository.findAll();
        return secretario;
    }

}