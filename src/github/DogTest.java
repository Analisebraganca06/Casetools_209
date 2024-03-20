package github;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DogTest {
	static Dog obj;
	String name;
	String breed;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj=new Dog("Bingo","sausage dog");
		
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
		name=obj.display();
		assertEquals("Bingo", name);
	
		breed=obj.display2();
		assertEquals("sausage dog", breed);
		
		String d =("Mill");
		obj.setter(d);
		name=obj.display();
		assertEquals(d,name);
		
	}

	
	
	

}
