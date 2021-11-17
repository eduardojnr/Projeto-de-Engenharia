package com.sceapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import com.sceapp.domain.DadosLogin;
import com.sceapp.domain.Usuario;
import com.sceapp.repository.UsuarioRepository;

@Service
public class LoginService {
	
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	public LoginService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public Usuario authenticate(DadosLogin dados) throws Exception {
		Optional<Usuario> usuario = usuarioRepository.findByUsername(dados.getUsername());
		if (dados.getSenha().equals(usuario.get().getSenha())) {
			return usuario.get();
		} else {
			throw new Exception();
		}
	}
}
