package br.org.indt.livros.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.org.indt.livros.jdbc.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexao aberta");
		connection.close();

	}

}
