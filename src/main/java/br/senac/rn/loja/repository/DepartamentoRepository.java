package br.senac.rn.loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.senac.rn.loja.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer>{
	
	List<Departamento> findByNome(String nome);
	
	@Query("SELECT d FROM Departamento d WHERE d.nome = :nome")
	List<Departamento> buscaPorNome(@Param ("nome") String nome);
}
