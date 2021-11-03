package com.sceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sceapp.domain.Protocolo;
import com.sceapp.services.ProtocoloService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/protocolos")
@Api(value="PROTOCOLOS")
public class ProtocoloController {
	
	@Autowired
	private ProtocoloService protocoloService;
	
	//Retorna uma lista de Protocolos
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ApiOperation(value="Retorna uma lista de Protocolos")
	public ResponseEntity<?> listaProtocolos(){
		List<Protocolo> obj = protocoloService.listaProtocolos();
		return ResponseEntity.ok().body(obj);
	}
	
	//Salva um protocolo
	@RequestMapping(value="/protocolo", method=RequestMethod.POST)
	@ApiOperation(value="Salva um protocolo")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> salvaUsuario(@RequestBody Protocolo protocolo) {
		Protocolo obj = protocoloService.salvaProtocolo(protocolo);
		return ResponseEntity.ok().body(obj);
	}

	//Atualiza um protocolo
	@RequestMapping(value="/protocolo", method=RequestMethod.PUT)
	@ApiOperation(value="Atualiza um protocolo")
	public ResponseEntity<?> atualizaProtocolo(@RequestBody Protocolo protocolo) {
		Protocolo obj = protocoloService.atualizaProtocolo(protocolo);
		return ResponseEntity.ok().body(obj);
	}
}
