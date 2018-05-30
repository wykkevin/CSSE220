import java.util.ArrayList;

/**
 * 
 * DONE This class includes twelve problem to let me get use to Java.
 *
 * @author Yuankai Wang. Created Nov 28, 2016.
 */

public class TwelveProblems {

	/**
	 * Given a particular point in the coordinate plane, compute the point's
	 * distance from the origin (0,0)
	 * 
	 * For example
	 * 
	 * distanceFromOrigin(-1,0) returns 1 distanceFromOrigin(77,77) returns
	 * 108.894 distanceFromOrigin(-3,-4) returns 5
	 * 
	 * Google for Java square root to figure out how to do it
	 */

	/**
	 * 
	 * DONE This method use the equation of calculate the distance between two
	 * points in math to get the distance. I google to get the way to do square
	 * root in Java.
	 *
	 * @param x
	 * @param y
	 * @return
	 */
	public static double distanceFromOrigin(double x, double y) {
		double dist = Math.sqrt(x * x + y * y);
		return dist;
	}

	/**
	 * Determine if a given positive integer has a 5 in the second rightmost
	 * digit
	 * 
	 * For example:
	 * 
	 * 5 returns false 52 returns true 151 returns true 30050 returns true 5000
	 * returns false
	 * 
	 * Hint: you'll want to use the modulus operator % and the divison operation
	 * / See section 4.2.3 for details. Don't convert the number to a string!
	 * 
	 * Bonus Hint: you usually should not use an if statement to return a
	 * boolean
	 * 
	 * if (x % 2 == 0) { // checks if x is even return true; } else { return
	 * false; }
	 * 
	 * Instead, just return the result of the boolean test directly
	 * 
	 * return x % 2 == 0; //returns true or false
	 * 
	 * @param input
	 * @return
	 */

	/**
	 * 
	 * DONE This method return true if the second rightmost digit is 5. Because
	 * only when 0 and 5 are divided by 5, the remainder will be 0. I set this
	 * as my first condition and throw out 0. Because 0 is the only number that
	 * when it is divided by 10, the remainder will be 0.
	 *
	 * @param input
	 * @return
	 */

	public static boolean secondDigit5(int input) {
		return input / 10 % 5 == 0 && input / 10 % 10 != 0;
	}

	/**
	 * Determine if a given string ends with an uppercase letter.
	 * 
	 * For example:
	 * 
	 * endsWithUppercase("dog") returns false endsWithUppercase("doG") returns
	 * true endsWithUppercase("") returns false
	 * 
	 * Note that you can check if a particular char is uppercase like this:
	 * 
	 * char myChar = 'A'; if(Character.isUpperCase(myChar)) {
	 * System.out.println("uppercase!"); }
	 * 
	 * Note that the empty string is considered not to end with an uppercase
	 * letter.
	 * 
	 * Requires if statements, strings
	 */

	/**
	 * 
	 * DONE This method returns true if the last letter is an uppercase letter.
	 * I first throw away the possibility if the input is an empty string and
	 * let it return false. The index of the last character is the length of the
	 * string minus 1. So we can get result by see that character.
	 *
	 * @param input
	 * @return
	 */

	public static boolean endsWithUpperCaseLetter(String input) {
		if (input == "") {
			return false;
		}
		char lastChar = input.charAt(input.length() - 1);
		return Character.isUpperCase(lastChar);
	}

	/**
	 * Returns the first number taken to the power of the second number
	 * 
	 * For example pow(2,3) returns 2^3 or 8
	 * 
	 * DO NOT USE FUNCTIONS in Math (yes, Math.pow is how you would really do
	 * it) Instead, write this code yourself as practice.
	 * 
	 * Don't forget about negative powers! But both parameters are integers, so
	 * you don't need to worry about fractional powers.
	 * 
	 * Hint: if you want to get the reciprocal of an integer, do it like this
	 * 1.0/coolInt not like this 1/coolInt
	 * 
	 * Why? See section 4.2.3 in your book
	 * 
	 * Requires: for loops
	 */

	/**
	 * 
	 * DONE This method calculates num^power. Because power can be positive or
	 * negative, I divide it into two situations. Because the meaning of power
	 * is to time the number several times, I let the result be the number times
	 * itself for "power" times.
	 *
	 * @param num
	 * @param power
	 * @return
	 */

	public static double pow(int num, int power) {
		int i;
		double result = 1;
		if (power >= 0) {
			for (i = 1; i <= power; i++) {
				result *= num;
			}
		} else {
			for (i = -1; i >= power; i--) {
				result *= 1.0 / num;
			}
		}
		return result;
	}

	/**
	 * Given two strings of the same length, returns the index at which the
	 * strings first differ. If the strings are equal the function should return
	 * -1.
	 * 
	 * For example: firstDifference("abc", "axy") returns 1
	 * firstDifference("aby", "abz") returns 2 firstDifference("foo", "bar")
	 * returns 0 firstDifference("ninja", "ninja") returns -1
	 * firstDifference("","") returns -1
	 * 
	 * You don't need to worry about inputs of different lengths.
	 * 
	 * Hint: if you want to compare the two strings to see if they are equal.
	 * For example, something like this:
	 * 
	 * if(one.equals(two)) return -1;
	 * 
	 * Individual characters however, should be compared with == char a =
	 * one.charAt(0); char b = two.charAt(0); if(a == b) {
	 * System.out.println("First characters are equal"); }
	 * 
	 * Requires: for loops or while loops, strings
	 */

	/**
	 * 
	 * DONE This method compares two strings with the same length and return the
	 * index of the first difference. If they are the same, return -1. I use for
	 * loop to compare all the characters one by one and check if they are the
	 * same. After this procedure and it does not return anything. It means that
	 * they are the same. So return -1.
	 *
	 * @param one
	 * @param two
	 * @return
	 */

	public static int firstDifference(String one, String two) {
		int i;
		for (i = 0; i < one.length(); i++) {
			if (one.charAt(i) != two.charAt(i)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Given one string, return the most common character.
	 * 
	 * Example: mostCommonCharacter("aaab") returns 'a'
	 * mostCommonCharacter("abcbcdc") returns 'c'
	 * 
	 * You can assume that your string will not be empty and that one character
	 * will be more common than all the others (i.e. there won't be a tie for
	 * the most common character)
	 * 
	 * Your solution should use a pair of nested for loops. You might be tempted
	 * to use something like python's dictionary here, but we'll save that till
	 * later when we cover hashmaps.
	 * 
	 * Requires: for loops, strings
	 */

	/**
	 * 
	 * DONE This method find the most common character in the input and return
	 * it. I first change the string to an array with characters. Then I use two
	 * variables to go through the array twice. So I can compare them. Because
	 * the variable largest need to be defined as a specific character, I define
	 * it as 'a'. I use two other variables to count the time that each
	 * character occurs and find the largest one.
	 *
	 * @param input
	 * @return
	 */

	public static char mostCommonCharacter(String input) {
		int i;
		int j;
		char[] inputArray = input.toCharArray();
		int maxtime = 0;
		int temptime = 0;
		char largest = 'a';
		for (i = 0; i < input.length(); i++) {
			temptime = 0;
			for (j = 0; j < input.length(); j++) {
				if (inputArray[i] == inputArray[j]) {
					temptime++;
				}
				if (temptime > maxtime) {
					maxtime = temptime;
					largest = inputArray[i];
				}
			}
		}
		return largest;
	}

	/**
	 * Finds the first number in an array divisible by 77 and returns it.
	 * 
	 * If no number is found, the function returns -1
	 * 
	 * Example: firstDivisibleBy77({88,24,154,77}) returns 154
	 * firstDivisibleBy77({5929, 280}) returns 5929
	 * firstDivisibleBy77({1,2,3,4}) returns -1
	 * 
	 * Don't forget about the modulus operator (%)
	 */

	/**
	 * 
	 * DONE This method is used to find the first number in the array that is
	 * divisible by 77. I go through all the numbers in the array one by one and
	 * test if it is divisible by 77. If it is, I return the number. If there is
	 * no number that pass the test. It will return -1.
	 *
	 * @param numbers
	 * @return
	 */

	public static int firstDivisbleBy77(int[] numbers) {
		int i;
		for (i = 0; i < numbers.length; i++) {
			if (numbers[i] % 77 == 0) {
				return numbers[i];
			}
		}
		return -1;
	}

	/**
	 * Creates an array of all the powers of two, up to (and including) the
	 * given exponent starting at 2^0.
	 * 
	 * If the given exponent is less than zero, return an empty array. You can
	 * do this by saying "return new int[0];"
	 * 
	 * For example: powersOfTwo(3) returns {1,2,4,8} powersOfTwo(0) returns {1}
	 * powersOfTwo(-66) returns {}
	 * 
	 * Requires: arrays, for loops
	 */

	/**
	 * 
	 * DONE This method get an array of numbers that are the powers of two. I
	 * first decide if maxExponent is smaller than 0. Then I make an array and
	 * put elements into it accordingly.
	 *
	 * @param maxExponent
	 * @return
	 */

	public static int[] powersOfTwo(int maxExponent) {
		if (maxExponent < 0) {
			return new int[0];
		}
		int[] powerArray = new int[maxExponent + 1];
		for (int i = 0; i < maxExponent + 1; i++) {
			powerArray[i] = (int) Math.pow(2, i);
		}
		return powerArray;
	}

	/**
	 * Given two arrays of integers that are the same length, returns a new
	 * array that contains the pairwise max of the corresponding elements of the
	 * original arrays (i.e. the larger of the two numbers in that slot in the
	 * original arrays)
	 * 
	 * For example: maxArray({2,10},{1,200}) returns {2,200} maxArray({-5, 60,
	 * 7},{-10,400,8}) returns {-5,400,8}
	 * 
	 * Requires: arrays, for loops
	 */

	/**
	 * 
	 * DONE This method returns a new array that contain the larger number
	 * between array one and array two with the same index. I make an array and
	 * add numbers to that by comparing the numbers in one and two.
	 *
	 * @param one
	 * @param two
	 * @return
	 */

	public static int[] maxArray(int[] one, int[] two) {
		int[] newArray = new int[one.length];
		for (int i = 0; i < one.length; i++) {
			newArray[i] = Math.max(one[i], two[i]);
		}

		return newArray;
	}

	/**
	 * 
	 * Given two arrays, count the number of times the first array occurs in the
	 * second array. You can assume that the first array is shorter than the
	 * second.
	 * 
	 * For example: timesOccur({1,2}, {7,1,2,7,7,7,1,2,7}) returns 2
	 * timesOccur({1,1}, {1,1,1,3} returns 2 (in the 0th and 1st position)
	 * timesOccur({1,2}, {1,3,2,1} returns 0
	 * 
	 * Requires: arrays, nested for loops
	 */

	/**
	 * 
	 * DONE This method is to count the number of times the shorter array occurs
	 * in the longer one. I use two loops to compare each part in the longer
	 * array with the shorter array. I use a boolean variable to check if it
	 * goes different.
	 *
	 * @param shorter
	 * @param longer
	 * @return
	 */

	public static int timesOccur(int[] shorter, int longer[]) {
		int times = 0;
		for (int i = 0; i <= longer.length - shorter.length; i++) {
			boolean equal = true;
			for (int j = 0; j < shorter.length; j++) {
				if (longer[i + j] != shorter[j]) {
					equal = false;
				}
			}
			if (equal) {
				times++;
			}
		}
		return times;
	}

	/**
	 * Given an arraylist of strings, return a new list where anytime the world
	 * "double" appears in the original list it is doubled in the new list.
	 * 
	 * For example: doubleDouble(["foo","double"]) returns
	 * ["foo","double","double"] doubleDouble(["a","double","b","double","c"])
	 * returns ["a","double","double","b","double","double","c"]
	 * 
	 * Be careful not to modify the original list. Start by creating a new
	 * output list that holds the results! E.g.
	 * 
	 * ArrayList<String> output = new ArrayList<String>();
	 * 
	 * When you are comparing strings, be sure to use .equals and not == Eg.
	 * if(currentString .equals("double")) { stuff }
	 * 
	 */

	/**
	 * 
	 * DONE This method double the "double"s. I let the new arraylist add to
	 * last. When there is a "double", I let it add again.
	 *
	 * @param input
	 * @return
	 */

	public static ArrayList<String> doubleDouble(ArrayList<String> input) {
		ArrayList<String> output = new ArrayList<String>();
		for (int i = 0; i < input.size(); i++) {
			output.add(input.get(i));
			if (input.get(i).equals("double")) {
				output.add("double");
			}

		}
		return output;
	}

	/**
	 * Given a string, return all 3 character substrings of that string in an
	 * arraylist. That is, first it will return the 1st 3 characters of the
	 * string Then it will return the 2nd 3rd and 4th characters Then it will
	 * return the 3rd 4th and 5th characters etc.
	 * 
	 * For example: threeCharacterStrings("hello") returns ["hel","ell","llo"]
	 * threeCharacterStrings("foo") returns ["foo"]
	 * threeCharacterStrings(["ab"]) returns []
	 */

	/**
	 * 
	 * DONE This method is to return an arraylist that contain 3 characters of
	 * the string. I first throw out the strings that are less than 3
	 * characters. Then I use a for loop to get the results.
	 *
	 * @param input
	 * @return
	 */

	public static ArrayList<String> threeCharacterStrings(String input) {
		ArrayList<String> output = new ArrayList<String>();
		if (input.length() < 3) {
			return output;
		}
		for (int i = 0; i < input.length() - 2; i++) {
			output.add(input.substring(i, i + 3));
		}
		return output;
	}

}
