package br.com.generation.nerdolaStore.repository;
/*Função: CRUD e dados relacionais em Loja de Games (testagem no Postman)
 * Autora: Talu - Turma 25
 * Data: 30.06.2021
*/
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.nerdolaStore.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);
	
	public List<Produto> findAllByMarcaContainingIgnoreCase (String marca);
	
	public List<Produto> findAll();
	
	public Produto findById (long id);
	
	public Produto deleteById (long id);
	
	public List<Produto> findAllByPreco (double preco);
}