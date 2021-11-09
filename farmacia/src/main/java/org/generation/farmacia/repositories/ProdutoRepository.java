package org.generation.farmacia.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.generation.farmacia.model.ProdutoModel;

/**
 * Inteface reponseble for inheriting crud methods
 * 
 * @author marianatheml
 * @since 1.0
 *
 */

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
	
	public List<ProdutoModel> findByDescricaoContainingIgnoreCase(String descricao);

}
