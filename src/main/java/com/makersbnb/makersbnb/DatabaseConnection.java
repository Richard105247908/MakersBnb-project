package com.makersbnb.makersbnb;

import org.postgresql.ds.PGSimpleDataSource; // Required import
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection connect() throws SQLException {
        PGSimpleDataSource ds = new PGSimpleDataSource();

        String databaseURL="jdbc:postgresql://localhost:5432/makersbnb";
        String username="postgres";
        String password="******";


        // You can set properties individually...
        ds.setUrl(databaseURL);
        ds.setUser(username);
        ds.setPassword(password);

        Connection pgDatabaseConnection = ds.getConnection();

        return pgDatabaseConnection;

    }
}