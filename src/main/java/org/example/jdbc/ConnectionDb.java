package org.example.jdbc;

import java.sql.*;

public class ConnectionDb {
    private static final String url = "jdbc:postgresql://localhost:5432/computer_db";
    private static final String username = "postgres";
    private static final String password = "5657";

    public static ResultSet getConnection(String tableName) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            return statement.executeQuery("select * from " + tableName);
        } catch (SQLException throwable) {
            return null;
        }
    }
}
