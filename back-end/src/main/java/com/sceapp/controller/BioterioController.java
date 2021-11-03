package com.sceapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sceapp.domain.Bioterio;
import com.sceapp.services.BioterioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/bioterios")
@Api(value="BIOTERIO")
public class BioterioController {
	
	@Autowired
	private BioterioService bioterioService;
	
	//Retorna uma lista de bioterios
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ApiOperation(value="Retorna uma lista de bioterios")
	public ResponseEntity<?> listaBioterios(){
		List<Bioterio> obj = bioterioService.listaBioterios();
		return ResponseEntity.ok().body(obj);
	}
	
	//Retorna um bioterio único
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ApiOperation(value="Retorna um bioterio único")
	public ResponseEntity<?> listaUsuarioUnico(@PathVariable(value="id") Long id){
		Optional<Bioterio> obj =  bioterioService.listaBioterioUnico(id);
		return ResponseEntity.ok().body(obj);
	}
		
	//Salva um bioterio
	@RequestMapping(value="/bioterio", method=RequestMethod.POST)
	@ApiOperation(value="Salva um bioterio")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> salvaUsuario(@RequestBody Bioterio bioterio) {
		Bioterio obj = bioterioService.salvaBioterio(bioterio);
		return ResponseEntity.ok().body(obj);
	}
	
	//Deleta um bioterio
	@RequestMapping(value="/usuario", method=RequestMethod.DELETE)
	@ApiOperation(value="Deleta um bioterio")
	public void deletaBioterio(@RequestBody Bioterio bioterio) {
		bioterioService.deletaBioterio(bioterio);
	}
	
	//Atualiza um bioterio
	@RequestMapping(value="/usuario", method=RequestMethod.PUT)
	@ApiOperation(value="Atualiza um bioterio")
	public ResponseEntity<?> atualizaUsuario(@RequestBody Bioterio bioterio) {
		Bioterio obj = bioterioService.atualizaBioterio(bioterio);
		return ResponseEntity.ok().body(obj);
	}
}
