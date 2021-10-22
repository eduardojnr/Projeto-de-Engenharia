package com.sceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import com.sceapp.domain.Usuario;
import com.sceapp.services.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/usuarios")
@Api(value="API REST SCEAPP")
@CrossOrigin(origins = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	//Retorna uma lista de Usuários
	@GetMapping("/")
	@ApiOperation(value="Retorna uma lista de Usuários")
	public ResponseEntity<?> listaUsuarios(){
		List<Usuario> obj = usuarioService.listaUsuarios();
		return ResponseEntity.ok().body(obj);
	}
	
	//Retorna um usuário único
	@GetMapping("/{id}")
	@ApiOperation(value="Retorna um usuário único")
	public ResponseEntity<?> listaUsuarioUnico(@PathVariable(value="id") Long id){
		Usuario obj =  usuarioService.listaUsuarioUnico(id);
		return ResponseEntity.ok().body(obj);
	}
	
	//Salva um usuário
	@PostMapping("/usuario")
	@ApiOperation(value="Salva um usuário")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> salvaUsuario(@RequestBody Usuario usuario) {
		Usuario obj = usuarioService.salvaUsuario(usuario);
		return ResponseEntity.ok().body(obj);
	}
	
	//Deleta um usuário
	@DeleteMapping("/usuario")
	@ApiOperation(value="Deleta um usuário")
	public void deletaUsuario(@RequestBody Usuario usuario) {
		usuarioService.deletaUsuario(usuario);
	}
	
	//Atualiza um usuário
	@PutMapping("/usuario")
	@ApiOperation(value="Atualiza um usuário")
	public ResponseEntity<?> atualizaUsuario(@RequestBody Usuario usuario) {
		Usuario obj = usuarioService.atualizaUsuario(usuario);
		return ResponseEntity.ok().body(obj);
	}
}
