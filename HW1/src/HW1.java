/**
 * 
 * DONE This is a class for the first homework. It determines if there are exactly two
 * 		even numbers in the three input numbers.
 *
 * @author Yuankai Wang.
 *         Created Nov 28, 2016.
 */
public class HW1 {

	
	/*
	 * DONE: Write a function from scratch down below here.  The function should 
	 * take 3 whole numbers (e.g. no fractions) and return true if exactly 2 of the
	 * three are even.  For example:
	 * 
	 * twoEven(3,2,6) returns true because 2 and 6 are even
	 * twoEven(2,4,6) returns false because all three are even, not just 2
	 * twoEven(3,99,100) returns false because only 100 is even
	 * 
	 * Hint: take a look at section 5.7 in your textbook for some more
	 * examples of boolean functions like AND and NOT.  The rest of chapter
	 * 5 might be good too if you're a bit confused.
	 * 
	 * Be sure to add appropriate Javadoc comments for your function
	 */
	
	/*
	 * DONE: Either before or after your write your function, write
	 * a main that tests your function and shows it working.
	 * 
	 */
	
	/**
	 * 
	 * DONE This is a main method used to test my function. The test cases are from the
	 *		question.
	 *
	 * @param args
	 */
	
	public static void main(String[] args){
		System.out.println(twoEven(3,2,6));
		System.out.println(twoEven(2,4,6));
		System.out.println(twoEven(3,99,100));
	}
	
	/**
	 * 
	 * DONE The method test if there are exactly two even numbers in the three inputed
	 * 		numbers. Because the remainder for an even number when divided by 2 will be
	 * 		0, and for an odd number will be 1. So when the sum of the three remainders
	 * 		is 1. The only possible situation is that there are two even numbers and one
	 * 		odd number.
	 *
	 * @param one
	 * @param two
	 * @param three
	 * @return
	 */
	
	public static boolean twoEven(int one, int two, int three) {
		int remainder1 = one % 2;
		int remainder2 = two % 2;
		int remainder3 = three % 2;
		return remainder1 + remainder2 + remainder3 == 1;
	}	
}
