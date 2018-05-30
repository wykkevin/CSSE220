
public class StringProbs {
	
	/**
	 * 
	 * If the sentence ends with "!", this function should return a string with all letters uppercase.
	 * If the sentence does not end with "!",. the function return the original string. 
	 * 
	 * For example:
	 *  
	 *  "hello!" becomes "HELLO!"
	 *  "hello?" becomes "hello?"
	 *  "I am excited to be here!" becomes "I AM EXCITED TO BE HERE!"
	 *  "boring" becomes "boring"
	 *  
	 */
	public static String uppercaseIfExclaimation(String sentence) {
		// TODO: the code provided has a bug, fix it
		//
		// HINT: it might help to look up the toUpperCase documentation in the JavaDocs:
		// 
		// https://docs.oracle.com/javase/7/docs/api/
		// 
		// (it'll be under "String")
		//
		// BONUS HINT: You should bookmark that URL!
		if(sentence.charAt(sentence.length() - 1) == '!') {
			sentence=sentence.toUpperCase();
		} 
		return sentence;
	}
	
	/**
	 * 
	 * Uppercases the first 3 characters of the string.
	 * If the string has less than 3 characters, uppercases them all.
	 * 
	 * For example:
	 * 
	 * "hello" becomes "HELlo"
	 * "aaaaaaaa" becomes "AAAaaaaa"
	 * "q" becomes "Q"
	 */
	public static String uppercaseThree(String input) {
		if(input.length() <= 3){
			return input.toUpperCase();
		}
		String firstPart = input.substring(0, 3);
		String secondPart = input.substring(3, input.length());
		
		
		// HINT: You'll want to use the functions substring and length here
		// look them up in the java docs!
				
		return firstPart.toUpperCase()+secondPart;
	}
	

	/**
	 * 
	 * Returns true if the first character matches the last character.
	 * 
	 * For example:
	 * "abca" returns true
	 * "abcd" returns false
	 * "a" returns true
	 * "" returns false
	 */	
	public static boolean firstMatchesLast(String input) {
		if(input.length()!=0){
			char first=input.charAt(0);
			char last=input.charAt(input.length()-1);
			if(first==last){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Takes 2 strings, returns true if the first 4 characters match
	 * If either string has less than 4 characters, returns false
	 * 
	 * For example:
	 * "Xaaabb" & "Xaaacccc" returns true
	 * "aaaabb" & "aaacccc" returns false
	 * "abc" & "abc" returns false
	 */	
	public static boolean first4Match(String one, String two) {
		if(one.length()<4||two.length()<4){
			return false;
		}
		String oneFirst4=one.substring(0, 4);
		String twoFirst4=two.substring(0, 4);
		System.out.println(oneFirst4);
		System.out.println(twoFirst4);
		return oneFirst4.equals(twoFirst4);
	}
	
}
