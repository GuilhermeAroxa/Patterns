package com.example.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Deny Prasetyo
 */
public class DatabaseConnection {

    private Connection connection;
    private String username = "postgres";
    private String password = "rootPass";
	private static volatile DatabaseConnection instance = null;
	
	private DatabaseConnection() throws SQLException{
		try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
	}
	
	public static DatabaseConnection getInstance() throws SQLException {
		if (instance == null) {
			// http://disciplinas.tecnico.ulisboa.pt/leic-sod/2017-2018/labs/01-tools/java-synch/index.html
			// A primitiva synchronized é aplicada a métodos do objeto e oferece um mecanismo de exclusão mútua a um recurso partilhado, que previne a reordenação do código pelo compilador. Um método sincronizado adquire o trinco do objeto no início de execução e liberta-o no fim.
			synchronized(DatabaseConnection.class){
				if(instance == null) {
					instance = new DatabaseConnection();									
				}
			}
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		if (connection == null || connection.isClosed()) {
			synchronized(DatabaseConnection.class){
				if(connection == null || connection.isClosed()) {
					String url = "jdbc:postgresql://localhost:5432/designpatternscourse";									
					try {
						connection = DriverManager.getConnection(url, username, password);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return connection;
	}
}