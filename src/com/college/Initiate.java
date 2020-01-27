package com.college;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Initiate {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		  StudentDao studentDao = (StudentDao) context.getBean("studDao");
		  int choice;
		  Scanner scan = new Scanner(System.in);
		  
		  
		  do {
			  System.out.println("-------------\n"
			  		+ "Options Below\n1.Add Student to DB\n2.Display Student List\n3.Date Difference\n99.Exit\n"
			  		+ "Choice Pls: ");
			  choice=scan.nextInt();
			  switch(choice) {
			  case 1: studentDao.addStudent(createStudent());
			  System.out.println("Student Added!!!");
			  break;
			  case 2: studentDao.printList();
			  break;
			  case 3: dateDifference();
			  break;
			  default: break;
			  }
			  
		  }while(choice!=99);
		  
		  
		  studentDao.printList();
	}

	private static void dateDifference() {
		// TODO Auto-generated method stub
		String startDate,endDate;
		Scanner scan = new Scanner(System.in);
		System.out.println("Start Date: ");startDate=scan.nextLine();
		System.out.println("End Date: ");endDate=scan.nextLine();
		
		LocalDate dateStart = LocalDate.parse(startDate);
		LocalDate dateEnd = LocalDate.parse(endDate);
		//Yet to add date format validation
		long days= ChronoUnit.DAYS.between(dateStart, dateEnd);
		System.out.println("Days: "+days);
		
	}

	private static Student createStudent() {
		// TODO Auto-generated method stub
		String name;int id;
		Scanner scan = new Scanner(System.in);
		System.out.println("Name: ");
		name=scan.nextLine();
		System.out.println("Roll No: ");
		id=scan.nextInt();
		Student s = new Student(name,id);
		return s;
	}

}
