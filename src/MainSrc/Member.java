package MainSrc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Member {
	
	private int x;
	private int y;
	
	public int add(int x , int y) {
		return x+y;
	}
	
	public int mul(int x , int y) {
		return x*y;
	}
	

	//2020/03/17 jeayeon
	@Test
	public void ttt() {
		assertEquals(add(10,10),mul(10,10));
		System.out.println("hi");
	}

}
