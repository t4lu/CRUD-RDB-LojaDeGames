package br.com.generation.nerdolaStore.model;
/*Função: Inserindo camada de seguranca na LojaDeGames (testagem no Postman)
 * Autora: Talu - Turma 25
 * Data: 07.07.2021
*/
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "usuario")
public class Usuario {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;

		@Email
		private String email;

		@NotNull
		private String senha;

		@NotNull
		@Size(min = 5, max = 100)
		private String nome;

		private boolean admin;

		@NotNull
		@JsonFormat(pattern = "dd-MM-yyyy")
		private LocalDate dataNascimento;


		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
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

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public boolean isAdmin() {
			return admin;
		}

		public void setAdmin(boolean admin) {
			this.admin = admin;
		}

		public LocalDate getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(LocalDate dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
	}