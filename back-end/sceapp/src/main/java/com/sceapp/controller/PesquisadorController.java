package com.sceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sceapp.domain.Pesquisador;
import com.sceapp.repository.PesquisadorRepository;
import com.sceapp.services.PesquisadorService;

@RestController
@RequestMapping("/pesquisadores")
public class PesquisadorController {
	
	@Autowired
	private PesquisadorService service;
	
	//Pega lista de pesquisadores
	@GetMapping("/")
	public ResponseEntity<?> responseListarPesquisadores(){
		List<Pesquisador> obj = service.listarPesquisadores();
		return ResponseEntity.ok().body(obj);
	}

	//Mostrar pesquisador pelo id
	@GetMapping("/{id}")
	public ResponseEntity<?> responseListarPesquisador(@PathVariable("id") long id) {
		Pesquisador obj = service.buscarPesquisadorPorId(id);
		return ResponseEntity.ok().body(obj);
	}
	
    //Cadastra um novo pesquisador
    @PostMapping("/pesquisador")
    @ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> responseInserirPesquisador(@RequestBody Pesquisador pesquisador){
		Pesquisador obj = service.inserirPesquisador(pesquisador);
		return ResponseEntity.ok().body(obj);
	}
	
    //Atualizar pesquisador já cadastrado
    @PutMapping("/pesquisador/{id}")
	public ResponseEntity<?> responseUpgradePesquisador(@RequestBody Pesquisador pesquisador, @PathVariable("id") long id){
			Pesquisador obj = service.atualizaePesquisador(pesquisador, id);
			return ResponseEntity.ok().body(obj);
	}
    
    //Deletar pesquisador já cadastrado
    @DeleteMapping("/pesquisador/{id}")
    public void DeletarPesquisador(@PathVariable Long id) {
    	service.deletarPesquisador(id);
    }
}
