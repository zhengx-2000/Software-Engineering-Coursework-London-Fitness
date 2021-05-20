import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class SignIn_test {

	@Test
	void test() {
		IDcheck s1=new IDcheck("aaa","123");
		assertEquals(1,s1.Check());
		
		IDcheck s2=new IDcheck("aaa1","123");
		assertEquals(0,s2.Check());
		
		IDcheck s3=new IDcheck("aaaj","1223");
		assertEquals(0,s3.Check());
		
		IDcheck s4=new IDcheck("aaa","12333");
		assertEquals(0,s4.Check());
		
		IDcheck s5=new IDcheck("eee","123");
		assertEquals(1,s5.Check());
		
		IDcheck s6=new IDcheck("","");
		assertEquals(0,s6.Check());
	}
	
	

}
