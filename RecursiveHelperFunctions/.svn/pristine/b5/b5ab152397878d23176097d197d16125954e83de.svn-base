/**
 * Code to help you practice functions that need recursive helpers
 * 
 * @author hewner
 *
 */
public class RecursiveHelperFunctions {

	/**
	 * 
	 * Sums an array recursively.
	 * 
	 * Both indexes are inclusive so sumArray(0,0,array) returns the first value
	 * of the array
	 * 
	 * You can assume that fromIndex is always <= toIndex
	 * 
	 * Examples:
	 * For array {1,2,3,4}
	 * sumArray(0,3,array) returns 10
	 * sumArray(1,3,array) returns 9
	 * sumArray(2,2,array) returns 3
	 * 
	 * @param fromIndex
	 * @param toIndex
	 * @param array
	 * @return sum of elements
	 */
	public static int sumArray(int fromIndex, int toIndex, int[] array) {
		if (toIndex-fromIndex==0){
			return array[toIndex];
		}
		return array[fromIndex]+sumArray(fromIndex+1,toIndex,array);
	}
	
	/**
	 * Returns the sum of all the elements in the array
	 * 
	 * This is difficult to do recursively without duplicating the array
	 * 
	 * You can assume the array has at least one element
	 * 
	 * Examples:
	 * For array {1,2,3,4}
	 * sumWholeArray(array) returns 10
	 * 
	 * @param array
	 * @return sum of array
	 */
	public static int sumWholeArray(int[] array) {
		return sumArray(0,array.length-1,array);
	}
	
	/**
	 * Returns true if the array is in increasing order
	 * 
	 * You'll want to use a recursive helper function
	 * 
	 * Examples:
	 * {1,2,3,4} returns true
	 * {2,3,4} returns true
	 * {4,3} returns false
	 * {4} returns true
	 * 
	 * @param array
	 * @return true if list is sorted in increasing order
	 */
	public static boolean isOrderedHelper(int[] array,int fromIndex,int toIndex){
		boolean isOrdered=true;
		if (array.length==0){
			return true;
		}
		if (fromIndex==toIndex){
			return true;
		}
		if (array[fromIndex]>array[fromIndex+1]){
			isOrdered=false;
		}
		return isOrdered&&isOrderedHelper(array,fromIndex+1,toIndex);
	}
	
	public static boolean isOrdered(int[] array) {
		return isOrderedHelper(array,0,array.length-1);
	}
	
	/**
	 * Returns true if the string has exactly one uppercase letter, false otherwise
	 * 
	 * You'll want to use a recursive helper function
	 * 
	 * Use Character.isUpperCase to check if a letter is uppercase
	 * 
	 * Examples:
	 * "abc" returns false
	 * "aBc" returns true
	 * "aBcD" returns false
	 * "A" returns true
	 * "" returns false
	 * 
	 * @param input
	 * @return true if there is one uppercase character
	 */
	public static String hasExactlyOneUppercaseHelper(String input){
		String a="";
		if (input.length()==0){
			return a;
		}
		if (Character.isUpperCase(input.charAt(0))){
			a+=input.charAt(0);	
		}
		return a+hasExactlyOneUppercaseHelper(input.substring(1));
	}
	
	public static boolean hasExactlyOneUppercase(String input) {
		if (hasExactlyOneUppercaseHelper(input).length()==1){
			return true;
		}
		return false;
	}

	/**
	 * Returns the length of the longest chain of repeated characters
	 * 
	 * You'll want to use a recursive helper function
	 * 
	 * 
	 * Examples:
	 * "aaabaa" returns 3
	 * "aaabbbbcaaa" returns 4
	 * 	  
	 * @param input
	 * @return length of chain
	 */
	public static int longestChainLengthHelper(String input,int largest){
		String compare=input.substring(0,1);
		if (input.length()==0){
			return 0;
		}
		if (input.length()==1){
			if (input.substring(0,1).equals(compare)){
				
			}
		}
		if (input.substring(0, 1).equals(input.substring(1,2))){
			largest++;
		}else{
			largest=0;
		}
		
		return largest+longestChainLengthHelper(input.substring(1),largest);
		
	}
	
	public static int longestChainLength(String input) {
		return longestChainLengthHelper(input,0);
	}



}
