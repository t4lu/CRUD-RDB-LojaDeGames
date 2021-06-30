package br.com.generation.nerdolaStore.repository;
/*Função: CRUD e dados relacionais em Loja de Games (testagem no Postman)
 * Autora: Talu - Turma 25
 * Data: 30.06.2021
*/
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.nerdolaStore.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAll();
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
	
	public Categoria findById (long id);
	
	public Categoria deleteById (long id);
	

}
