package com.sceapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sceapp.domain.Usuario;
import com.sceapp.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	//OPERAÇÕES CRUD
	public List<Usuario> listaUsuarios(){
		List<Usuario> usuarios = usuarioRepository.findAll(); 
		return usuarios;
	}
	
	public Usuario listaUsuarioUnico(Long id){
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElse(null);
	}
	
	public Usuario salvaUsuario(Usuario usuario) {
		Usuario obj = usuarioRepository.save(usuario);
		return obj;
	}
	
	public void deletaUsuario(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	public Usuario atualizaUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
