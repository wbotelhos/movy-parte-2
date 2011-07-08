package br.com.wbotelhos.movy.model;

import javax.persistence.Entity;

import br.com.wbotelhos.movy.model.common.AbstractEntity;

@Entity
public class Usuario extends AbstractEntity {

	private static final long serialVersionUID = 7649818757373046718L;

	private String nome;
	private String email;
	private String senha;

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

}