import java.util.ArrayList;
import java.util.HashMap;


/**
 * Contains a set of small problems on various topics that were covered during the first 3 weeks of class.
 *
 * @author TODO <PUT_YOUR_NAME_HERE>.
 *         Created Dec 17, 2013.
 */
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
	 * @return true if middle character is Q
	 */
	public static boolean isMiddleCharacterQ(String input) {
		return false;
	}
	

	
	/**
	 * 
	 * Takes two arrays of equal length.
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
		return null;
	}
	
	/**
	 * Takes an ArrayList of even length and an array of integers.
	 * 
	 * Returns an ArrayList with the array's values inserted in the 
	 * middle of the ArrayList
	 * 
	 * Examples:
	 * [1,3] and {6} yields [1,6,3]
	 * [2,2,0,0] {-3,-9} yields [2,2,-3,-9,0,0]
	 * [] and {7} yields [7]
	 * [1,3] and {} yields {1,3}
	 * 
	 * You can either MODIFY the ArrayList that is passed in
	 * OR construct a new ArrayList and return that.  Either
	 * is fine.
	 * 
	 * @param source ArrayList of even length
	 * @param numbersToInsert array of values to insert
	 * @return ArrayList with values from array inserted in the middle
	 */
	public static ArrayList<Integer> insertAtMiddle(ArrayList<Integer> source, int[] numbersToInsert) {
		return null;
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
	 * @return copy of the original array with 1 added to all values.
	 */
	public static int[][] addOneToArray(int[][] sourceArray) {
		return null;
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
		return 0;
	}

}
