package com.EPAMRD.Week2;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Alekhya Devisetty
 *
 */
public class StudentSearchUtility {
    /**
     * Scanner object.
     */
    Scanner sc = new Scanner(System.in);
    /**
     * Scanner object.
     */
    Scanner sc1 = new Scanner(System.in);
    /**
     * MainClass object.
     */
    StudentMain mainobj = new StudentMain();
     /**
     * This method provides a utility for search mechanism.
     * @param studentData has all the student records.
     */
    public void searchUtility(final ArrayList<StudentBean> studentData) {
    System.out.println("Select any search option");
    System.out.println("1. Search by Id \n 2. Search by First Name \n"
            + " 3. Search by Last Name "
            + "4. Search by Year of Study \n 5. Search by Department");
    int searchChoice = sc.nextInt();
    StudentSearchOperation searchobj = new StudentSearchOperation();


    switch (searchChoice) {

    case 1:
        System.out.println("Enter student id number");
        int id = sc.nextInt();
        StudentBean studentrecord = searchobj.searchById(studentData, id);
        if (studentrecord == null) {
             System.out.println("No records found");
        } else {
           mainobj.displayStudentRecords(studentrecord);
        }
        break;

        case 2:
        System.out.println("Enter student's first name");
        String firstName = sc1.nextLine();
        ArrayList<StudentBean> studentrecords =
                searchobj.searchByFirstName(studentData, firstName);
        if (studentrecords.size() == 0) {
             System.out.println("No records found");
        }
        for (StudentBean record : studentrecords) {
               mainobj.displayStudentRecords(record);
        }
        break;

        case 3:
        System.out.println("Enter student's last name");
        String lastName = sc1.nextLine();
        ArrayList<StudentBean> studentrecords1 =
               searchobj.searchByLastName(studentData, lastName);
        if (studentrecords1.size() == 0) {
             System.out.println("No records found");
        }
        for (StudentBean record : studentrecords1) {
             mainobj.displayStudentRecords(record);
        }
      break;

      case 4:
        System.out.println("Enter student's year of study");
        int year = sc.nextInt();
        ArrayList<StudentBean> studentrecords2 =
                   searchobj.searchByYearOfStudy(studentData, year);
        if (studentrecords2.size() == 0) {
            System.out.println("No records found");
        }
        for (StudentBean record : studentrecords2) {
            mainobj.displayStudentRecords(record);
        }
        break;

      case 5:
        System.out.println("Enter student's department");
        String key = sc1.nextLine();
        ArrayList<StudentBean> studentrecords3 =
                 searchobj.searchByDepartment(studentData, key);

        if (studentrecords3.size() == 0) {
            System.out.println("No records found");
        }
        for (StudentBean record : studentrecords3) {
           mainobj.displayStudentRecords(record);
        }
        break;
      default :
        System.out.println("Please choose a valid option");
        break;


     }

}

}

