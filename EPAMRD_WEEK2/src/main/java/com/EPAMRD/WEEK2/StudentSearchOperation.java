package com.EPAMRD.Week2;

import java.util.ArrayList;
/**
 * @author Alekhya Devisetty
 *
 */
public class StudentSearchOperation {
    /**
     * This method searches for the given key id in student database.
     * @param studentData has the records of the students.
     * @param key is the search key
     * @return the record if found else returns null
     */
   public StudentBean searchById(
           final ArrayList<StudentBean> studentData, final int key) {
        StudentBean temp = null;
        for (StudentBean beanobj : studentData) {
        if (beanobj.getStudentId() == key) {
               temp = beanobj;
        }
        }
       return temp;
    }
    /**
     * This method searches for the given first name in student database.
     * @param studentData has the records of the students.
     * @param key is the search key
     * @return records found.
     */
    public ArrayList<StudentBean> searchByFirstName(
              final ArrayList<StudentBean> studentData, final String key) {
        ArrayList<StudentBean> temp = new ArrayList<StudentBean>();
        for (StudentBean beanobj : studentData) {
        if (beanobj.getFirstName().equals(key)) {
              temp.add(beanobj);
        }
        }
    return temp;
    }
    /**
     * This method searches for the given last name in student database.
     * @param studentData has the records of the students.
     * @param key is the search key.
     * @return records found.
     */
    public ArrayList<StudentBean> searchByLastName(
              final ArrayList<StudentBean> studentData, final String key) {
       ArrayList<StudentBean> temp = new ArrayList<StudentBean>();
        for (StudentBean beanobj : studentData) {
            if (beanobj.getLastName().equals(key)) {
                temp.add(beanobj);
            }
        }
        return temp;
    }
    /**
     * This method searches for the given year of study in student database.
     * @param studentData  has the records of the students.
     * @param key is the search key.
     * @return records found.
     */
    public ArrayList<StudentBean> searchByYearOfStudy(
                final ArrayList<StudentBean> studentData, final int key) {
        ArrayList<StudentBean> temp = new ArrayList<StudentBean>();
        for (StudentBean beanobj : studentData) {
            if (beanobj.getYearOfStudy() == key) {
                   temp.add(beanobj);
            }
        }
        return temp;
    }

    /**
     * This method searches for the given department in student database.
     * @param studentData has the records of the students.
     * @param key is the search key.
     * @return  records found.
     */
       public ArrayList<StudentBean> searchByDepartment(
               final ArrayList<StudentBean> studentData, final String key) {
        ArrayList<StudentBean> temp = new ArrayList<StudentBean>();
        for (StudentBean beanobj : studentData) {
            if (beanobj.getDepartment().equals(key)) {
                temp.add(beanobj);
            }
        }
        return temp;
        }

}
