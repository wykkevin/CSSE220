import java.util.ArrayList;


public class PartASolution {

	/**
	 * Returns the largest of the 3 input integers
	 * 
	 * For example findLargest(1,2,3) should return 3
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return largest input
	 */
	public static int findLargest(int a, int b, int c) {
		int bigger1 = a > b ? a : b;
		return bigger1 > c ? bigger1 : c;
	}
	
	/**
	 * Returns a new Imaginary number which is the original imaginary 
	 * number multiplied by a real value.  Note that this function
	 * makes a new imaginary number and does not modify the input
	 * number.
	 * 
	 * The output should be a new imaginary number where the real part is
	 * multiplied by the input number and the imaginary part is multiplied
	 * by the input number.
	 * 
	 * @param im - imaginary number (has both a real and imaginary part)
	 * @param real - real number
	 * @return the result of the multiplication
	 */
	public static ImaginaryNum multiplyImaginaryByReal(ImaginaryNum im, double real)
	{
		ImaginaryNum result = new ImaginaryNum(0,0);
		result.setReal(im.getReal()*real);
		result.setImaginary(im.getImaginary()*real);
		return result;
	}
	
	/**
	 * Takes in an array of strings and returns a single string which
	 * is the input strings combined, with commas separating them.
	 * 
	 * For example, given the 3 string input {"AAA", "BBB", "CCC"}
	 * the function should return "AAA,BBB,CCC"
	 * 
	 * @param array of input strings
	 * @return combined strings, separated by commas
	 */
	public static String combineStrings(String[] strings)
	{
		if(strings.length == 0)
			return "";
		String combination = "";
		for(int i = 0; i < strings.length - 1; i++) {
			combination += strings[i];
			combination += ",";
		}
		combination += strings[strings.length - 1];
		return combination;
	}
	
	/**
	 * Takes in an array of Strings and a character.
	 * Returns an arraylist containing only those strings in the original
	 * input beginning with that character.
	 * 
	 * For example, given the 3 string input {"AAA", "BBB", "Andy", "CCC"} and 'A'
	 * the function should return an arraylist with "AAA" and "Andy"
	 * 
	 * @param inputStrings - the list of strings
	 * @param character - the letter to check for matches on
	 * @return
	 */
	public static ArrayList<String> findFirstLetterMatches(String[] inputStrings, char character)
	{
		ArrayList<String> result = new ArrayList<String>();
		for(String s : inputStrings) {
			if(s.charAt(0) == character) {
				result.add(s);
			}
		}
		return result;
	}
	
	/**
	 * Takes in a 2 dimensional array of integers of any size
	 * Returns a count of the number of times the number 4 
	 * appears in the 2 dimensional array.
	 * 
	 * For example, given an array that looks like
	 * 
	 * 4 4 4 2
	 * 4 3 3 2
	 * 1 1 4 2
	 * 
	 * The function would return 5
	 * 
	 * @param input the 2dimensional array to check
	 * @return the number of 4s in the array
	 */
	public static int count4s(int[][] input)
	{
		int numFours = 0;
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input[i].length; j++) {
				if(input[i][j] == 4)
					numFours++;
			}
		}
		return numFours;
	}
}
