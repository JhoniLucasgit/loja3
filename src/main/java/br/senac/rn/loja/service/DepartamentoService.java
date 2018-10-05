package br.senac.rn.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.rn.loja.model.Departamento;
import br.senac.rn.loja.repository.DepartamentoRepository;

@Service
public class DepartamentoService {
	
	@Autowired
	private DepartamentoRepository repository;
	
	public void salvar(Departamento departamento) {
		repository.save(departamento);
	}
		
	public Departamento buscarPorId(Integer id){
		return repository.findById(id).get();//quando for optional e quiser a classe usar o .get()
	}
	
	public void remover(Integer id) {
		repository.deleteById(id);
	}
	
	public List<Departamento> buscarTodos(){
		return repository.findAll();
	}
	
}
