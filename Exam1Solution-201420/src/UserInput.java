import java.util.Scanner;


public class UserInput {

	/*
	 * Add a main to this class so it can run.
	 * 
	 * It should prompt the user "What is your name?" and get a name
	 * from the user on the console.
	 * 
	 * If the name is ordinary, your code should print "Hello <name-that-was-entered>!"
	 * 
	 * If the name is your instructor (Buffalo or Delvin, depending) your code should
	 * print "Give me an A!"
	 * 
	 * 
	 * For example:
	 * 
	 * What is your name?
	 * Mike
	 * Hello Mike!
     *
	 * Another example (assuming your instructor is Buffalo):
	 * 
	 * What is your name?
	 * Buffalo
	 * Give me an A!
     *
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine().trim();
		if(name.equals("Buffalo")) {
			System.out.println("Give me an A!");
		} else {
			System.out.println("Hello " + name + "!");
		}
	}
}
