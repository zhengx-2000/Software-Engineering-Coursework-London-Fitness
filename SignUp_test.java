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
	void test() {
		String u="1hwwwi"; 
		String p="123"; 
		String pc="123"; 
		String ph="12123"; 
		String em="123qq.com";
		SignUp test=new SignUp();
		test.setInfo(u, p, pc, ph, em);
		assertEquals(0,test.getAns());
		
		u="lhl"; 
		p="123"; 
		pc="123"; 
		ph="123"; 
		em="123@qq.com";
		SignUp test2=new SignUp();
		test.setInfo(u, p, pc, ph, em);
		assertEquals(0,test2.getAns());	
		
		u="11"; 
		p="12232"; 
		pc="123"; 
		ph="12"; 
		em="123";
		SignUp test1=new SignUp();
		test.setInfo(u, p, pc, ph, em);
		assertEquals(0,test1.getAns());		
		
	
	}

}
