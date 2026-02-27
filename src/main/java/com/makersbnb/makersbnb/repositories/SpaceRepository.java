package com.makersbnb.makersbnb.repositories;


import com.makersbnb.makersbnb.DatabaseConnection;
import com.makersbnb.makersbnb.models.Space;
import org.postgresql.ds.PGSimpleDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class SpaceRepository {
   public List<Space> findAll() throws SQLException {
        DatabaseConnection.connect();

       return List.of();
   }
    }


