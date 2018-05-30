package recursion;

public class RecursionProblems {

	/**
	 * Replaces the given character, toFind, in the given String input, with the
	 * String value given in toReplace.
	 *
	 * Your solution MUST use recursion in a natural way.
	 * 
	 * Examples: replaceStringWithString("test","e","wi") -> "twist"
	 * replaceStringWithString("aesa","a","t") -> "test"
	 * replaceStringWithString("","e","wi") -> ""
	 * replaceStringWithString("test","a","wi") -> "test"
	 * replaceStringWithString("Buqealo","qe","ff") -> "test"
	 * 
	 * You solution MUST NOT use the replace method.
	 * 
	 * @param input
	 *            - The string to replace items in
	 * @param toFind
	 *            - The string to find
	 * @param toReplace
	 *            - The string to replace with
	 * @return The input string will all instances of toFind replaced with
	 *         toReplace
	 */
	public static String replaceStringWithString(String input, String toFind, String toReplace) {
		if (input.length() < toFind.length()) {
			return input;
		}
		if (input.substring(0, toFind.length()).equals(toFind)) {
			return toReplace + replaceStringWithString(input.substring(toFind.length()), toFind, toReplace);
		}
		return input.substring(0, 1) + replaceStringWithString(input.substring(1), toFind, toReplace);
	}
}