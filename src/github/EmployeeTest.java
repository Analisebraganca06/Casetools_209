package github;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {
	
	static Employee emp;
	String name,jobtitle;
	int HRA,basic_salary;
	int DA,total_salary;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		emp=new Employee("Analise ","Human Resource Manage",5000);
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
		DA=emp.getDA();
		assertEquals(500,DA);
		
	}

}
