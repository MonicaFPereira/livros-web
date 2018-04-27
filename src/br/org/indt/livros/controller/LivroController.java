package br.org.indt.livros.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.org.indt.livros.dao.LivroDao;
import br.org.indt.livros.modelo.Livro;

@Controller
public class LivroController {
	@RequestMapping("adicionarLivro")
	public String adiciona(Livro livro) {
		LivroDao dao = new LivroDao();
		dao.adiciona(livro);
		return "livro/adicionado";
	}

	@RequestMapping("listaLivros")
	public String lista(Model model) {
		LivroDao dao = new LivroDao();

		List<Livro> livros = dao.getLista();
		model.addAttribute("livros", livros);
		return "livro/lista";
	}

}
