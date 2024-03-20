package github;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FibonacciTest {
	
	static Fibonacci obj;
	static Fibonacci obj2;
	int num;
	int first_num;
	int second_num;
	int number;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj=new Fibonacci(5);
		obj2=new Fibonacci(3);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void test1() {
		String values=obj.series();
		assertEquals("0 1 1 2 3",values);
		
	}
	@Test
	public void test2() {
		String values=obj2.series();
		assertEquals("0 1 1",values);
}
}
