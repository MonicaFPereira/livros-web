package br.org.indt.livros.teste;

import java.util.List;

import br.org.indt.livros.dao.LivroDao;
import br.org.indt.livros.modelo.Livro;

public class TestaLista {

	public static void main(String[] args) {

    LivroDao dao = new LivroDao();
    
        List<Livro> livros = dao.getLista();
        
        for (Livro livro:livros) {
        	System.out.println("Titulo       :  " + livro.getTitulo());
        	System.out.println("Editora      :  " + livro.getEditora());
        	System.out.println("Edicao       :  " + livro.getEdicao());
        	System.out.println("Ano Publicaco:  " + livro.getAnoPublicacao());
        }
	}

}
