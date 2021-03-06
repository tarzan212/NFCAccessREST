package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	/**
	* Returns the Connection object configured to connect to the database with the 
	* Docker specified IP.
	* @return the connection to the database
	*/
	public Connection getConnection() throws Exception {
		try{
			//change to 172.17.0.2:3306 si on lexecute depuis le docker du webserver
			String connectionURL = "jdbc:mysql://172.17.0.2:3306/authaccess";
			Connection connection = null;
			System.out.println("Trying to connect");
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL,"root","test");

			return connection;
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}
	}
}
