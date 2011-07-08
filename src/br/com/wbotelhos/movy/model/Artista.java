package br.com.wbotelhos.movy.model;

import javax.persistence.Entity;

import br.com.wbotelhos.movy.model.common.AbstractEntity;

@Entity
public class Artista extends AbstractEntity {

	private static final long serialVersionUID = -2635061767717070792L;

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}