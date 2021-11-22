package com.sceapp.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.sceapp.data.DetalheUsuarioData;
import com.sceapp.domain.Usuario;
import com.sceapp.repository.UsuarioRepository;

import java.util.Optional;

@Component
public class DetalheUsuarioService implements UserDetailsService {

    private final UsuarioRepository repository;

    public DetalheUsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> usuario = repository.findByUsername(username);
        if (usuario.isEmpty()) {
            throw new UsernameNotFoundException("Usuário [" + username + "] não encontrado");
        }

        return new DetalheUsuarioData(usuario);
    }

}
