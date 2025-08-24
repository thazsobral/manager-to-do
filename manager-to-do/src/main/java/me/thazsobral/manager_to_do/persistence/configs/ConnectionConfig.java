package me.thazsobral.manager_to_do.persistence.configs;

import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor(access = PRIVATE)
public class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        var url = "jdbc:mysql://localhost/board";
        var user = "board";
        var password = "board";

        var connection = DriverManager.getConnection(url, user, password);

        connection.setAutoCommit(false);

        return connection;
    }
}
