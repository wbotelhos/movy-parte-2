package br.com.wbotelhos.movy.business;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.wbotelhos.movy.business.common.GenericBusiness;
import br.com.wbotelhos.movy.model.Usuario;
import br.com.wbotelhos.movy.repository.UsuarioRepository;

@Component
public class UsuarioBusiness extends GenericBusiness<Usuario> implements UsuarioRepository {

	public UsuarioBusiness(EntityManager manager) {
	  super(manager);
	}

}