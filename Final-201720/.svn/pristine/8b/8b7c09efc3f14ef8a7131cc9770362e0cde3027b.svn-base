package hashmap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class HashMapProblemTest {
	
	@Test
	public void test() {	
		
		HashMap<Integer,Integer> createMap = HashMapProblem.createMap(new int[] {1, 2, 3, 4});
		assertEquals(2, (int)createMap.get(1));
		assertEquals(4, (int)createMap.get(3));
		assertEquals(2, createMap.size());
		
		createMap = HashMapProblem.createMap(new int[] {1, 2, 3, 4, 7, 2, 4, 1});
		assertEquals(2, (int)createMap.get(1));
		assertEquals(4, (int)createMap.get(3));
		assertEquals(2, (int)createMap.get(7));
		assertEquals(1, (int)createMap.get(4));
		assertEquals(4, createMap.size());
		
		createMap = HashMapProblem.createMap(new int[] {});
		assertEquals(0, createMap.size());
		
	}
	
}
