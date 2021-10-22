package com.sceapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unit.sceapp.models.Usuario;
import com.unit.sceapp.service.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/usuarios")
@Api(value="API REST SCEAPP")
@CrossOrigin(origins = "*")
public class UsuarioResource {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/")
	@ApiOperation(value="Retorna uma lista de Usuários")
	public List<Usuario> listaUsuarios(){
		return usuarioService.listaUsuarios();
	}
	
	@GetMapping("/{id}")
	@ApiOperation(value="Retorna um usuário único")
	public Optional<Usuario> listaUsuarioUnico(@PathVariable(value="id") Long id){
		return usuarioService.listaUsuarioUnico(id);
	}
	
	@PostMapping("/usuario")
	@ApiOperation(value="Salva um usuário")
	public Usuario salvaUsuario(@RequestBody Usuario usuario) {
		return usuarioService.salvaUsuario(usuario);
	}
	
	@DeleteMapping("/usuario")
	@ApiOperation(value="Deleta um usuário")
	public void deletaUsuario(@RequestBody Usuario usuario) {
		usuarioService.deletaUsuario(usuario);
	}
	
	@PutMapping("/usuario")
	@ApiOperation(value="Atualiza um usuário")
	public Usuario atualizaUsuario(@RequestBody Usuario usuario) {
		return usuarioService.atualizaUsuario(usuario);
	}
}
