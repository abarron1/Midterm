package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	
	public void test() throws PersonException {
		Staff Mike = new Staff("Mike", "Bobby", "Joey", new GregorianCalendar(1994, 8, 17).getTime(), "302 David Hollowell", "55-555-5555", "Mike@udel", "never", 1, 1000, null, null);
		Staff Joe = new Staff(null, null, null, new GregorianCalendar(1995, 8, 17).getTime(), null, "555-555-5555", null, null, 2, 2000, null, null);
		Staff Bob = new Staff(null, null, null, new GregorianCalendar(1996, 8, 17).getTime(), null, "555-555-5555", null, null, 3, 3000, null, null);
		Staff Sally = new Staff(null, null, null, new GregorianCalendar(1800, 8, 17).getTime(), null, "555-555-5555", null, null, 4, 4000, null, null);
		Staff Ally = new Staff(null, null, null, new GregorianCalendar(1997, 8, 17).getTime(), null, "55-555-5555", null, null, 5, 5000, null, null);
		
    ArrayList<Staff> people = new ArrayList<Staff>();
    people.add(Mike);
    people.add(Joe);
    people.add(Bob);
    people.add(Sally);
    people.add(Ally);
    
    
    assertEquals((people.get(0).getSalary() + people.get(1).getSalary() + people.get(2).getSalary() + people.get(3).getSalary() + people.get(4).getSalary())/5,3000)
}
