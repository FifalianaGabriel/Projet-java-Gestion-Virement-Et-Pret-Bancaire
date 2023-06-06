package com.bancaire;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionToDatabase {
	
	public final String url = "jdbc:postgresql://localhost/GestionBancaire";
	public final String user = "postgres";
	public final String password = "248651379rfg";
	
	
	public Connection connect() {
		
		Connection connection = null;
		
		
		try {
			 connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connexion à la base de données réussie");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return connection;
		
	}

}
