import java.util.ArrayList;
import java.util.HashMap;


public class SmallProblems {
	
	/**
	 * 
	 * Returns true if the string's middle character is a 'Q'
	 * 
	 * If the string has no middle character (i.e. it is even length)
	 * the function should return false.
	 * 
	 * Examples:
	 * "aQb" returns true
	 * "abc" returns false
	 * "QQ" returns false
	 * 
	 * @param input string to check middle character
	 * @return true if middle character is q
	 */
	public static boolean isMiddleCharacterQ(String input) {
		if(input.length() % 2 == 0)
			return false;
		return input.charAt(input.length()/2) == 'Q';
	}
	
	/**
	 * 
	 * Takes two strings of equal lengths.
	 * Counts the number of matching characters in two strings.
	 * 
	 * Two characters are considered matching if they are the
	 * same character in the same position.
	 * 
	 * Examples:
	 * "abc" and "abZ" yields 2 (a and b)
	 * "1234" and "1234" yields 4
	 * "abc" and "cab" yields 0 (no characters are in the same position)
	 * 
	 * @param s1 first string to match
	 * @param s2 second string to match
	 * @return number of matching characters between the strings
	 */
	public static int numberOfMatchingCharacters(String s1, String s2) {
		int sum = 0;
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				sum++;
			}
		}
		return sum;
	}
	
	/**
	 * 
	 * Takes two arrays of equal lengths.
	 * Returns a new array of double length, with the contents of the
	 * input arrays interleaved.
	 * 
	 * Examples:
	 * 
	 * {1,2,3} and {-1,-2,-3} yields {1,-1,2,-2,3,-3}
	 * {9,-7} and {55,100} yields {9,55,-7,100}
	 * 
	 * @param evenIndexes becomes indexes 0,2,4 etc of new array
	 * @param oddIndexes becomes indexes 1,3,5 etc of new array
	 * @return array with values interleaved
	 */
	public static int[] interleaveArrays(int[] evenIndexes, int[] oddIndexes) {
		int[] result = new int[evenIndexes.length*2];
		for(int i = 0; i < evenIndexes.length; i++) {
			result[2*i] = evenIndexes[i];
			result[2*i + 1] = oddIndexes[i];
		}
		return result;
	}
	
	/**
	 * Takes an ArrayList of even length and an array of integers.
	 * 
	 * Returns an arraylist with the array's values inserted in the 
	 * middle of the arraylist
	 * 
	 * Examples:
	 * [1,3] and {6} yields [1,6,3]
	 * [2,2,0,0] {-3,-9} yields [2,2,-3,-9,0,0]
	 * [] and {7} yields [7]
	 * [1,3] and {} yields {1,3}
	 * 
	 * You can either MODIFY the arraylist that is passed in
	 * OR construct a new arraylist and return that.  Either
	 * is fine.
	 * 
	 * @param source arraylist of even length
	 * @param numbersToInsert array of values to insert
	 * @return arraylist with values inserted in the middle
	 */
	public static ArrayList<Integer> insertAtMiddle(ArrayList<Integer> source, int[] numbersToInsert) {
		int initialSize = source.size();
		for(int i=0; i < numbersToInsert.length; i++) {
			source.add(initialSize/2 + i, numbersToInsert[i]);
		}
		return source;
	}
	
	/**
	 * 
	 * Takes a 2D array of integers.
	 * Returns a NEW array of integers which is a copy
	 * of the original one, except with one added to all values.
	 * 
	 * Example:
	 * {{1,3},{10,100}} yields {{2,4},{11,101}}
	 * 
	 * Note that for full credit, your function needs
	 * to return a new array, not modify the existing array.
	 * 
	 * @param sourceArray
	 * @return
	 */
	public static int[][] addOneToArray(int[][] sourceArray) {
		int[][] resultArray = new int[sourceArray.length][sourceArray[0].length];
		for(int i = 0; i < sourceArray.length; i++) {
			for(int j = 0; j < sourceArray[0].length; j++) {
				resultArray[i][j] = sourceArray[i][j] + 1;
			}
		}
		return resultArray;
	}

	/**
	 * 
	 * Takes 2 arrays of integers.
	 * The first array contains a set of unique values (i.e. no repeats).
	 * The second array contains the same values in different order,
	 * but with exactly one value missing.
	 * 
	 * The function returns the value that is missing from the 2nd array.
	 * 
	 * Examples:
	 * {1,2,3} and {3,1} yields 2
	 * {7,25,-2,1,6} and {7,25,6,1} yields -2
	 * 
	 * @param list1
	 * @param list2
	 * @return the missing integer
	 */
	public static int missingInt(int[] list1, int[] list2) {
		HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		for(int i = 0; i < list2.length; i++) {
			map.put(list2[i],true);
		}
		for(int i = 0; i < list1.length; i++) {
			if(!map.containsKey(list1[i])) {
				return list1[i];
			}
		}
		//should never get here
		return -1;
	}

}
