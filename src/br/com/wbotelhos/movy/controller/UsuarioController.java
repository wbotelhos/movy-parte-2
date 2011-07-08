package br.com.wbotelhos.movy.controller;

import java.util.Collection;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.wbotelhos.movy.business.UsuarioBusiness;
import br.com.wbotelhos.movy.model.Usuario;

@Resource
public class UsuarioController {

	private final UsuarioBusiness usuarioBusiness;
	private final Result result;

	public UsuarioController(Result result, UsuarioBusiness usuarioBusiness) {
		this.result = result;
		this.usuarioBusiness = usuarioBusiness;
	}

	@Get("/usuario/{usuario.id}/editar")
	public void editar(Usuario usuario) {
	  usuario = usuarioBusiness.loadById(usuario.getId());

	  result.include("usuario", usuario).forwardTo(this).novo();
	}

	@Get("/usuario/{usuario.id}")
	public void exibir(Usuario usuario) {
		usuario = usuarioBusiness.loadById(usuario.getId());

		result.include("usuario", usuario);
	}

	@Get("/usuario")
	public void listagem() {
		Collection<Usuario> usuarioList = usuarioBusiness.loadAll();

		result.include("usuarioList", usuarioList);
	}

	@Get("/usuario/novo")
	public void novo() {

	}

	@Delete("/usuario/{usuario.id}")
	public void remover(Usuario usuario) {
	  usuarioBusiness.remove(usuario);

	  result
	  .include("message", "Usuário removido com sucesso!")
	  .redirectTo(this).listagem();
	}

	@Post("/usuario")
	public void salvar(Usuario usuario) {
		usuario = usuarioBusiness.save(usuario);

		result
		.include("message", "Usuário salvo com sucesso!")
		.redirectTo(this).exibir(usuario);
	}

}