package com.makersbnb.makersbnb.repositories;


import com.makersbnb.makersbnb.DatabaseConnection;
import com.makersbnb.makersbnb.models.Space;

import java.sql.Date;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SpaceRepository {

    public List<Space> findAll() throws SQLException {
        Connection spacesTable = DatabaseConnection.connect();
        List<Space> spaceList = new ArrayList<>();

        try (spacesTable;
             Statement sqlStatement = spacesTable.createStatement();
             ResultSet queryResultSet = sqlStatement.executeQuery("SELECT * FROM spaces");
        ) {
            System.out.println("Connected");
            while (queryResultSet.next()) {
                System.out.println("User ID " + queryResultSet.getInt("id"));
                spaceList.add(new Space
                        (queryResultSet.getInt("id"),
                                queryResultSet.getString("name"),
                                queryResultSet.getString("description"),
                                queryResultSet.getDouble("price_per_night"),
                                queryResultSet.getDate("available_from").toLocalDate(),
                                queryResultSet.getDate("available_to").toLocalDate(),
                                queryResultSet.getInt("owner_id")));
            }


            return spaceList;
        }
    }

    public void save(Space space) throws SQLException{
        DatabaseConnection.connect();

        try(){
            
        }

    }
}


