package TestCode;


import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import MainSrc.Member;

public class Testmember {
	Member newMember;
	Member oldMember;
	
	
	@Test
	public void test1() {
//		System.out.println(newMember);
//		System.out.println(oldMember);
//		assertEquals(newMember, oldMember);
//		assertNull(newMember);
//		assertSame(newMember, oldMember);
		if(newMember ==null) {
			System.out.println("ok");
		}
		assertTrue(newMember ==null);
		
		
	}
	@Before
	public void test2() {
		newMember = new Member();
		oldMember = newMember;
		
	}
	//독립된 단위 테스트를 하기 위해서는 라이브러리(jUnit)를 추가 한다
	// JUnut 이란??
	//독립된 단위 테스트를 지원해주는 프레임워크
	//사용되는 어노테이션
	/*
	 * @Test   : @Test가 선언된 메소드가 테스트를 수행한다.
	 * @Ignore : @Test를 실행하지 않는다.
	 * @Before : @Test가 선언된 메소드가 실행되기 전에 수행.
	 */
	
	/*
	 *  sysout으로는 콘솔에 결과를 출력하지만
	 *  단정(assert)메서드로 테스트의 결과를 판별한다.
	 *  예를들어 asserEquals(예상값, 실제값)
	 *  위의 단정 메서드는 예상값과 실제값이 일치하면 성공,
	 *  일치하지 않으면 실패
	 */
	/*
	 *  jUnit 메소드
	 *  assertEquals(a,b) - 객체 또는 값이 일치하는가?
	 *  assertArratEquals(a,b) - 배열의 값이 일치하는가?
	 *  assertSame(a,b) - 같은 객체인가?
	 *  assertTrue(a) - 조건이 참인가?
	 *  assertNotNULL(a) - 객체가 null이 아닌가?
	 *  assertNull(a) - 객체가 null인가?
	 */

}
