package com.sceapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sceapp.domain.Bioterio;
import com.sceapp.repository.BioterioRepository;

@Service
public class BioterioService {
	
	@Autowired
	private BioterioRepository bioterioRepository;
	
	//OPERAÇÕES CRUD
	public List<Bioterio> listaBioterios() {
		return bioterioRepository.findAll(); 
	}
	
	public Optional<Bioterio> listaBioterioUnico(Long id) {
		return bioterioRepository.findById(id);
	}
	
	public Bioterio salvaBioterio(Bioterio bioterio) {
		return bioterioRepository.save(bioterio);
	}
	
	public void deletaBioterio(Bioterio bioterio) {
		bioterioRepository.delete(bioterio);
	}
	
	public Bioterio atualizaBioterio(Bioterio bioterio) {
		return bioterioRepository.save(bioterio);
	}
}
