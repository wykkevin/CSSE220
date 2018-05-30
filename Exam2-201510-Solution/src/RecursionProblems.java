/**
 * 
 */

/**
 * 3 recursion problems
 * 
 * @author hewner
 *
 */
public class RecursionProblems {

	/**
	 * Returns true if the string consists entirely of letters
	 * Note that you can check if a character is a letter like this:
	 * 
	 * char x = 'q';
	 * if(Character.isLetter(x)) {
	 *   //do something
	 * }
	 * 
	 * Examples:
	 * "abc" returns true
	 * "ab9" returns false
	 * "b d" returns false
	 * "" returns true
	 * 
	 * @param input
	 * @return
	 */
	public static boolean onlyLetters(String input) {
		if(input.isEmpty()) return true;
		if(!Character.isLetter(input.charAt(0))) {
			return false;
		}
		return onlyLetters(input.substring(1));
	}
	
	/**
	 * Given strings of the same length, 'merge' the strings
	 * 
	 * Here's how merging works:  
	 * * When considering the two strings, look at each character position.
	 * At position i:
	 * If both strings contain a space at position i, the result string will have a space at position i
	 * If one string contains a space at position i and the other contains any other character 
	 *    than a space, the result string will have the non-space character at position i
	 * If both strings contain a non-space character at position i, the result string will have
	 *    a �?� at position i.
	 * 
	 * 
	 * For example:
	 * "a  " and " b " returns "ab "
	 * "a a a" and "   bb" returns "a ab?"
	 * "" and "" returns ""
	 * "abcdefg" and "       "  returns "abcdefg"
	 * "abc" and "def" returns "???"
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String mergeStrings(String s1, String s2) {
		if(s1.isEmpty()) {
			return "";
		}
		int c1 = s1.charAt(0);
		int c2 = s2.charAt(0);
		if(c1 != ' ' && c2 != ' ') {
			return "?" + mergeStrings(s1.substring(1), s2.substring(1));
		} else {
			return ((char) (c1 + c2 - ' ')) + mergeStrings(s1.substring(1), s2.substring(1));
		}
	}

	/**
	 * Given an array of ints, returns a new array with the elements in reverse
	 * WARNING: this should not modify the original array
	 * 
	 * You will likely want to use a recursive helper function for this one
	 * 
	 * Examples:
	 * [1,2,3] returns [3,2,1]
	 * [3] returns [3]
	 * [] returns []
	 * 
	 * @param input array to reverse
	 * @return a new array with elements in the reversed order
	 */
	public static int[] reverseArray(int[] input) {
		int[] output = new int[input.length];
		reverseArrayHelper(input, output, 0);
		return output;
	}
	
	public static void reverseArrayHelper(int[] input, int[] output, int index) {
		if(index == input.length)
			return;
		output[index] = input[input.length - index - 1];
		reverseArrayHelper(input, output, index + 1);
	}

}
