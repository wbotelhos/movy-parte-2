package br.com.wbotelhos.movy.controller;

import java.util.Collection;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.wbotelhos.movy.model.Artista;
import br.com.wbotelhos.movy.model.common.TipoSexo;
import br.com.wbotelhos.movy.repository.ArtistaRepository;

@Resource
public class ArtistaController {

	private final ArtistaRepository repository;
	private final Result result;

	public ArtistaController(Result result, ArtistaRepository repository) {
		this.result = result;
		this.repository = repository;
	}

	@Get("/artista/{artista.id}/editar")
	public void editar(Artista artista) {
	  artista = repository.loadById(artista.getId());

	  result.include("artista", artista).forwardTo(this).novo();
	}

	@Get("/artista/{artista.id}")
	public void exibir(Artista artista) {
		artista = repository.loadById(artista.getId());

		result.include("artista", artista);
	}

	@Get("/artista")
	public void listagem() {
		Collection<Artista> artistaList = repository.loadAll();

		result.include("artistaList", artistaList);
	}

	@Get("/artista/novo")
	public TipoSexo[] novo() {
		return TipoSexo.values();
	}

	@Delete("/artista/{artista.id}")
	public void remover(Artista artista) {
	  repository.remove(artista);

	  result
	  .include("message", "Artista removido com sucesso!")
	  .redirectTo(this).listagem();
	}

	@Post("/artista")
	public void salvar(Artista artista) {
		artista = repository.save(artista);

		result
		.include("message", "Artista salvo com sucesso!")
		.redirectTo(this).exibir(artista);
	}

}