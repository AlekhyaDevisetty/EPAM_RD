package com.EPAMRD.Week2;


import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Alekhya Devisetty
 *
 */
public class StudentMain {
    /**
     * This method prints all the fields in a student record.
     * @param student is a single student record
     */
    public void displayStudentRecords(final StudentBean student) {

               System.out.println(student.getStudentId() + "\t"
                        + student.getFirstName()
                        +  "\t" + student.getLastName()
                        + "\t" + student.getYearOfStudy()
                        + "\t" + student.getDepartment());

    }
    /**
     * Main method.
     * @param args are the command line arguments.
     */
    public static void main(final String[] args) {
          File fileobj = new File(
                      "F:\\STUdy\\Wipro_Projects\\EPAM_WEEK2"
                      + "\\src\\com\\EPAMRD\\Week2\\Student_Data.txt");
          Scanner scannerobj = null;
        try {
            scannerobj = new Scanner(fileobj);
        } catch (Exception e) {
              System.out.println(e);
        }

        ArrayList<StudentBean> studentData = new ArrayList<StudentBean>();

        while (scannerobj.hasNextLine()) {
            StudentBean student = new StudentBean();
            String row = scannerobj.nextLine();
            String[] fieldValues = row.split(",");
            student.setStudentId(Integer.parseInt(fieldValues[0]));
            student.setFirstName(fieldValues[1]);
            student.setLastName(fieldValues[2]);
            student.setYearOfStudy(Integer.parseInt(fieldValues[3]));
            student.setDepartment(fieldValues[4]);

            studentData.add(student);
        }

        System.out.println("Welcome to Student Management System");
        System.out.println("Please enter your choice");
        System.out.println("1. Search the Data \n 2. Sort the Data");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int choice = sc.nextInt();
        StudentMain mainobj = new StudentMain();

        switch (choice) {
            case 1 :
            StudentSearchUtility suobj = new StudentSearchUtility();
            suobj.searchUtility(studentData);
            break;
            case 2 :
            System.out.println("Select any sort option");
            System.out.println("1. Sort by Id \n 2. Sort by First Name \n"
            + " 3. Sort by Last Name "
            + "4. Sort by Year of Study \n "
            + "5. Sort by Department");
            int sortChoice = sc.nextInt();

            switch (sortChoice) {
            case 1:
                   Collections.sort(studentData,
                             StudentSortOperation.studentIdComparator);

            break;

            case 2 :
                    Collections.sort(studentData,
                              StudentSortOperation.studentFirstNameComparator);
            break;


            case 3 :
                    Collections.sort(studentData,
                            StudentSortOperation.studentLastNameComparator);

            break;

            case 4 :
                    Collections.sort(studentData,
                                StudentSortOperation.studentYearComparator);
            break;

            case 5:
                    Collections.sort(studentData,
                           StudentSortOperation.studentDepartmentComparator);
            break;

           default :
                 System.out.println("Please select a valid option");
               break;


       }
            for (StudentBean sb : studentData) {
                mainobj.displayStudentRecords(sb);


         sc.close();
         sc1.close();

    }
    break;
    default :
        System.out.println("Please enter a valid option");
        break;
   }
}
}
