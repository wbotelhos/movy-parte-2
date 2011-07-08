package br.com.wbotelhos.movy.model;

import javax.persistence.Entity;

import br.com.wbotelhos.movy.model.common.AbstractEntity;

@Entity
public class Filme extends AbstractEntity {

	private static final long serialVersionUID = -4144195690825990038L;

	private Integer ano;
	private String titulo;
	private String tituloOriginal;
	private String genero;
	private String sinopse;

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

}