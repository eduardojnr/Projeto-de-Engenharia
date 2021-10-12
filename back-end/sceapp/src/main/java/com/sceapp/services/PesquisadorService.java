package com.sceapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sceapp.domain.Pesquisador;
import com.sceapp.repository.PesquisadorRepository;

@Service
public class PesquisadorService {

	@Autowired
	private PesquisadorRepository repository;
	
	//OPERAÇÕES CRUD
	public List<Pesquisador> listarPesquisadores() {
		List<Pesquisador> pesquisadores = repository.findAll();
	    return pesquisadores;
	}
	
	public Pesquisador buscarPesquisadorPorId(Long id) {
	    Optional<Pesquisador> obj = repository.findById(id);
	    return obj.orElse(null);
	}
	
	public Pesquisador inserirPesquisador(Pesquisador pesquisador) {
	    Pesquisador obj = repository.save(pesquisador);
	    return obj;
	}
	
	public void deletarPesquisador(Pesquisador pesquisador) {
		repository.delete(pesquisador);
	}
	
	public Pesquisador atualizaePesquisador(Pesquisador pesquisador) {
		return repository.save(pesquisador);
	}
}
