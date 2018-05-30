import static org.junit.Assert.*;

import org.junit.Test;


public class TestThisClassTest {

	@Test
	public void test() {
		//zeros are frequently problematic
		assertTrue(TestThisClass.isInsideUnitCircle(0, 0));
		//test value outside circle
		assertFalse(TestThisClass.isInsideUnitCircle(25, 25));
		//test value on border of circle
		assertFalse(TestThisClass.isInsideUnitCircle(0, 1));
		//test value near edge but inside
		assertTrue(TestThisClass.isInsideUnitCircle(.707, .707));
		//test value near edge but outside
		assertFalse(TestThisClass.isInsideUnitCircle(.7072, .7072));
		//could also test other quadrants
	}

}
