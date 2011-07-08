package br.com.wbotelhos.movy.business;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.vraptor.ioc.Component;
import br.com.wbotelhos.movy.model.Artista;

@Component
public class ArtistaBusiness {

	private final EntityManager manager;

	public ArtistaBusiness(EntityManager manager) {
	  this.manager = manager;
	}

	public Collection<Artista> loadAll() {
		Query query = manager.createQuery("from Artista");

		@SuppressWarnings("unchecked")
		Collection<Artista> resultList = query.getResultList();

		return resultList;
	}

	public Artista loadById(Long id) {
		return manager.find(Artista.class, id);
	}

	public void remove(Artista artista) {
	    manager.remove(manager.getReference(Artista.class, artista.getId()));
	}

	public Artista save(Artista artista) {
		return manager.merge(artista);
	}

}