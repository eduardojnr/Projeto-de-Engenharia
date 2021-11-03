package com.sceapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sceapp.domain.Especie;
import com.sceapp.repository.EspecieRepository;

@Service
public class EspecieService {
	
	@Autowired
	private EspecieRepository especieRepository;
	
	//OPERAÇÕES CRUD
	public List<Especie> listaEspecies() { 
		return especieRepository.findAll();
	}
	
	public Optional<Especie> listaEspecieUnico(Long id) {
		return especieRepository.findById(id);
	}
	
	public Especie salvaEspecie(Especie especie) {
		return especieRepository.save(especie);
	}
	
	public void deletaEspecie(Especie especie) {
		especieRepository.delete(especie);
	}
	
	public Especie atualizaEspecie(Especie especie) {
		return especieRepository.save(especie);
	}
}
