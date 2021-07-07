package br.com.generation.nerdolaStore.security;
/*Função: Inserindo camada de seguranca na LojaDeGames (testagem no Postman)
 * Autora: Talu - Turma 25
 * Data: 07.07.2021
*/
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.generation.nerdolaStore.model.Usuario;
import br.com.generation.nerdolaStore.repository.UsuarioRepository;

public class UserDetailService implements UserDetailsService {

	@Autowired 
	private UsuarioRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<Usuario> usuario = repository.findByEmail(username);

		usuario.orElseThrow(() -> new UsernameNotFoundException(username + " not found."));

		return usuario.map(UserDetailsImpl::new).get();
	}
}