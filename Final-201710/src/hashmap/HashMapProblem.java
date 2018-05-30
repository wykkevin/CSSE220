package hashmap;

import java.util.HashMap;

public class HashMapProblem {
	/**
	 * 
	 * Given an array of strings and a target number, it returns the number of
	 * strings that occur that many times in the array.
	 * 
	 * This method should also check for the empty string. null values can be
	 * ignored.
	 * 
	 * For example:
	 * 
	 * count(1, ["A", "A", "A", "B", "C", "A", "B", "D"]) ==> 2 (since two
	 * values, "C" and "D", occur 1x) count(2, ["A", "A", "A", "B", "C", "A",
	 * "B", "D"]) ==> 1 (since one value, "B", occurs 2x) count(3, ["A", "A",
	 * "A", "B", "C", "A", "B", "D"]) ==> 0 (since no value occurs 3x) count(4,
	 * ["A", "A", "A", "B", "C", "A", "B", "D"]) ==> 1 (since one value, "A",
	 * occurs 4x)
	 * 
	 * @param target
	 *            A positive integer.
	 * @param strings
	 *            An array of Strings.
	 * @return The number of strings that occur the target number of times.
	 */
	public static int count(int target, String[] strings) {
		// TODO: write this. Must use a HashMap.
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		int count=0;
		for (String letter:strings){
			if (!map.containsKey(letter)){
				map.put(letter, 1);
			}else{
				map.put(letter, map.get(letter)+1);
			}
		}
		for (String letter:map.keySet()){
			if (map.get(letter)==target){
				count++;
			}
		}
		return count;
	}
}
