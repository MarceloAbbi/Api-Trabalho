package com.trabalho.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.api.model.Voluntario;
import com.trabalho.api.repository.VoluntarioRepository;

@RestController
@RequestMapping ("/voluntarios")
public class VoluntarioController {
	
	@Autowired
	private VoluntarioRepository voluntarioRepository;

	@GetMapping
	public List<Voluntario> listar() {
		return voluntarioRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Voluntario adicionar(@RequestBody Voluntario voluntario) {
		return voluntarioRepository.save(voluntario);
	}
}
