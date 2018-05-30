import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class MapAnd2DArrayProblemsTest {

	@Test
	public void updateByRowNumberTest() {
		int[][] test1 = { { 0, 1, 2 }, { 2, 3, 4 }, { 4, 5, 6 } };
		int[][] expected1 = { { 0, 1, 2  }, { 3, 4, 5 }, { 6, 7, 8 } };
		int[][] test2 = {{1, 2, 3, 4, 5}, {0, 0, 0, 0, 0}, {1, 1, 1, 1, 1}};
		int[][] expected2 = {{1, 2, 3, 4, 5}, {1, 1, 1, 1, 1}, {3, 3, 3, 3, 3}};
		int[][] test3 = { { } };
		int[][] expected3 = { {  } };
		int[][] test4 = { { 1} };
		int[][] expected4 = { {1  } };
		
		MapAnd2DArrayProblems.increaseByRowIndex(test1);

		assertArrayEquals(expected1, test1);
		
		MapAnd2DArrayProblems.increaseByRowIndex(test2);
		assertArrayEquals(expected2, test2);

		MapAnd2DArrayProblems.increaseByRowIndex(test3);
		assertArrayEquals(expected3, test3);
		
		MapAnd2DArrayProblems.increaseByRowIndex(test4);
		assertArrayEquals(expected4, test4);
	}


	@Test
	public void testSeen3Times() {
		
        char[] test = "abcdefajkfdsa".toCharArray();
        HashMap<Character, Boolean> result = MapAnd2DArrayProblems.seen3Times(test);
        assertEquals(9, result.keySet().size());
        for (Character c : test) {
        	if (c!='a') {
        		assertFalse(result.get(c));
        	}
        	else {
        		assertTrue(result.get(c));
        	}
        }
        
        char[] test2 = "".toCharArray();
        HashMap<Character, Boolean> result2 = MapAnd2DArrayProblems.seen3Times(test2);
        assertEquals(0, result2.keySet().size());
        for (Character c : test2) {
        		assertFalse(result2.get(c));
        }
        
        char[] test3 = "aaaaa".toCharArray();
        HashMap<Character, Boolean> result3 = MapAnd2DArrayProblems.seen3Times(test3);
        assertEquals(1, result3.keySet().size());
        assertTrue(result3.get('a'));
	}

}
