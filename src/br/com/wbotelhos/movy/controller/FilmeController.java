package br.com.wbotelhos.movy.controller;

import java.util.Collection;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.wbotelhos.movy.business.FilmeBusiness;
import br.com.wbotelhos.movy.model.Filme;

@Resource
public class FilmeController {

	private final FilmeBusiness filmeBusiness;
	private final Result result;

	public FilmeController(Result result, FilmeBusiness filmeBusiness) {
		this.result = result;
		this.filmeBusiness = filmeBusiness;
	}

	@Get("/filme/{filme.id}/editar")
	public void editar(Filme filme) {
	  filme = filmeBusiness.loadById(filme.getId());

	  result.include("filme", filme).forwardTo(this).novo();
	}

	@Get("/filme/{filme.id}")
	public void exibir(Filme filme) {
		filme = filmeBusiness.loadById(filme.getId());

		result.include("filme", filme);
	}

	@Get("/filme")
	public void listagem() {
		Collection<Filme> filmeList = filmeBusiness.loadAll();

		result.include("filmeList", filmeList);
	}

	@Get("/filme/novo")
	public void novo() {

	}

	@Delete("/filme/{filme.id}")
	public void remover(Filme filme) {
	  filmeBusiness.remove(filme);

	  result
	  .include("message", "Filme removido com sucesso!")
	  .redirectTo(this).listagem();
	}

	@Post("/filme")
	public void salvar(Filme filme) {
		filme = filmeBusiness.save(filme);

		result
		.include("message", "Filme salvo com sucesso!")
		.redirectTo(this).exibir(filme);
	}

}