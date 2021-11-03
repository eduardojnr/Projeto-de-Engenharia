package com.sceapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sceapp.domain.Protocolo;
import com.sceapp.repository.ProtocoloRepository;

@Service
public class ProtocoloService {
	
	@Autowired
	private ProtocoloRepository protocoloRepository;
	
	//OPERAÇÕES CRUD
	public List<Protocolo> listaProtocolos() { 
		return protocoloRepository.findAll();
	}
	
	public Optional<Protocolo> listaProtocoloUnico(Long id) {
		return protocoloRepository.findById(id);
	}
	
	public Protocolo salvaProtocolo(Protocolo protocolo) {
		return protocoloRepository.save(protocolo);
	}
	
	public Protocolo atualizaProtocolo(Protocolo protocolo) {
		return protocoloRepository.save(protocolo);
	}
}
