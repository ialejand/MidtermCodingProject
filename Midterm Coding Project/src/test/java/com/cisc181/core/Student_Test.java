package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import com.cisc181.eNums.eMajor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test() {
		ArrayList<String,Date,eMajor> jim = new ArrayList<String, Date, eMajor>("Jim", "Bryan", "Green", Date.07/02/1994,  eMajor.BUSINESS, "999 Main Street", "(302)-950-7891", "jbg1@udel.edu");
		
		ArrayList<String,Date,eMajor> john = new ArrayList<String, Date, eMajor>("John", "Breen", "Goldsmith", Date.10/04/1996, eMajor.NURSING, "444 Main Street", "(302)-141-2436", "jbg2@udel.edu");
		
		ArrayList<String,Date,eMajor> jessica = new ArrayList<String, Date, eMajor>("Jessica", "Brook", "Gray", Date.4/10/1997, eMajor.COMPSI, "333 Main Street", "(302)-235-8570", "jbg3@udel.edu");
		
		ArrayList<String,Date,eMajor> jack = new ArrayList<String, Date, eMajor>("Jack", "Benjamin", "Gibson", Date.11/07/1997, eMajor.CHEM, "222 Main Street", "(302)-896-4249", "jbg4@udel.edu");
		
		ArrayList<String,Date,eMajor> james = new ArrayList<String, Date, eMajor>("James", "Bernard", "Gill", Date.01/03/1993, eMajor.PHYSICS, "111 Main Street", "(302)-792-0146", "jbg5@udel.edu");
		
		ArrayList<String,Date,eMajor> julia = new ArrayList<String, Date, eMajor>("Julia", "Belle", "Garcia", Date.02/07/1996, eMajor.BUSINESS, "100 Main Street", "(302)-950-7891", "jbg6@udel.edu");
		
		ArrayList<String,Date,eMajor> jason = new ArrayList<String, Date, eMajor>("Jason", "Blair", "Galvin", Date.04/10/1997, eMajor.CHEM, "555 Main Street", "(302)-141-2436", "jbg7@udel.edu");
		
		ArrayList<String,Date,eMajor> jake = new ArrayList<String, Date, eMajor>("Jake", "Benadict", "Godwin", Date.05/04/1995, eMajor.PHYSICS, "666 Main Street", "(302)-235-8570", "jbg8@udel.edu");
		
		ArrayList<String,Date,eMajor> jennifer = new ArrayList<String, Date, eMajor>("Jennifer", "Brooklyn", "Gerard", Date.07/11/1997, eMajor.NURSING, "777 Main Street", "(302)-896-4249", "jbg9@udel.edu");
		
		ArrayList<String,Date,eMajor> jesse = new ArrayList<String, Date, eMajor>("Jesse", "Becca", "Ginty", Date.05/03/1995, eMajor.BUSINESS, "888 Main Street", "(302)-792-0146", "jbg10@udel.edu");
		
	}	

}