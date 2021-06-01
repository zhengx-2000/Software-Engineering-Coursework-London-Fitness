import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Title         : SignUp_test.java
 * Description   : This class is used to test the user input in sign up page.
 * @author       : Yuheng Li
 * @since        : 20/5/2021
 */
class SignUp_test {
	
	@Test
	void test1() {
		String u="1hwwwi"; 
		String p="123"; 
		String pc="123"; 
		String ph="12123"; 
		String em="123@qq.com";
		SignUp user1=new SignUp();
		user1.sex = 1;
		user1.setInfo(u, p, pc, ph, em);
		user1.check();
		assertEquals(1,user1.getAns());
	}
	
	@Test
	void test2() {
		String u="aaa";
		String p="123"; 
		String pc="123"; 
		String ph="12345";
		String em="123@qq.com";
		SignUp user2=new SignUp();
		user2.sex = 2;
		user2.setInfo(u, p, pc, ph, em);
		user2.check();
		assertEquals(0,user2.getAns());
	}
	
	@Test
	void test3() {
		String u="11"; 
		String p="12232"; 
		String pc="123"; 
		String ph="1245";
		String em="1987568@qq.com";
		SignUp user3=new SignUp();
		user3.sex = 3;
		user3.setInfo(u, p, pc, ph, em);
		user3.check();
		assertEquals(0,user3.getAns());
	}
	
	@Test
	void test4() {
		String u="444";
		String p="";
		String pc="";
		String ph="12451";
		String em="44556@bupt.com";
		SignUp user4=new SignUp();
		user4.sex = 1;
		user4.setInfo(u, p, pc, ph, em);
		user4.check();
		assertEquals(0,user4.getAns());
	}
	
	@Test
	void test5() {
		String u="555";
		String p="122334";
		String pc="122334";
		String ph="123";
		String em="123@456.789";
		SignUp user5=new SignUp();
		user5.sex = 2;
		user5.setInfo(u, p, pc, ph, em);
		user5.check();
		assertEquals(0,user5.getAns());
	}
	
	@Test
	void test6() {
		String u="666";
		String p="6666";
		String pc="6666";
		String ph="666666";
		String em="666";
		SignUp user6=new SignUp();
		user6.sex = 3;
		user6.setInfo(u, p, pc, ph, em);
		user6.check();
		assertEquals(0,user6.getAns());
	}

}
