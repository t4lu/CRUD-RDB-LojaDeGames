package br.com.generation.nerdolaStore.repository;
/*Função: Inserindo camada de seguranca na LojaDeGames (testagem no Postman)
 * Autora: Talu - Turma 25
 * Data: 07.07.2021
*/
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.nerdolaStore.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

		public Optional<Usuario> findByEmail (String email);
}