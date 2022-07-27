package org.student;

import week3.Day1Assign.Students;

public class Student {

	//Methods of Students class getStudentInfo method is being overloaded
		public void getStudentInfo(String StudentId)
		{
			System.out.println("StudentId: " + StudentId);
			
		}
		public void getStudentInfo(String StudentId,String StudentName)
		{
			System.out.println("StudentId and Name: " + StudentId + " " +StudentName);
			
		}
		public void getStudentInfo(String email,long Phonenumber)
		{
			System.out.println("Email and Phone Number: " + email + " " +Phonenumber);
			
		}

		public static void main(String[] args) {
			
			Students objStudents=new Students();
			objStudents.getStudentInfo("95146789");
			objStudents.getStudentInfo("95146789", "Firdouse");
			objStudents.getStudentInfo("firdouse1910@gmail.com", 99167892);

		}

	}
	


