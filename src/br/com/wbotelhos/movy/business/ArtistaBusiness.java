package br.com.wbotelhos.movy.business;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.wbotelhos.movy.business.common.GenericBusiness;
import br.com.wbotelhos.movy.model.Artista;
import br.com.wbotelhos.movy.repository.ArtistaRepository;

@Component
public class ArtistaBusiness extends GenericBusiness<Artista> implements ArtistaRepository {

	public ArtistaBusiness(EntityManager manager) {
	  super(manager);
	}

}