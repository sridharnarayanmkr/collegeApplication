package com.college;

import java.util.ArrayList;

public class StudentDaoImpl implements StudentDao{
	ArrayList<Student> list = new ArrayList<Student>();
	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		list.add(s);
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		for(Student s:list) {
			s.printDetails();
		}
	}

	@Override
	public void printRange(int num) {
		// TODO Auto-generated method stub
		list.stream().filter(x->x.rollNo>num).forEach(x->System.out.print(x));
	}

}
