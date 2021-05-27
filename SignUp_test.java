/**
 * Title        : SignUp_test.java
 * Description  : This class is used to test the user input in sign up page.
 * @author      : Yuheng Li
 * @date        : 20/5/2021
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SignUp_test {

	@Test
	void test() {
		int unique=0;
		String PassWord="123";
		String PassWordCon="123";
		UniqueID i=new UniqueID("ooo");
		assertEquals(0,i.Check());		
		
		if(PassWord==PassWordCon) unique=1;
		assertEquals(1,unique);	
		
		
		
		int unique1=0;
		String PassWord1="123";
		String PassWordCon1="123";
		UniqueID i1=new UniqueID("aaa");
		assertEquals(1,i1.Check());		
		
		if(PassWord1==PassWordCon1) unique1=1;
		assertEquals(1,unique1);	
		
		
		int unique2=0;
		String PassWord2="123";
		String PassWordCon2="1234";
		UniqueID i2=new UniqueID("nnn");
		assertEquals(0,i2.Check());		
		
		if(PassWord2==PassWordCon2) unique2=1;
		assertEquals(0,unique2);	
		
	}

}
