package com.makersbnb.makersbnb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MakersbnbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MakersbnbApplication.class, args);

        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.connect("jdbc:postgresql://localhost:5432/makersbnb", "postgres", "Kidbuu777");
    }

}
