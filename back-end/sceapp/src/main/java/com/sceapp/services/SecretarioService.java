package com.sceapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sceapp.domain.Secretario;
import com.sceapp.repository.SecretarioRepository;

@Service
public class SecretarioService {

    @Autowired
	private SecretarioRepository repository;

    public Secretario inserirSecretario(Secretario secretario) {
	    Secretario obj = repository.save(secretario);
	    return obj;
	}
	
	public void deletarSecretario(Long id) {
		repository.deleteById(id);
	}
	
	public Secretario atualizarSecretario(Secretario novoSecretario, Long id) {
		return repository.findById(id).map(secretario -> {
			secretario.setNome(novoSecretario.getNome());
			secretario.setUsername(novoSecretario.getUsername());
			secretario.setSenha(novoSecretario.getSenha());
			secretario.setCpf(novoSecretario.getCpf());
			secretario.setEmail(novoSecretario.getEmail());
			secretario.setDataDeNascimento(novoSecretario.getDataDeNascimento());
			secretario.setSexo(novoSecretario.getSexo());
			return repository.save(secretario);	
		}
				)
				.orElseGet(() -> {
					novoSecretario.setId(id);
					return repository.save(novoSecretario);
				}
						);
	}

    public List<Secretario> listarSecretarios(){
        List<Secretario> secretario = repository.findAll();
        return secretario;
    }

}