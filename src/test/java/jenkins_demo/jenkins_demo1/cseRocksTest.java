package jenkins_demo.jenkins_demo1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cseRocksTest {
	cseRocks cal=new cseRocks();
	
	@Test
	void test() {
		int result = cal.add(2, 3);
		assertEquals(5,result);
	}
	void test2() {
		int result = cal.mul(2, 3);
		assertEquals(5,result);
	}
	

	
	

}
