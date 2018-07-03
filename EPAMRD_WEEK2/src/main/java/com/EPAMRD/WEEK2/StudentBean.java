package com.EPAMRD.Week2;

/**
 * @author Alekhya Devisetty
 *
 */
public class StudentBean {
    /**
    * instance variable studentId.
    */
    private int studentId;
    /**
     * instance variable firstname.
     */
    private String firstName;
    /**
     * instance variable lastname.
     */
    private String lastName;
     /**
     * instance variable year of study.
     */
    private int yearOfStudy;
     /**
     * instance variable department.
     */
     private String department;

     /**
     ** This method gets the student Id.
     ** @return student Id.
     **/
    public int getStudentId() {
		return studentId;
	}
	/**
	 ** This method sets student's Id.
	 * @param studentId is assigned to student's Id of class.
	 **/

	public final void setStudentId(final int studentId) {
		this.studentId = studentId;
	}
	/**
	 ** This method sets the student name.
	 * @return first name of student.
	 **/
	public String getFirstName() {
		return firstName;
	}
	/**
	 ** This method sets student's first name.
	 * @param firstName is assigned to firstname of class.
	 **/
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	/**
	 ** This method sets the student name.
	 * @return first name of student.
	 **/
	public String getLastName() {
		return lastName;
	}
	/**
	 ** This method sets the student's lastname.
	 * @param lastName is assigned to student's LastName of class.
	 **/
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	/**
	 ** This method sets the student name.
	 * @return first name of student.
	 **/
	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(final int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	/**
	 ** This method sets the student name.
	 * @return first name of student.
	 **/
	public String getDepartment() {
		return department;
	}

	public void setDepartment(final String department) {
		this.department = department;
	}

}
