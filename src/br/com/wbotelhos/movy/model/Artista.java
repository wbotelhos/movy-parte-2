package br.com.wbotelhos.movy.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.Past;

import br.com.wbotelhos.movy.model.common.AbstractEntity;
import br.com.wbotelhos.movy.model.common.TipoSexo;

@Entity
public class Artista extends AbstractEntity {

	private static final long serialVersionUID = 8593908819891487557L;

	private String nome;

	@Enumerated(EnumType.STRING)
	private TipoSexo sexo;

	@Past
	@Temporal(TemporalType.DATE)
	private Date nascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

}