package com.makersbnb.makersbnb;

import org.postgresql.ds.PGSimpleDataSource; // Required import
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    public void connect(String databaseURL, String username, String password) {
        PGSimpleDataSource ds = new PGSimpleDataSource();

        // You can set properties individually...
        ds.setUrl(databaseURL);
        ds.setUser(username);
        ds.setPassword(password);

        // ...or use the databaseURL directly if it's a full JDBC string
        // ds.setUrl(databaseURL);

        try (
                Connection pgDatabaseConnection = ds.getConnection();
                Statement sqlStatement = pgDatabaseConnection.createStatement();
                ResultSet queryResultSet = sqlStatement.executeQuery("SELECT * FROM users")
        ) {
            System.out.println("connected");

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());

        }

    }

}
