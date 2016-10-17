package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@Test
	public void test() throws PersonException {
		Student Joe = new Student("bob","ross" , "bob", new GregorianCalendar(1996, 8, 17).getTime(), eMajor.COMPSI, null, "555-555-5555", null);
		Student Rick = new Student("joe", "nick", "forton", new GregorianCalendar(1996, 8, 17).getTime(), eMajor.COMPSI, null, "5555555555", null);
		Student Mike = new Student("jim", "bob", "Halpert", new GregorianCalendar(1996, 8, 17).getTime(), eMajor.PHYSICS, null, "5555555555", null);
		Student Josh = new Student("Drake","and" , "Josh", new GregorianCalendar(1996, 8, 17).getTime(), eMajor.PHYSICS, null, "555-555-5555", null);
		Student James = new Student("Austin","Joseph" , "Barron", new GregorianCalendar(1996, 8, 17).getTime(), eMajor.PHYSICS, null, "555-555-5555", null);
		Student Jake = new Student("James","Steven" , "Barron", new GregorianCalendar(1996, 8, 17).getTime(), eMajor.PHYSICS, null, "555-555-5555", null);
		Student Joanna = new Student("Courtney","stevens" , "brown", new GregorianCalendar(1996, 8, 17).getTime(), eMajor.CHEM, null, "555-555-5555", null);
		Student John = new Student("Casey","Elizabeth" , "Grzinic", new GregorianCalendar(1996, 8, 17).getTime(), eMajor.CHEM, null, "555-555-5555", null);
		Student Jacob = new Student("Tim","James" , "allen", new GregorianCalendar(1996, 8, 17).getTime(), eMajor.CHEM, null, "555-555-5555", null);
		Student Rob = new Student("frank","James" , "lampard", new GregorianCalendar(1996, 8, 17).getTime(), eMajor.CHEM, null, "555-555-5555", null);
		
	    ArrayList<Student> people = new ArrayList<Student>();
	    people.add(Joe);
	    people.add(Rick);
		people.add(Mike);
	    people.add(Josh);
	    people.add(James);
	    people.add(Jake);
	    people.add(Joanna);
	    people.add(John);
	    people.add(Jacob);
	    people.add(Rob);
	    
	    people.get(0).setMajor(eMajor.CHEM);
	    assertEquals(people.get(0).getMajor(),eMajor.CHEM);
	
}