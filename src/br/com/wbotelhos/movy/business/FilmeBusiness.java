package br.com.wbotelhos.movy.business;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.vraptor.ioc.Component;
import br.com.wbotelhos.movy.model.Filme;

@Component
public class FilmeBusiness {

	private final EntityManager manager;

	public FilmeBusiness(EntityManager manager) {
	  this.manager = manager;
	}

	public Collection<Filme> loadAll() {
		Query query = manager.createQuery("from Filme");

		@SuppressWarnings("unchecked")
		Collection<Filme> resultList = query.getResultList();

		return resultList;
	}

	public Filme loadById(Long id) {
		return manager.find(Filme.class, id);
	}

	public void remove(Filme filme) {
	    manager.remove(manager.getReference(Filme.class, filme.getId()));
	}

	public Filme save(Filme filme) {
		return manager.merge(filme);
	}

}