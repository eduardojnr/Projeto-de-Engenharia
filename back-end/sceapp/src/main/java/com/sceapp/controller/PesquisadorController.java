package com.sceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sceapp.domain.Pesquisador;
import com.sceapp.repository.PesquisadorRepository;
import com.sceapp.services.PesquisadorService;

@RestController
//@RequestMapping("/pesquisador")
public class PesquisadorController {
	
	@Autowired
	private PesquisadorService service;
	
	//Pega lista de pesquisadores
	//@GetMapping("/")
	@RequestMapping("/pesquisador")
	public ResponseEntity<?> responseListarPesquisadores(){
		List<Pesquisador> obj = service.listarPesquisadores();
		return ResponseEntity.ok().body(obj);
	}
	
    //Cadastra um novo pesquisador
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> responseInserirPesquisador(Pesquisador pesquisador){
		Pesquisador obj = service.inserirPesquisador(pesquisador);
		return ResponseEntity.ok().body(obj);
	}
		
	public ResponseEntity<?> responseUpgradePesquisador(Pesquisador pesquisador){
			Pesquisador obj = service.atualizaePesquisador(pesquisador);
			return ResponseEntity.ok().body(obj);
	}
}
