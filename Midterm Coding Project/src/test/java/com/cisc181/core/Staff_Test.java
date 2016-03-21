package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import com.cisc181.core.Staff;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

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
		
		Staff bob = new Staff<"Bob", "Brendon", "Nicholas", "02/07/1956", "625 Main Street", "(302)-950-7891", "BNicolas@udel.edu", "9-5", 5, 75000, "03/02/2016", 0>;
		
		Staff linda = new Staff("Linda", "Jean", "Michaels", "04/10/1967", "721 Main Street", "(302)-141-2436", "LMichaels@udel.edu", "9-5", 7, 71000, "03/02/2016", eTitle(1));
		
		Staff louise = new Staff("Louise", "Gloria", "Dashwood", "05/04/1985", "285 Main Street", "(302)-235-8570", "LDashwood@udel.edu", "9-5", 3, 72000, "03/02/2016", eTitle(2));
		
		Staff gene = new Staff("Gene", "Elias", "Jacobson", "07/11/1997", "901 Main Street", "(302)-896-4249", "GJacobson@udel.edu", "9-5", 2, 69000, "03/02/2016", eTitle(0));
		
		Staff tina = new Staff("Tina", "River", "Teal", "01/03/1945", "147 Main Street", "(302)-792-0146", "TTeal@udel.edu", "9-5", 1, 68000, "03/02/2016", eTitle(0));
		
		public double getAverage() {
			Object sum = bob(9) + linda(9) + louise(9) + gene(9) + tina(9);
			average = 0;
			getAverage = sum / 5;
			assert(average.getAverage == 72000);
		}
	}	

}
