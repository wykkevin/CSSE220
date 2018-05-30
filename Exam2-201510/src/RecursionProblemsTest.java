import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author hewner
 *
 */
public class RecursionProblemsTest {

	/**
	 * Test method for {@link RecursionProblems#onlyLetters(java.lang.String)}.
	 */
	@Test
	public void testOnlyLetters() {
		assertTrue(RecursionProblems.onlyLetters("abcde"));
		assertTrue(RecursionProblems.onlyLetters("Q"));
		assertTrue(RecursionProblems.onlyLetters(""));
		assertFalse(RecursionProblems.onlyLetters("4s"));
		assertFalse(RecursionProblems.onlyLetters("s4"));
		assertFalse(RecursionProblems.onlyLetters("9"));
		assertFalse(RecursionProblems.onlyLetters("hello world"));
	}

	/**
	 * Test method for {@link RecursionProblems#mergeStrings(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testMergeStrings() {
		assertEquals("abab", RecursionProblems.mergeStrings("a a ", " b b"));
		assertEquals("abab", RecursionProblems.mergeStrings("  ab", "ab  "));
		assertEquals("12?45", RecursionProblems.mergeStrings("123  ", "  345"));
		assertEquals("", RecursionProblems.mergeStrings("", ""));
	}

	/**
	 * Test method for {@link RecursionProblems#reverseArray(int[])}.
	 */
	@Test
	public void testReverseArray() {
		assertArrayEquals(new int[] {3,2,1}, RecursionProblems.reverseArray(new int[] {1,2,3}));
		int[] testArray = new int[] {1,2,3,4};
		assertArrayEquals(new int[] {4,3,2,1}, RecursionProblems.reverseArray(testArray));
		
		//tests to see if you modified the given array
		assertArrayEquals(new int[] {1,2,3,4}, testArray);
		
		assertArrayEquals(new int[] {3,2,1,77,12}, RecursionProblems.reverseArray(new int[] {12,77,1,2,3}));
		assertArrayEquals(new int[] {12}, RecursionProblems.reverseArray(new int[] {12}));
		assertArrayEquals(new int[] {}, RecursionProblems.reverseArray(new int[] {}));
	}

}
