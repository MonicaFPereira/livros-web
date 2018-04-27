package br.org.indt.livros.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/livros?useSSL=false", "root", "");
		   
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	

}
