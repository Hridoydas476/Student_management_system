package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;

public class StudentOperation {


    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    Scanner scanner = new Scanner(System.in);

    private Connection connection ;
    private PreparedStatement preparedStatement;
    private Statement statement ;
    private ResultSet resultSet;

    private String Q;


    void insert()
    {
        connection = DatabaseConnector.getInstance();



        try {
            Q = "INSERT INTO student_info values(?,?,?,?,?,?,?,?,?)";

            preparedStatement = connection.prepareStatement(Q);

            System.out.println("Enter student_Id: ");

            preparedStatement.setString(1,sc.readLine());

            System.out.println("Enter student_name: ");
            preparedStatement.setString(2,sc.readLine());

            System.out.println("Enter section: ");
            preparedStatement.setString(3,sc.readLine());

            System.out.println("Enter course_name: ");
            preparedStatement.setString(4,sc.readLine());

            System.out.println("Enter quiz1_marks out of 15: ");
            preparedStatement.setString(5,sc.readLine());

            System.out.println("Enter quiz2_marks out of 15: ");
            preparedStatement.setString(6,sc.readLine());

            System.out.println("Enter quiz3_marks out of 15: ");
            preparedStatement.setString(7,sc.readLine());

            System.out.println("Enter mid_marks out of 25: ");
            preparedStatement.setString(8,sc.readLine());

            System.out.println("Enter final_marks out of 40: ");
            preparedStatement.setString(9,sc.readLine());

            preparedStatement.executeUpdate();

            System.out.println("Successfully Inserted..");
            System.out.println();



        } catch (SQLException | IOException e) {
            e.printStackTrace();

            System.out.println("Error..");
        }


    }


    void read()
    {

       connection = DatabaseConnector.getInstance();


        try {
            Q = "select * from student_info";

            preparedStatement = connection.prepareStatement(Q);
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next())
            {
                System.out.println();

                System.out.println("StudentId: "+resultSet.getString(1));
                System.out.println("StudentName: "+resultSet.getString(2));
                System.out.println("Section: "+resultSet.getString(3));
                System.out.println("course_name: "+resultSet.getString(4));
                System.out.println("quiz1_marks: "+resultSet.getString(5));
                System.out.println("quiz2_marks: "+resultSet.getString(6));
                System.out.println("quiz3_marks: "+resultSet.getString(7));
                System.out.println("midMarks: "+resultSet.getString(8));
                System.out.println("finalMarks: "+resultSet.getString(9));
                System.out.println();

            }





        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("Error..");
        }


    }


    public void delete() throws IOException {

        try {
            connection = DatabaseConnector.getInstance();

            System.out.println("1-> Delete table");
            System.out.println("2-> Delete all info from table");
            System.out.println("3-> Delete selected information from table");
            System.out.println("Press any one: ");
            int option = Integer.parseInt(sc.readLine());

            if(option == 1)
            {
                Q = "DROP TABLE student_info";
                statement = connection.createStatement();
                statement.executeUpdate(Q);
                System.out.println("Successfully Deleted table");
                System.out.println();

            }
            else if(option == 2)
            {
                Q = "DELETE FROM student_info";
                statement = connection.createStatement();
                statement.executeUpdate(Q);
                System.out.println("Successfully Deleted table information");

            }
            else if(option == 3)
            {

                Q = "DELETE FROM student_info WHERE student_Id = ?";
                preparedStatement = connection.prepareStatement(Q);

                System.out.println("Enter the Student_id: ");

                preparedStatement.setString(1,sc.readLine());
                preparedStatement.executeUpdate();
                System.out.println("Successfully Delete");
                System.out.println();

            }


        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error!...Try again..");

        }

    }


        public void update() throws IOException {

        try {

            connection = DatabaseConnector.getInstance();

            System.out.println("Enter the 1st columnName: ");
            String fColumnName = sc.readLine();

            System.out.println("Enter the updated value: ");
            String update = sc.readLine();

            System.out.println("Enter the 2nd columnName: ");
            String lColumnName = sc.readLine();

            System.out.println("Enter the 2nd value: ");
            String lvalue = sc.readLine();




            Q = "UPDATE student_info SET "+fColumnName+" = ? WHERE "+lColumnName+" = ?";

            preparedStatement = connection.prepareStatement(Q);

            preparedStatement.setString(1,update);
            preparedStatement.setString(2,lvalue);

            preparedStatement.executeUpdate();

            System.out.println("Successfully updated ");
            System.out.println();


        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error! to update database...Try again..");
        }

    }





}




