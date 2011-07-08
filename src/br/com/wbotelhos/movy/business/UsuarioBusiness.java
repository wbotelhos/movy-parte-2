package br.com.wbotelhos.movy.business;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.vraptor.ioc.Component;
import br.com.wbotelhos.movy.model.Usuario;

@Component
public class UsuarioBusiness {

	private final EntityManager manager;

	public UsuarioBusiness(EntityManager manager) {
	  this.manager = manager;
	}

	public Collection<Usuario> loadAll() {
		Query query = manager.createQuery("from Usuario");

		@SuppressWarnings("unchecked")
		Collection<Usuario> resultList = query.getResultList();

		return resultList;
	}

	public Usuario loadById(Long id) {
		return manager.find(Usuario.class, id);
	}

	public void remove(Usuario usuario) {
	    manager.remove(manager.getReference(Usuario.class, usuario.getId()));
	}

	public Usuario save(Usuario usuario) {
		return manager.merge(usuario);
	}

}