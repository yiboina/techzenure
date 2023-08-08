package com.techzenure.day7;
import java.util.Scanner;

public class hostlerdetails {

	 public static void main(String[] args) {
		 
	        Hosteller hosteller = getHostellerDetails(new Hosteller());

	        System.out.println("The Student Details are as follows:");
	        System.out.println("Student ID: " + hosteller.getStudentId());
	        System.out.println("Student Name: " + hosteller.getName());
	        System.out.println("Department ID: " + hosteller.getDepartmentId());
	        System.out.println("Student Gender: " + hosteller.getGender());
	        System.out.println("Student Phone No: " + hosteller.getPhone());
	        System.out.println("Hostel Name: " + hosteller.getHostelName());
	        System.out.println("Room No: " + hosteller.getRoomNumber());
	    }
		
	   public static Hosteller getHostellerDetails(Hosteller hosteller) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the Student Details & Hostel Details:");
	        System.out.print("Student ID: ");
	        hosteller.setStudentId(scanner.nextInt());
	        scanner.nextLine(); // Consume the newline character left by nextInt()

	        System.out.print("Student Name: ");
	        hosteller.setName(scanner.nextLine());
	System.out.print("Department ID: ");
	        hosteller.setDepartmentId(scanner.nextInt());
	        scanner.nextLine(); // Consume the newline character left by nextInt()

	        System.out.print("Gender[M/F]: ");
	        hosteller.setGender(scanner.nextLine());

	        System.out.print("Phone Number: ");
	        hosteller.setPhone(scanner.nextLine());

	        System.out.print("Hostel Name: ");
	        hosteller.setHostelName(scanner.nextLine());

	        System.out.print("Room Number: ");
	        hosteller.setRoomNumber(scanner.nextInt());

	        return hosteller;
	    }
}
	 class Student1 {
		protected int studentId;
		protected String name;
		protected int departmentId;
		protected String gender;
		protected String phone;

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
	}

	 class Hosteller extends Student1 {
		private String hostelName;
		private int roomNumber;

		public Hosteller() {
			
		}
		public String getHostelName() {
			return hostelName;
		}

		public void setHostelName(String hostelName) {
			this.hostelName = hostelName;
		}

		public int getRoomNumber() {
			return roomNumber;
		}

		public void setRoomNumber(int roomNumber) {
			this.roomNumber = roomNumber;
		}
	}