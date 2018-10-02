package br.senac.rn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.senac.rn.loja.service.MarcaService;

@Controller("/")
public class MarcaController {

	@Autowired
	private MarcaService service;
	
	@GetMapping("/listar")
	private String listar() {
		return null;
	}
}
