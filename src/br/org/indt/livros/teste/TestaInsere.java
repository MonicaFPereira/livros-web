package br.org.indt.livros.teste;

import br.org.indt.livros.dao.LivroDao;
import br.org.indt.livros.modelo.Livro;

public class TestaInsere {

	public static void main(String[] args) {

       Livro livro = new Livro();
       livro.setTitulo("Livro 1");
       livro.setEditora("Editora Abril");
       livro.setEdicao(1);
       livro.setAnoPublicacao("1980");
       
       LivroDao dao = new LivroDao();
       dao.adiciona(livro);
       System.out.println("Gravado");
       

	}

}
