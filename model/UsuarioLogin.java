package br.com.generation.nerdolaStore.model;
/*Função: Inserindo camada de seguranca na LojaDeGames (testagem no Postman)
 * Autora: Talu - Turma 25
 * Data: 07.07.2021
*/
public class UsuarioLogin {

		private String nome;

		private String email;

		private String senha;

		private String token;

		private String mensagem;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getMensagem() {
			return mensagem;
		}

		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
}