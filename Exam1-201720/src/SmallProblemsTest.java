import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class SmallProblemsTest {

	@Test
	public void testDoubleArrayList() {
		ArrayList<Integer> input1 = new ArrayList<Integer>();
		input1.add(1);
		input1.add(2);
		ArrayList<Integer> result = SmallProblems.doubleArrayList(input1);
		assertEquals("Do not modify the original list!", false, result == input1);
		assertEquals("[1, 2, 1, 2]", result.toString());
		result = SmallProblems.doubleArrayList(result);
		assertEquals("[1, 2, 1, 2, 1, 2, 1, 2]", result.toString());
		ArrayList<Integer> input2 = new ArrayList<Integer>();
		input2.add(3);
		input2.add(9);
		input2.add(3);
		result = SmallProblems.doubleArrayList(input2);
		assertEquals("[3, 9, 3, 3, 9, 3]", result.toString());
		ArrayList<Integer> input3 = new ArrayList<Integer>();
		result = SmallProblems.doubleArrayList(input3);
		assertEquals("[]", result.toString());
		input3.add(4);
		result = SmallProblems.doubleArrayList(input3);
		assertEquals("[4, 4]", result.toString());
		
	}

	@Test
	public void testStringToStringArray() {
		assertArrayEquals(new String[] {"a", "b"}, 
				SmallProblems.stringToStringArray("ab"));
		assertArrayEquals(new String[] {"h", "e", "l", "l", "o"}, 
				SmallProblems.stringToStringArray("hello"));
		assertArrayEquals(new String[] {}, 
				SmallProblems.stringToStringArray(""));

	}
	

	@Test
	public void testSmallestPowerOfTwo() {
		assertEquals(8, SmallProblems.smallestPowerOf2(7));
		assertEquals(8, SmallProblems.smallestPowerOf2(8));
		assertEquals(16, SmallProblems.smallestPowerOf2(9));
		assertEquals(32, SmallProblems.smallestPowerOf2(17));
		assertEquals(2, SmallProblems.smallestPowerOf2(2));
		assertEquals(1, SmallProblems.smallestPowerOf2(1));
		assertEquals(1, SmallProblems.smallestPowerOf2(-5));
		assertEquals(1024, SmallProblems.smallestPowerOf2(1020));

	}

}
