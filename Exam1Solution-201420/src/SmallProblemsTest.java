import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class SmallProblemsTest {

	@Test
	public void testIsMiddleCharacterQ() {
		assertTrue(SmallProblems.isMiddleCharacterQ("aQc"));
		assertTrue(SmallProblems.isMiddleCharacterQ("helloQ12345"));
		assertTrue(SmallProblems.isMiddleCharacterQ("QQQ"));
		assertFalse(SmallProblems.isMiddleCharacterQ("QQ"));
		assertFalse(SmallProblems.isMiddleCharacterQ("abc"));
		assertFalse(SmallProblems.isMiddleCharacterQ("QQxQQ"));
	}

	@Test
	public void testNumberOfMatchingCharacters() {
		assertEquals(3, SmallProblems.numberOfMatchingCharacters("abcQ", "abcZ"));
		assertEquals(3, SmallProblems.numberOfMatchingCharacters("AaBbCcQ", "XaYbZcZ"));
		assertEquals(0, SmallProblems.numberOfMatchingCharacters("abc", "cab"));
		assertEquals(2, SmallProblems.numberOfMatchingCharacters("hellofoo", "ninjafo!"));
	}

	@Test
	public void testInterleaveArrays() {
		int[] a = {1,2,3};
		int[] b = {-1,-2,-3};
		int[] ab = {1,-1,2,-2,3,-3};
		int[] x = {-3,9};
		int[] y = {100,-100};
		int[] xy = {-3,100,9,-100};
		assertArrayEquals(ab, SmallProblems.interleaveArrays(a, b));
		assertArrayEquals(xy, SmallProblems.interleaveArrays(x, y));
	}

	@Test
	public void testInsertAtMiddle() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1); test.add(2);
		int[] insertMe = {3,4};
		assertEquals("[1, 3, 4, 2]", SmallProblems.insertAtMiddle(test, insertMe).toString());
		test = new ArrayList<Integer>();
		test.add(1); test.add(2);test.add(3); test.add(5);
		int[] insertMe2 = {99};
		assertEquals("[1, 2, 99, 3, 5]", SmallProblems.insertAtMiddle(test, insertMe2).toString());
		test = new ArrayList<Integer>();
		test.add(1); test.add(2);test.add(3); test.add(5);
		int[] insertMe3 = {};
		assertEquals("[1, 2, 3, 5]", SmallProblems.insertAtMiddle(test, insertMe3).toString());
		test = new ArrayList<Integer>();
		int[] insertMe4 = {5,6,7};
		assertEquals("[5, 6, 7]", SmallProblems.insertAtMiddle(test, insertMe4).toString());
	}

	@Test
	public void testAddOneToArray() {
		int[][] test1 = {{1,2,3},{4,5,6}};
		int[][] test1out = {{2,3,4},{5,6,7}};
		int[][] test2 = {{20},{0},{1}};
		int[][] test2out = {{21},{1},{2}};
		assertArrayEquals(test1out, SmallProblems.addOneToArray(test1));
		assertArrayEquals(test2out, SmallProblems.addOneToArray(test2));
		assertEquals("You modified the passed in array!",20,test2[0][0]);
	}

	@Test
	public void testMissingInt() {
		int[] test1a = {1,2,3};
		int[] test1b =  {3,1};
		int[] test2a = {7,25,-2,1,6};
		int[] test2b = {7,25,6,1};
		assertEquals(2, SmallProblems.missingInt(test1a, test1b));
		assertEquals(-2, SmallProblems.missingInt(test2a, test2b));
	}

}
