package br.com.wbotelhos.movy.business;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.wbotelhos.movy.business.common.GenericBusiness;
import br.com.wbotelhos.movy.model.Artista;

@Component
public class ArtistaBusiness extends GenericBusiness<Artista> {

	public ArtistaBusiness(EntityManager manager) {
	  super(manager);
	}

}