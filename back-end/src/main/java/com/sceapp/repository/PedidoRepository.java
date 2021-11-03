package com.sceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sceapp.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
