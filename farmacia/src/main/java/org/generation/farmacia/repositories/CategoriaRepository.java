package org.generation.farmacia.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.generation.farmacia.model.CategoriaModel;

/**
 * Inteface reponseble for inheriting crud methods
 * 
 * @author marianatheml
 * @since 1.0
 *
 */

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	
	public List<CategoriaModel> findAllByDescricaoContainingIgnoreCase (String descricao);
	
}
