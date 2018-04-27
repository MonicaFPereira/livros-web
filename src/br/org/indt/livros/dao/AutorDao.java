package br.org.indt.livros.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.org.indt.livros.jdbc.ConnectionFactory;
import br.org.indt.livros.modelo.Autor;

public class AutorDao {

	private Connection connection;

	public AutorDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Autor autor) {
		String sql = "insert into autor " + "(nome) " + "values (?) ";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, autor.getNome());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Autor> getLista() {
		try {
			List<Autor> autores = new ArrayList<Autor>();

			PreparedStatement stmt = this.connection.prepareStatement("select * from autor");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Autor autor = new Autor();
				autor.setNome(rs.getString("nome"));
				autores.add(autor);
			}
			rs.close();
			stmt.close();
			return autores;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Autor autor) {

		String sql = "update autor set nome=?where id=?";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, autor.getNome());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Autor autor) {

		try {

			PreparedStatement stmt = connection.prepareStatement("delete from autor where id=?");

			stmt.setLong(1, autor.getId());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
