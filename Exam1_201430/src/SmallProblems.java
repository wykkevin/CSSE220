import java.util.ArrayList;


/**
 * Contains a set of small problems on various topics that were covered during the first 3 weeks of class.
 *
 * @author TODO <PUT_YOUR_NAME_HERE>.
 *         Created Mar 26, 2014
 */
public class SmallProblems {
	
	/**
	 * Returns true if the string's second to last character is a 'V'
	 * 
	 * If the string has no second to last character (i.e. it is too short)
	 * the function should return false.
	 * 
	 * Examples:
	 * "aVb" returns true
	 * "abcdeVs" returns true
	 * "arqve" returns false
	 * "" returns false
	 * "V" returns false
	 * 
	 * @param input string to check second to last character
	 * @return true if second to last character is V
	 */
	public static boolean isSecondToLastCharacterV(String input) {
		if (input.length()<2){
			return false;
		}
		return input.substring(input.length()-2,input.length()-1).equals("V");
		}

	
	/**
	 * 
	 * Takes two arrays and combines them
	 * Returns a new array of with the contents of the
	 * front array followed by the end array
	 * 
	 * Examples:
	 * 
	 * {1,2,3} and {4,5,6} yields {1,2,3,4,5,6}
	 * {1} and {} yields {1}
	 * {} and {} yields {}
	 * 
	 * @param front becomes the beginning of the new array
	 * @param end becomes the end of the new array
	 * @return array with values interleaved
	 */
	public static int[] combineArrays(int[] front, int[] end) {
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
	 * Removes strings with a length greater than 4 from the ArrayList
	 * The ArrayList contains strings.
	 * 
	 * The function mutates the original ArrayList, it does NOT return a value
	 * 
	 * Examples:
	 * ["ABC", "DEF", "GHI"] makes the list ["ABC", "DEF", "GHI"]
	 * ["hello","goodbye","pie","cake","pear"] makes the list ["pie","cake","pear"]
	 * [] makes the list []
	 * ["hey","hello"] and {} makes the list ["hey"]
	 * 
	 * @param list The list to remove from
	 */
	public static void removeStringsGreaterThanLength4(ArrayList<String> list) {
	}

	
	/**
	 * 
	 * Takes one ArrayList of strings and removes values from a supplied array.
	 * The ArrayList contains a collection of strings
	 * The array contains a collection of strings to start with.
	 * 
	 * The function mutates the original ArrayList, it does NOT return a value
	 * 
	 * Examples:
	 * ["ABC", "DEF", "GHI"] and {"GHI"} makes the first list ["ABC", "DEF"]
	 * ["hello","goodbye","apple","orange","pear"] and {"goodbye","apple"} makes the first list ["hello","orange","pear"]
	 * [] and {"hello","goodbye"} makes the first list []
	 * ["hello","goodbye"] and {} makes the first list ["hello","goodbye"]
	 * ["hello","goodbye","goodbye"] and {"goodbye"} makes the first list ["hello"]
	 * 
	 * @param list The list to remove from
	 * @param toRemove The items to remove from the ArrayList
	 */
	public static void removeItemsFromList(ArrayList<String> list, String[] toRemove) {
	}

}
