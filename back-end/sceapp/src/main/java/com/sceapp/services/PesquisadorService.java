package com.sceapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sceapp.domain.Pesquisador;
import com.sceapp.repository.PesquisadorRepository;

@Service
public class PesquisadorService {

	@Autowired
	private PesquisadorRepository repository;
	
	//OPERAÇÕES CRUD
	public List<Pesquisador> listarPesquisadores() {
		List<Pesquisador> pesquisadores = repository.findAll();
	    return pesquisadores;
	}
	
	public Pesquisador buscarPesquisadorPorId(Long id) {
	    Optional<Pesquisador> obj = repository.findById(id);
	    return obj.orElse(null);
	}
	
	public Pesquisador inserirPesquisador(Pesquisador pesquisador) {
	    Pesquisador obj = repository.save(pesquisador);
	    return obj;
	}
	
	public void deletarPesquisador(Long id) {
		repository.deleteById(id);
	}
	
	public Pesquisador atualizarPesquisador(Pesquisador novoPesquisador, Long id) {
		return repository.findById(id).map(pesquisador -> {
			pesquisador.setNome(novoPesquisador.getNome());
			pesquisador.setUsername(novoPesquisador.getUsername());
			pesquisador.setSenha(novoPesquisador.getSenha());
			pesquisador.setCpf(novoPesquisador.getCpf());
			pesquisador.setEmail(novoPesquisador.getEmail());
			pesquisador.setDataDeNascimento(novoPesquisador.getDataDeNascimento());
			pesquisador.setSexo(novoPesquisador.getSexo());
			pesquisador.setCampoDeAtuacao(novoPesquisador.getCampoDeAtuacao());
			return repository.save(pesquisador);	
		}
				)
				.orElseGet(() -> {
					novoPesquisador.setId(id);
					return repository.save(novoPesquisador);
				}
						);
	}
}
