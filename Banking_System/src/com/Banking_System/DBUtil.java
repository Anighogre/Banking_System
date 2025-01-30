package com.Banking_System;

import java.sql.Connection; //Represents a connection to a database.
import java.sql.DriverManager; //Manages JDBC drivers and establishes connections.
import java.sql.SQLException; //Handles SQL-related exceptions (errors).

public class DBUtil {
	//Defines a constant string URL containing the JDBC URL for the MySQL database.
    private static final String URL = "jdbc:mysql://localhost:3306/banking_system"; //JDBC protocol for MySQL,Database is hosted locally on the same machine,Default MySQL port.
    private static final String USER = "root";
    private static final String PASSWORD = "Anirudh2002@#";

    // Indicates that this method might throw an SQL exception if the connection fails.
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD); //to establish a database connection using url,user,password
    }
}

