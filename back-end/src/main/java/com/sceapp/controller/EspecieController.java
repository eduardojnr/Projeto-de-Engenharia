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

import com.sceapp.domain.Especie;
import com.sceapp.services.EspecieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/especies")
@Api(value="ESPECIES")
public class EspecieController {
	
	@Autowired
	private EspecieService especieService;
	
	//Retorna uma lista de especies
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ApiOperation(value="Retorna uma lista de especies")
	public ResponseEntity<?> listaEspecies(){
		List<Especie> obj = especieService.listaEspecies();
		return ResponseEntity.ok().body(obj);
	}
	
	//Retorna uma especie únicoa
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ApiOperation(value="Retorna um bioterio único")
	public ResponseEntity<?> listaUsuarioUnico(@PathVariable(value="id") Long id){
		Optional<Especie> obj =  especieService.listaEspecieUnico(id);
		return ResponseEntity.ok().body(obj);
	}
		
	//Salva uma especie
	@RequestMapping(value="/especie", method=RequestMethod.POST)
	@ApiOperation(value="Salva um bioterio")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> salvaUsuario(@RequestBody Especie especie) {
		Especie obj = especieService.salvaEspecie(especie);
		return ResponseEntity.ok().body(obj);
	}
	
	//Deleta uma especie
	@RequestMapping(value="/especie", method=RequestMethod.DELETE)
	@ApiOperation(value="Deleta uma especie")
	public void deletaBioterio(@RequestBody Especie especie) {
		especieService.deletaEspecie(especie);
	}
	
	//Atualiza uma especie
	@RequestMapping(value="/especie", method=RequestMethod.PUT)
	@ApiOperation(value="Atualiza uma especie")
	public ResponseEntity<?> atualizaUsuario(@RequestBody Especie especie) {
		Especie obj = especieService.atualizaEspecie(especie);
		return ResponseEntity.ok().body(obj);
	}
}
