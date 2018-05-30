package recur;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Tests the SierpinskiTriangle class.
 * 
 * @author Curt Clifton. Created Oct 29, 2009.
 */
public class SierpinskiTriangleTest {
	/**
	 * The allowed difference between expected and actual values.
	 */
	private static final double EPSILON = 0.00001;

	/**
	 * Tests {@link SierpinskiTriangle#shadedArea()}.
	 */
	@Test
	public void testShadedArea1() {
		SierpinskiTriangle t = new SierpinskiTriangle(1);
		assertEquals(0.32476, t.shadedArea(), EPSILON);
	}

	/**
	 * Tests {@link SierpinskiTriangle#shadedArea()}.
	 */
	@Test
	public void testShadedArea2() {
		SierpinskiTriangle t = new SierpinskiTriangle(2);
		assertEquals(0.97428, t.shadedArea(), EPSILON);
	}

	/**
	 * Tests {@link SierpinskiTriangle#shadedArea()}.
	 */
	@Test
	public void testShadedArea4() {
		SierpinskiTriangle t = new SierpinskiTriangle(4);
		assertEquals(2.92284, t.shadedArea(), EPSILON);
	}

	/**
	 * Tests {@link SierpinskiTriangle#shadedArea()}.
	 */
	@Test
	public void testShadedArea8() {
		SierpinskiTriangle t = new SierpinskiTriangle(8);
		assertEquals(8.76851, t.shadedArea(), EPSILON);
	}

	/**
	 * Tests {@link SierpinskiTriangle#shadedArea()}.
	 */
	@Test
	public void testShadedAreaN() {
		SierpinskiTriangle t = new SierpinskiTriangle(4611686018427387904l);
		double ratio = t.shadedArea()/t.area();
		assertEquals(0.00000001, ratio, EPSILON);
	}
}
