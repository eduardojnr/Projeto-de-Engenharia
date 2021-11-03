package com.sceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sceapp.domain.Protocolo;

public interface ProtocoloRepository extends JpaRepository<Protocolo, Long> {
	
}
