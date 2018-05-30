import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Tests ArrayFiller
 * 
 * @author Curt Clifton. Created Sep 30, 2008.
 */
public class ArrayFillerTest {

	/**
	 * Test method for {@link ArrayFiller#fillErUp1()}.
	 */
	@Test
	public void testFillErUp1() {
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(expected, ArrayFiller.fillErUp1());
	}

	/**
	 * Test method for {@link ArrayFiller#fillErUp2()}.
	 */
	@Test
	public void testFillErUp2() {
		int[] expected = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		assertArrayEquals(expected, ArrayFiller.fillErUp2());
	}

	/**
	 * Test method for {@link ArrayFiller#fillErUp3()}.
	 */
	@Test
	public void testFillErUp3() {
		List<Integer> expected = Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81,
				100);
		assertEquals(expected, ArrayFiller.fillErUp3());
	}

	/**
	 * Test method for {@link ArrayFiller#fillErUp4()}.
	 */
	@Test
	public void testFillErUp4() {
		List<Integer> expected = Arrays
				.asList(1, 4, 9, 16, 25, 25, 16, 9, 4, 1);
		assertEquals(expected, ArrayFiller.fillErUp4());
	}

}
