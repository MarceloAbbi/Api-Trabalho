package com.trabalho.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.api.model.Voluntario;

@Repository
public interface VoluntarioRepository extends JpaRepository<Voluntario, Long> {

}
