import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *Title :SignIn_test_TDD.java
 *Description :This class is used to test the user input in sign in page.
 *@author :Yuheng Li
 *@since :20/5/2021
 */
class SignIn_test {

	@Test
	void test1() {
		IDcheck s1=new IDcheck("aaa","123");
		assertEquals(1,s1.Check());
	}
	
	@Test
	void test2() {
		IDcheck s2=new IDcheck("aaa1","123");
		assertEquals(0,s2.Check());
	}
	
	@Test
	void test3() {
		IDcheck s3=new IDcheck("aaaj","1223");
		assertEquals(0,s3.Check());
	}
	
	@Test
	void test4() {
		IDcheck s4=new IDcheck("aaa","12333");
		assertEquals(0,s4.Check());
	}
	
	@Test
	void test5() {
		IDcheck s5=new IDcheck("eee","123");
		assertEquals(1,s5.Check());
	}
	
	@Test
	void test6() {
		IDcheck s6=new IDcheck("","");
		assertEquals(0,s6.Check());
	}
}
