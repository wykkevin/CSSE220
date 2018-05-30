import java.util.ArrayList;

public class SmallProblems {

	/**
	 * Returns a new list which is the double of the original array list.
	 * 
	 * DON'T modify the original list!
	 * 
	 * For example: [1,2] returns [1,2,1,2] [7,45,45,7] returns
	 * [7,45,45,7,7,45,45,7] [1] returns [1,1] [] returns []
	 * 
	 * WARNING: Don't use the ArrayList method addAll. We won't give you credit.
	 * 
	 * @return
	 */
	public static ArrayList<Integer> doubleArrayList(ArrayList<Integer> list) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			output.add(list.get(i));
		}
		for (int j = 0; j < list.size(); j++) {
			output.add(list.get(j));
		}
		return output;
	}

	/**
	 * Takes a string and returns an array of strings. Each string in the array
	 * should be 1 character long.
	 * 
	 * For example: "abc" yields {"a","b","c"} "hello" yields
	 * {"h","e","l","l","o"} "" yields {}
	 * 
	 * 
	 * HINT: If you want to convert a char to a string you can do it like this:
	 * 
	 * String myString = myChar + "";
	 * 
	 * @param input
	 * @return array of 1 character strings
	 */
	public static String[] stringToStringArray(String input) {
		String[] output = new String[input.length()];
		for (int i = 0; i < input.length(); i++) {
			output[i] = input.substring(i, i + 1);
		}
		return output;
	}

	/**
	 * 
	 * Takes an integer and returns the smallest power of 2 greater than or
	 * equal to that integer.
	 * 
	 * For example: 7 yields 8 10 yields 16 8 yields 8 -5 yields 1
	 */
	public static int smallestPowerOf2(int input) {
		int calculate = input;
		while (calculate != 1) {
			if (calculate % 2 != 0 || input == 0) {
				input++;
				calculate = input;
			} else {
				calculate = calculate / 2;
			}
		}
		return input;
	}

}
