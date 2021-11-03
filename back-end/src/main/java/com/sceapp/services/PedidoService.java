package com.sceapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sceapp.domain.Pedido;
import com.sceapp.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	//OPERAÇÕES CRUD
	public List<Pedido> listaPedidos() { 
		return pedidoRepository.findAll();
	}
	
	public Optional<Pedido> listaPedidoUnico(Long id) {
		return pedidoRepository.findById(id);
	}
	
	public Pedido salvaPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public void deletaPedido(Pedido pedido) {
		pedidoRepository.delete(pedido);
	}
	
	public Pedido atualizaPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
}
