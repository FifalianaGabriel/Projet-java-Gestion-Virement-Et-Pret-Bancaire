package com.bancaire;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionToDatabase {
	
	private final String url = "jdbc:postgresql://localhost/GestionBancaire";
	private final String user = "postgres";
	private final String password = "248651379rfg";
	
	public Connection connect() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connexion à la base de données réussie");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	
}
