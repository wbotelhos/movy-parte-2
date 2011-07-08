package br.com.wbotelhos.movy.business;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.wbotelhos.movy.business.common.GenericBusiness;
import br.com.wbotelhos.movy.model.Filme;

@Component
public class FilmeBusiness extends GenericBusiness<Filme> {

	public FilmeBusiness(EntityManager manager) {
	  super(manager);
	}

}