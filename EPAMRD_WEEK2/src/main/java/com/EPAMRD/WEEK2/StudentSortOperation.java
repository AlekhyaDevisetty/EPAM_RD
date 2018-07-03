package com.EPAMRD.Week2;

import java.util.Comparator;
/**
 *
 * @author Alekhya Devisetty
 *
 */
public class StudentSortOperation {

       public static Comparator<StudentBean> studentIdComparator = 
                                             new Comparator<StudentBean>() {

        public int compare(final StudentBean s1, final StudentBean s2) {
          int studentName1 = s1.getStudentId();
          int studentName2 = s2.getStudentId();
          return studentName1 - studentName2;

       } };


	public static Comparator<StudentBean> studentFirstNameComparator = 
                                          new Comparator<StudentBean>() {

		public int compare(final StudentBean s1, final StudentBean s2) {
		   String studentName1 = s1.getFirstName().toUpperCase();
		   String studentName2 = s2.getFirstName().toUpperCase();

		   return studentName1.compareTo(studentName2);

	    }};
	public static Comparator<StudentBean> studentLastNameComparator = new Comparator<StudentBean>() {

		public int compare(StudentBean s1, StudentBean s2) {
			 String StudentName1 = s1.getLastName().toUpperCase();
			 String StudentName2 = s2.getLastName().toUpperCase();

			 return StudentName1.compareTo(StudentName2);

		 }};    
	public static Comparator<StudentBean> studentYearComparator = new Comparator<StudentBean>() {

		public int compare(StudentBean s1, StudentBean s2) {
			  int StudentName1 = s1.getYearOfStudy();
			  int StudentName2 = s2.getYearOfStudy();

			  return StudentName1-StudentName2;

		}};

	 public static Comparator<StudentBean> studentDepartmentComparator = new Comparator<StudentBean>() {

		public int compare(StudentBean s1, StudentBean s2) {
			  String StudentName1 = s1.getDepartment().toUpperCase();
			  String StudentName2 = s2.getDepartment().toUpperCase();

			  return StudentName1.compareTo(StudentName2);

		}};
}
