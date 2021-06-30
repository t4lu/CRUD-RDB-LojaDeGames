package br.com.generation.nerdolaStore.controller;
/*Função: CRUD e dados relacionais em Loja de Games (testagem no Postman)
 * Autora: Talu - Turma 25
 * Data: 30.06.2021
*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.generation.nerdolaStore.model.Produto;
import br.com.generation.nerdolaStore.repository.ProdutoRepository;

@RestController
@RequestMapping ("/produto")
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produto;
	
	@GetMapping ("/listar")
	public List<Produto> listar(){
		return produto.findAll();
	}
	@GetMapping ("/id/{id}")
	public Produto getById (@PathVariable long id) {
		return produto.findById(id);
	}
	@GetMapping ("/nome/{nome}")
	public List<Produto> getByNomedoProduto (@PathVariable String nome){
		return produto.findAllByNomeContainingIgnoreCase(nome);
	}
	@GetMapping("/marca/{marca}")
	public List<Produto> getByMarca (@PathVariable String marca){
		return produto.findAllByMarcaContainingIgnoreCase(marca);
	}
	@GetMapping ("/preco/{preco}")
	public List<Produto> getByPreco (@PathVariable double preco){
		return produto.findAllByPreco(preco);
	}
	@PostMapping ("/novo")
	public Produto novoProduto (@RequestBody Produto product) {
		return produto.save(product);
	}
	@PutMapping ("/editar")
	public Produto editarProduto (@RequestBody Produto product) {
		return produto.save(product);
	}
	@DeleteMapping ("/excluir/{id}")
	public Produto excloooi (@PathVariable long id) {
	return produto.deleteById(id);
	}
}