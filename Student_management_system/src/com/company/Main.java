package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        StudentOperation studentOperation = new StudentOperation();

        System.out.println();

        System.out.println("          **************WELCOME TO STUDENT MANAGEMENT SYSTEM**************         ");
        System.out.println();


        while (true)
        {
            System.out.println("1-> Add student information");
            System.out.println("2-> Show student information");
            System.out.println("3-> Delete student information");
            System.out.println("4-> Update student information");
            System.out.println("0-> Exit");

            System.out.println("press anyone: ");
            int n = Integer.parseInt(sc.readLine());  //user input

            if(n == 1)
            {
                studentOperation.insert();
            }
            else if(n == 2)
            {
                studentOperation.read();
            }
            else if(n == 3)
            {
                studentOperation.delete();
            }
            else if(n == 4)
            {
                studentOperation.update();
            }
            else if(n == 0)
            {
                System.out.println("Byee..");
                break;
            }

        }

    }
}
