package com.sceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sceapp.domain.Usuario;
import com.sceapp.services.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/usuarios")
@Api(value="USUARIOS")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	//Retorna uma lista de Usuários
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ApiOperation(value="Retorna uma lista de Usuários")
	public ResponseEntity<?> listaUsuarios(){
		List<Usuario> obj = usuarioService.listaUsuarios();
		return ResponseEntity.ok().body(obj);
	}
	
	//Retorna um usuário único
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ApiOperation(value="Retorna um usuário único")
	public ResponseEntity<?> listaUsuarioUnico(@PathVariable(value="id") Long id){
		Usuario obj =  usuarioService.listaUsuarioUnico(id);
		return ResponseEntity.ok().body(obj);
	}
	
	//Salva um usuário
	@RequestMapping(value="/usuario", method=RequestMethod.POST)
	@ApiOperation(value="Salva um usuário")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> salvaUsuario(@RequestBody Usuario usuario) {
		Usuario obj = usuarioService.salvaUsuario(usuario);
		return ResponseEntity.ok().body(obj);
	}
	
	//Atualiza um usuário
	@RequestMapping(value="/usuario", method=RequestMethod.PUT)
	@ApiOperation(value="Atualiza um usuário")
	public ResponseEntity<?> atualizaUsuario(@RequestBody Usuario usuario) {
		Usuario obj = usuarioService.atualizaUsuario(usuario);
		return ResponseEntity.ok().body(obj);
	}

	//Deleta um usuário
	@RequestMapping(value="/usuario", method=RequestMethod.DELETE)
	@ApiOperation(value="Deleta um usuário")
	public void deletaUsuario(@RequestBody Usuario usuario) {
		usuarioService.deletaUsuario(usuario);
	}
}
