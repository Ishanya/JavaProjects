package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstDemo {
	
//--------------------------------------jupiter-----------------------------------------
	

	/* @BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}*/
	
//	------------------------------junit--------------------------------------------------
	
	@BeforeClass
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterClass
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	@Before
	void setUp() throws Exception {
		System.out.println("BeforeEach");
	}

	@After
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}

	@Test
	void test() {
		System.out.println("Not yet implemented");
	}
	
	@Test
	void welcome() {
		System.out.println("welcome");
	}

}
