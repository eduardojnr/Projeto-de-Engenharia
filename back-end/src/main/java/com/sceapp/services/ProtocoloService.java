package com.sceapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sceapp.domain.Protocolo;
import com.sceapp.repository.ProtocoloRepository;

@Service
public class ProtocoloService {
	
	@Autowired
	private ProtocoloRepository protocoloRepository;
	
	//OPERAÇÕES CRUD
	public List<Protocolo> listaProtocolos(){
		List<Protocolo> protocolos = protocoloRepository.findAll(); 
		return protocolos;
	}
	
	public Protocolo salvaProtocolo(Protocolo protocolo) {
		Protocolo obj = protocoloRepository.save(protocolo);
		return obj;
	}
	
	public Protocolo atualizaProtocolo(Protocolo protocolo) {
		return protocoloRepository.save(protocolo);
	}
}
