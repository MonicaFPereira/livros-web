package br.org.indt.livros.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.org.indt.livros.jdbc.ConnectionFactory;
import br.org.indt.livros.modelo.Livro;

public class LivroDao {

	private Connection connection;

	public LivroDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Livro livro) {
		String sql = "insert into livro " + "(titulo, editora, edicao, anoPublicacao) " + "values (?,?,?,?) ";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, livro.getTitulo());
			stmt.setString(2, livro.getEditora());
			stmt.setInt(3, livro.getEdicao());
			stmt.setString(4, livro.getAnoPublicacao());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Livro> getLista() {
		try {
			List<Livro> livros = new ArrayList<Livro>();

			PreparedStatement stmt = this.connection.prepareStatement("select * from livro");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Livro livro = new Livro();
				livro.setTitulo(rs.getString("titulo"));
				livro.setEditora(rs.getString("editora"));
				livro.setEdicao(rs.getInt("edicao"));
				livro.setAnoPublicacao(rs.getString("anoPublicacao"));
				livros.add(livro);
			}
			rs.close();
			stmt.close();
			return livros;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Livro livro) {

		String sql = "update livro set titulo=?, editora=? edicao=?, anoPublicao=? where id=?";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, livro.getTitulo());
			stmt.setString(2, livro.getEditora());
			stmt.setInt(3, livro.getEdicao());
			stmt.setString(4, livro.getAnoPublicacao());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Livro livro) {

		try {

			PreparedStatement stmt = connection.prepareStatement("delete from livro where id=?");

			stmt.setLong(1, livro.getId());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
