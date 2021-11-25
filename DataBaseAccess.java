package com.tw;

import java.util.Scanner;

public class DataBaseAccess {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StudentRecord studentRecord = new StudentRecord();

        System.out.println(" Enter your designation: ");
        String designation = scan.next();

        if (designation.equalsIgnoreCase("admin")) {
            System.out.println("Press 1 if you want to add student \n Press 2 if you want to remove student \n Press 3 if you want to update student details \n Press 4 if you want to see details of all students");

            int operation = scan.nextInt();
            if (operation == 1) {

                String name = scan.next();
                int rollNo = scan.nextInt();
                studentRecord.addNewStudent(name, rollNo);

            } else if (operation == 2) {

                int rollNo = scan.nextInt();
                studentRecord.deleteByRollNo(rollNo);

            } else if (operation == 3) {

                String name = scan.next();
                int rollNo = scan.nextInt();
                studentRecord.updateByRollNo(rollNo, name);
            } else if (operation == 4) {
                studentRecord.showAllStudents();

            }
          
        } else {

            System.out.println("You don't have access to edit record. Press 1 if you want to see details of all students. Press 2 if you want to exit");

            int operation = scan.nextInt();

            if (operation == 1) {
                studentRecord.showAllStudents();

            } else
                System.out.println("See you next time!");
        }
    }
}
