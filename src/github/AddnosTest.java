package github;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddnosTest {
	
	static Addnos amt;
	static Addnos amt2;
	int num1;
	int num2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		amt=new Addnos(5,5);
		amt2=new Addnos(10,5);
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
	public void test() {
		int sum;
		sum=amt.add();
		assertEquals(10,sum);
	}
	public void test2() {
		int sum;
		sum=amt2.add();
		assertEquals(15,sum);
	}

}
