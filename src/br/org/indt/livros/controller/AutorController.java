package br.org.indt.livros.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.org.indt.livros.dao.AutorDao;
import br.org.indt.livros.modelo.Autor;

@Controller
public class AutorController {
	@RequestMapping("adicionarAutor")
	public String adiciona(Autor autor) {
		AutorDao dao = new AutorDao();
		dao.adiciona(autor);
		return "autor/adicionado";
	}

	@RequestMapping("listaAutores")
	public String lista(Model model) {
		AutorDao dao = new AutorDao();

		List<Autor> autores = dao.getLista();
		model.addAttribute("autores", autores);
		return "autor/lista";
	}

}
