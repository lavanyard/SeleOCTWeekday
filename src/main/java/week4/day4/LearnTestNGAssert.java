package week4.day4;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnTestNGAssert {
	
	@Test
	public void testCase1() {
		SoftAssert assert1= new SoftAssert();
		assert1.assertEquals("test123", "test");
		assert1.assertTrue(true);
		assert1.assertAll();
		System.out.println("Testcase1");
		
	}

	@Test
	public void testCase2() {
		
		System.out.println("Testcase2");
		
	}
	
	@Test
	public void testCase3() {
		
		System.out.println("Testcase3");
		
	}
}
