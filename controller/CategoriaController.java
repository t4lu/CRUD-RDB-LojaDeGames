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

import br.com.generation.nerdolaStore.model.Categoria;
import br.com.generation.nerdolaStore.repository.CategoriaRepository;

@RestController
@RequestMapping ("/categoria")
@CrossOrigin ("*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoria;
	
	@GetMapping ("/listar")
	public List<Categoria> listar (){
		return categoria.findAll();
	}
	@GetMapping ("/id/{id}")
	public Categoria getById (@PathVariable long id) {
		return categoria.findById(id);
	}
	@GetMapping("/{descricao}")
	public List<Categoria> findByDescricao (@PathVariable String descricao) {
		return categoria.findAllByDescricaoContainingIgnoreCase(descricao);
	}
	@PostMapping ("/criar")
	public Categoria criarDescricao (@RequestBody Categoria descricao)  {
		return categoria.save(descricao);
	}
	@PutMapping ("/editar")
	public Categoria editarDescricao (@RequestBody Categoria descricao)  {
		return categoria.save(descricao);
	}
	@DeleteMapping ("/excluir/{id}")
	public Categoria exclooooi (@PathVariable long id) {
		return categoria.deleteById(id);
	}
}