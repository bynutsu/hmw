package com.example.georgenutsubidze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
    Connection c;
    private static final String URL ="jdbc:mysql://localhost/mysql";
    private static final String user="root";
    private static final String password="";
//
    private static Connection connection;
    private static Statement statement;

    static {

        try {
            connection = DriverManager.getConnection(URL, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Statement getStatement() {
        if(statement == null) {
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return statement;
    }

}

