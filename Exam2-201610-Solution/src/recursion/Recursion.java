package recursion;

/**
 * 
 * These problems should ALL be solved recursively - not with the use of rarely 
 * used library functions, for loops, or while loops.
 * 
 * You can use recursive helper functions if you choose, but most of these problems
 * do not require them.
 * 
 * YOU ONLY NEED TO SOLVE 3 OF THESE 4 RECURSION PROBLEMS.
 * 
 * Leave the problem you've decided not to solve blank, and leave a comment
 * saying you've decided to skip it.
 * 
 * @author Delvin Defoe, created on Oct. 19, 2015.
 * 
 *
 */

public class Recursion {
	
	/**
	 * Finds the largest integer from the array of numbers in the range specified.
	 * The given range is defined by the starting and ending indices of the array, 
	 * both inclusive.
	 * 
	 * NOTE: The array of numbers will always be non-empty; start is never larger 
	 * than end; and both start and end are always valid locations in the array.
	 * 
	 * For example:
	 * 
	 * int[] numbers = {-5, 6, -2, 11, 5, 20, 16, 33, 31, 50};
	 * largestInRange(numbers, 0, 0); returns -5
	 * largestInRange(numbers, 5, 6); returns 20
	 * largestInRange(numbers, 0, 9); returns 50
	 *  
	 * @param numbers an array of ints
	 * @param start the starting index of the range
	 * @param end the ending index of the range, inclusive
	 * @return the largest integer in the range specified
	 */
	public static int largestInRange(int[] numbers, int start, int end){
		int largest = numbers[end];
		
		if(start == end){
			return numbers[start];
		}

		if(largest < numbers[start]){
			largest = numbers[start];
		}
		return Math.max(largest, largestInRange(numbers, start + 1, end));
		
	}
	
	/**
	 * Determines whether characters in the given string are in alphabetic order.
	 * The empty string is in alphabetic order.
	 * 
	 * NOTE: UPPERCASE characters appear before lowercase characters. 
	 * Besides the empty string, only alphabetic characters will be given as input.
	 * 
	 * For Example:
	 * 
	 * isInAlphabeticOrder(""); returns true
	 * isInAlphabeticOrder("a"); returns true
	 * isInAlphabeticOrder("ab"); returns true
	 * isInAlphabeticOrder("ba"); returns false
	 * isInAlphabeticOrder("abz"); returns true
	 * isInAlphabeticOrder("babcdefg"); returns false
	 * isInAlphabeticOrder("ABCDEFGab"); returns true
	 * isInAlphabeticOrder("aBCDEFG"); returns false
	 *  
	 * @param str string to check for ordering
	 * @return true if string is in alphabetic order
	 */
	public static boolean isInAlphabeticOrder(String str){
		if(str.length() < 2){
			return true;
		}
		if (str.charAt(str.length() - 1) >= str.charAt(str.length() - 2)){
			return isInAlphabeticOrder(str.substring(0, str.length()-1));
		} 
		return false;
	}
	
	
	/**
	 * Counts the number of doubles of the given character in the given string. 
	 * 
	 * For example:
	 * 
	 * countOfDoubles("dee", 'e', 0); returns 1
	 * countOfDoubles("ede", 'e', 0); returns 0
	 * countOfDoubles("booboo", 'o', 1); returns 2
	 * countOfDoubles("booboo", 'o', 3); returns 1
	 * countOfDoubles("boo", 'o', 3); returns 0
	 * countOfDoubles("boooo", 'o', 1); returns 3
	 *
	 * @param str string to search for doubles
	 * @param ch character to search for in str
	 * @param start the starting index from which to begin searching
	 * @return count of doubles of character given in string string
	 */
	public static int countOfDoubles(String str, char ch, int start){
		int length = str.length();
		char temp;
		
		if(length < 2){
			return 0;
		}
		if(start >= length){
			return 0;
		}
		
		temp = str.charAt(start);

		if(start > 0 && temp == ch && ch == str.charAt(start - 1)){
			return 1 + countOfDoubles(str, ch, start + 1);
		} else {
			return countOfDoubles(str, ch, start + 1);
		}
		
	}
	
	/**
	 * Returns true if the given int value occurs EXACTLY twice in 
	 * the given array of ints.  Returns false otherwise.
	 * 
	 * For example:
	 * 
	 * occursExactlyTwiceIn(4, new int[] {4}); returns false
	 * occursExactlyTwiceIn(2, new int[] {2, 2}); returns true
	 * occursExactlyTwiceIn(1, new int[] {1, 4, 1}); returns true
	 * occursExactlyTwiceIn(5, new int[] {55, 2}); returns false
	 * occursExactlyTwiceIn(4, new int[] {4, 2, 3, 1, 4, 5, 6, 7}); returns true
	 * occursExactlyTwiceIn(7, new int[] {7, 7, 4, 7}); returns false
	 * 
	 * @param num the integer to look for
	 * @param numbers the array in which to look for the integer num.
	 * @return boolean value indicating whether given int value occurs in given 
	 * array of ints exactly twice.
	 * 
	 * HINT: you may want a recursive helper function for this one
	 */
	public static boolean occursExactlyTwiceIn(int num, int[] numbers){
		return occursExactlyTwiceInHelper(num, numbers, 0, 0);
	}
	
	private static boolean occursExactlyTwiceInHelper(int num, int[] numbers, int startIndex, int count){
		if(numbers.length < 2){
			return false;
		}
		if(startIndex == numbers.length){
			return count == 2;
		}
		if(numbers[startIndex] == num){
			return occursExactlyTwiceInHelper(num, numbers, startIndex+1, count+1);
		} else {
			return occursExactlyTwiceInHelper(num, numbers, startIndex+1, count);
		}	
	}

}
