package hashmap;

import java.util.HashMap;

public class HashMapProblem {
	/**
	 * Given an array of ints, create a HashMap in which the value at an even
	 * index is the key for the value at the following odd index.
	 * 
	 * For example:
	 * 
	 * [1,2,3,4] returns a HashMap of {1 -> 2}, {3 -> 4}
	 * 
	 * You may assume the items at the even index values are not duplicated.
	 * 
	 * You may also assume that there are an even number of items in the array.
	 * 
	 */
	public static HashMap<Integer, Integer> createMap(int[] input) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < input.length / 2; i++) {
			map.put(input[2 * i], input[2 * i + 1]);
		}
		return map;
	}
}
