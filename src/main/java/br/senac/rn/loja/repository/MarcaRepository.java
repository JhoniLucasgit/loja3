package br.senac.rn.loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.senac.rn.loja.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Integer>{
	//jeito facil de buscar por nome
	List<Marca> findByNome(String nome);
	
	//jeito dificil de buscar por nome
	@Query("SELECT m FROM Marca m WHERE m.nome = :nome")
	List<Marca> buscaPorNome(@Param ("nome") String nome);
}
