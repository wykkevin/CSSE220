package stringTransforms;

import simpleExample.RemoveLettersFromText;

public class Interfaces {

	public static String transformText(String text, TransformInterface transform) {
		System.out.println("Text before transform: " + text);
		String output = transform.transform(text);
		System.out.println("Text after transform: " + output);
		return output;
	}

	public static String repeatText(String s) {
		String output=transformText(s,new RepeatText());
		return output;
	}

	public static String capitalizeText(String s) {
		String output=transformText(s,new CapitalizeText());
		return output;
	}

	public static String removeLettersFromText(String s, String letterToRemove) {
		// hint this one is slightly trickier
		// pass the extra parameter to your transform's constructor
		String output=transformText(s,new RemoveLettersFromText(s,letterToRemove));
		return output;
	}

	public static void main(String[] args) {
		String myString = "buffalo";
		myString = repeatText(myString);
		myString = capitalizeText(myString);
		myString = removeLettersFromText(myString, "F");
	}
	/*
	 * SCROLL DOWN FOR A HINT - only if you need it!
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * so in the end, you will replace all 3 duplicated functions with a
	 * function that looks like this:
	 * 
	 * public static String transformText(String text, TransformInterface
	 * transform) { System.out.println("Text before transform: " + text); String
	 * output = transform.transform(text);
	 * System.out.println("Text after transform: " + output); return output; }
	 * 
	 */

}
