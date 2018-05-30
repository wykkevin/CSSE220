/**
 * Create instances of StudentAssignments and invoke methods on them.
 * 
 * @author Yuankai Wang. Created Dec 9, 2013.
 */
public class StudentAssignmentsMain {


	/**
	 * Program starts here.
	 * 
	 * @param args
	 *            Ignore the args.
	 */
	public static void main(String[] args) {

		StudentAssignments one = new StudentAssignments("John Doe");
		StudentAssignments two = new StudentAssignments(); // default name is Studenty McStudenton

		one.addAssignment("TwelveProblems", 95);
		two.addAssignment("TwelveProblems", 80);

		one.addAssignment("WordGames", 99);
		two.addAssignment("WordGames", 78);
		one.addAssignment("Faces", 92);
		two.addAssignment("Faces", 0);
		one.printGradeReport();
		one.calculateAverage();
		System.out.println(); // blank line
		two.printGradeReport();
		two.calculateAverage();
		
		/*
		 * This code should print out:
		 * 
		 * John Doe TwelveProblems - 95.0 WordGames - 99.0 Faces - 92.0
		 * 
		 * Studenty McStudenton TwelveProblems - 80.0 WordGames - 78.0 Faces -
		 * 0.0
		 * 
		 * If you finish early, add a new function to compute the student's
		 * average and print it.
		 */

	}

}
