package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



    abstract class DatabaseConnector {

        private static Connection connection = null;

        static Connection getInstance()
        {
            if(connection == null) {
                try {
                    connection = DriverManager.getConnection("jdbc:mysql://localhost/student_management_system" ,"root","");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return connection;
        }


    }


