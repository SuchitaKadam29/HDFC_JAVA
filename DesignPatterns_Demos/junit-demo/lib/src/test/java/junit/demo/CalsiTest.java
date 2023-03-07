package junit.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalsiTest {
	
	
		static Calsi cal;
		
		@BeforeAll
		public static void beforeAll() {
			
			cal = new Calsi();
			
			System.out.println("BeforeAll called...");
			
		}
		
		@AfterAll
		public static void afterAll() {
			
			System.out.println("AfterAll called..");
			
		}
		
		
		
		@BeforeEach
		public void  before() {
			
			System.out.println("Before Each");
			
		}
		
		@AfterEach
		public void after() {
			
			System.out.println("After Each");
			
		}
		
	
	

	@Test
	void testAdd() {
		
		
		
		int actual = cal.add(5, 5);
		
		assertEquals(10, actual);
		
		System.out.println("add tested");
		
		
	}
	
	@Test
	@DisplayName("Substraction Test")
	void  testSub() {
		
		int actual =	cal.sub(10,5);
		
		assertNotEquals(1, actual);
		
		assertTrue(actual > 0);
		
		System.out.println("sub tested");
		
	}
	
	
	
	@Test
	//@Disabled
	void  testMul() {
		
		int actual = cal.mul(3, 3);
		
			assertEquals(9, actual);
			
			System.out.println("mul tested");
		
	}
	

}
