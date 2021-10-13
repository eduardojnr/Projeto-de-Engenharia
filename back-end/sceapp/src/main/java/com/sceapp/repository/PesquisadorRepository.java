package com.sceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sceapp.domain.Pesquisador;
import org.springframework.stereotype.Repository;

@Repository
public interface PesquisadorRepository extends JpaRepository<Pesquisador, Long>{

}
