package com.sceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sceapp.domain.Especie;

public interface EspecieRepository extends JpaRepository<Especie, Long> {

}
