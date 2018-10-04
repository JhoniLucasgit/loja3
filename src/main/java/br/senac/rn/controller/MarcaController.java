package br.senac.rn.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.rn.loja.model.Marca;
import br.senac.rn.loja.service.MarcaService;

@Controller
@RequestMapping("/marca")
public class MarcaController {

	@Autowired
	private MarcaService service;
		
	@GetMapping("/lista")//requisição
	public String listar(Model model) {
		List<Marca> marcas = service.buscar();
		model.addAttribute("marcas", marcas);
		return "marca/lista";//pasta templates
	}
	
}
