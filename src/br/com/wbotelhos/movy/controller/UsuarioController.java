package br.com.wbotelhos.movy.controller;

import java.util.Collection;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.wbotelhos.movy.model.Usuario;
import br.com.wbotelhos.movy.repository.UsuarioRepository;

@Resource
public class UsuarioController {

	private final UsuarioRepository repository;
	private final Result result;

	public UsuarioController(Result result, UsuarioRepository repository) {
		this.result = result;
		this.repository = repository;
	}

	@Get("/usuario/{usuario.id}/editar")
	public void editar(Usuario usuario) {
	  usuario = repository.loadById(usuario.getId());

	  result.include("usuario", usuario).forwardTo(this).novo();
	}

	@Get("/usuario/{usuario.id}")
	public void exibir(Usuario usuario) {
		usuario = repository.loadById(usuario.getId());

		result.include("usuario", usuario);
	}

	@Get("/usuario")
	public void listagem() {
		Collection<Usuario> usuarioList = repository.loadAll();

		result.include("usuarioList", usuarioList);
	}

	@Get("/usuario/novo")
	public void novo() {

	}

	@Delete("/usuario/{usuario.id}")
	public void remover(Usuario usuario) {
	  repository.remove(usuario);

	  result
	  .include("message", "Usuário removido com sucesso!")
	  .redirectTo(this).listagem();
	}

	@Post("/usuario")
	public void salvar(Usuario usuario) {
		usuario = repository.save(usuario);

		result
		.include("message", "Usuário salvo com sucesso!")
		.redirectTo(this).exibir(usuario);
	}

}