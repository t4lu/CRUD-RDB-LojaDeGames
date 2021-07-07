package br.com.generation.nerdolaStore.security;
/*Função: Inserindo camada de seguranca na LojaDeGames (testagem no Postman)
 * Autora: Talu - Turma 25
 * Data: 07.07.2021
*/
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.generation.nerdolaStore.model.Usuario;

public class UserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = 1L; 

	private String userName;
	private String password;

	public UserDetailsImpl(Usuario usuario) {
		super();
		this.userName = usuario.getEmail();
		this.password = usuario.getSenha();
	}

	public UserDetailsImpl() {}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public String getUsername() {
		return userName;
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}
}