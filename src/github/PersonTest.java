package github;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {
	static Person obj ;
	String name;
	int age;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj=new Person("Symone",20);
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
	public void testname() {
		String name=obj.getname();
		assertEquals("Symone",name);
	}
		
	@Test
	public void testage() {
		age=obj.age;
		assertEquals(20,age);	
	}
	public void test() {
		obj.setage(10);
		int age=obj.getage();
		assertEquals(10,age);
	}
	
	
	

}
