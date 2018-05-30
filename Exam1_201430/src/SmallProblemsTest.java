import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


/**
 * Tests the {@link SmallProblems} class.
 *
 * @author Amanda Stouder
 *         Created Mar 26, 2014.
 */
public class SmallProblemsTest {

	/**
	 * Tests the {@link SmallProblems#isSecondToLastCharacterV(String)} method.
	 *
	 */
	@Test
	public void testIsSecondToLastCharacterV() { 
		
		assertTrue(SmallProblems.isSecondToLastCharacterV("aVb"));
		assertTrue(SmallProblems.isSecondToLastCharacterV("abcdeVs"));
		assertFalse(SmallProblems.isSecondToLastCharacterV("arqve"));
		assertFalse(SmallProblems.isSecondToLastCharacterV(""));
		assertFalse(SmallProblems.isSecondToLastCharacterV("V"));
		assertTrue(SmallProblems.isSecondToLastCharacterV("VVVVV"));
	}


	/**
	 * Tests the {@link SmallProblems#combineArrays(int[], int[])} method.
	 *
	 */
	@Test
	public void testCombineArrays() {
		int[] a = new int[]{1,2,3};
		int[] b = new int[]{4,5,6};
		int[] ab = new int[] {1,2,3,4,5,6};
		assertArrayEquals(ab, SmallProblems.combineArrays(a, b));
		a = new int[] {1};
		b = new int[] {};
		int[] aa = new int[] {1,1};
		assertArrayEquals(a, SmallProblems.combineArrays(a, b));
		assertArrayEquals(b, SmallProblems.combineArrays(b, b));
		assertArrayEquals(aa, SmallProblems.combineArrays(a, a));
	}

	/**
	 * Tests the {@link SmallProblems#insertAtMiddle(ArrayList, int[])} method.
	 *
	 */
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
	
	

	/**
	 * Tests the {@link SmallProblems#removeStringsGreaterThanLength4(ArrayList)} method.
	 *
	 */
	@Test
	public void testRemoveStringsGreaterThanLength4() {
		ArrayList<String> test1 = new ArrayList<String>();
		test1.add("ABC"); test1.add("DEF"); test1.add("GHI");
		SmallProblems.removeStringsGreaterThanLength4(test1);
		assertArrayEquals(new String[] {"ABC", "DEF", "GHI"}, test1.toArray());
		
		ArrayList<String> test2 = new ArrayList<String>();
		test2.add("hello"); test2.add("goodbye"); test2.add("pie");
		test2.add("cake");test2.add("pear");
		SmallProblems.removeStringsGreaterThanLength4(test2);
		assertArrayEquals(new String[] {"pie","cake","pear"}, test2.toArray());

		ArrayList<String> test3 = new ArrayList<String>();
		SmallProblems.removeStringsGreaterThanLength4(test3);
		assertArrayEquals(new String[] {}, test3.toArray());
		

		ArrayList<String> test4 = new ArrayList<String>();
		test4.add("hey"); test4.add("hello");
		SmallProblems.removeStringsGreaterThanLength4(test4);
		assertArrayEquals(new String[] {"hey"}, test4.toArray());
		
	}
	
	/**
	 * Tests the {@link SmallProblems#removeItemsFromList(ArrayList, int[])} method.
	 *
	 */
	@Test
	public void testRemoveItemsFromList() {
		ArrayList<String> test1 = new ArrayList<String>();
		test1.add("ABC"); test1.add("DEF"); test1.add("GHI");
		SmallProblems.removeItemsFromList(test1, new String[] {"GHI"});
		assertArrayEquals(new String[] {"ABC", "DEF"}, test1.toArray());

		ArrayList<String> test2 = new ArrayList<String>();
		test2.add("hello"); test2.add("goodbye"); test2.add("apple");
		test2.add("orange");test2.add("pear");
		SmallProblems.removeItemsFromList(test2, new String[] {"goodbye","apple"});
		assertArrayEquals(new String[] {"hello","orange","pear"}, test2.toArray());

		ArrayList<String> test3 = new ArrayList<String>();
		SmallProblems.removeItemsFromList(test3, new String[] {"hello","goodbye"});
		assertArrayEquals(new String[] {}, test3.toArray());
		
		ArrayList<String> test4 = new ArrayList<String>();
		test4.add("hello"); test4.add("goodbye"); 
		SmallProblems.removeItemsFromList(test4, new String[] {});
		assertArrayEquals(new String[] {"hello","goodbye"}, test4.toArray());		

		ArrayList<String> test5 = new ArrayList<String>();
		test5.add("hello"); test5.add("goodbye"); test5.add("goodbye"); 
		SmallProblems.removeItemsFromList(test5, new String[] {"goodbye"});
		assertArrayEquals(new String[] {"hello"}, test5.toArray());
		
	}
	
}
