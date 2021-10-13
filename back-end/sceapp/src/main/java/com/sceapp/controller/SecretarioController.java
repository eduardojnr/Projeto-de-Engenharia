package com.sceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sceapp.domain.Secretario;
import com.sceapp.repository.SecretarioRepository;
import com.sceapp.services.SecretarioService;

@RestController
@RequestMapping("/secretarios")
public class SecretarioController {
	

    @Autowired
	private SecretarioService service;
	
	//Pega lista de secretarios
    @GetMapping("/")
	public ResponseEntity<?> responseListarSecretarios(){
		List<Secretario> obj = service.listarSecretarios();
		return ResponseEntity.ok().body(obj);
	}

	//Cadastra secretario
    @PostMapping("/secretario")
    @ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> responseInserirSecretario(@RequestBody Secretario secretario){
		Secretario obj = service.inserirPesquisador(secretario);
		return ResponseEntity.ok().body(obj);
	}
}
