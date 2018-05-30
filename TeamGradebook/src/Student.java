public class Student {
	private String name;
	private int numberOfGrades;
	private double grade;

	// DONE: You'll probably need to have some more fields here

	/**
	 * makes a new student object
	 * 
	 * @param newName
	 *            the name of the student
	 */

	public Student(String newName) {
		// DONE: initialize fields here
		this.name = newName;
		this.numberOfGrades = 0;
		this.grade = 0;
	}

	public int getNumberOfGrades() {
		return this.numberOfGrades;
	}

	public void setNumberOfGrades(int numberOfGrades) {
		this.numberOfGrades = numberOfGrades;
	}

	public double getGrade() {
		return this.grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public void addGrade(double grade) {
		this.grade += grade;
		this.numberOfGrades++;
	}
	
	public double getAverage() {
		if (this.numberOfGrades != 0) {
			return this.grade / this.numberOfGrades;
		}
		return 0;
	}

	/**
	 * gets the name of the student
	 * 
	 * @return the name of the student
	 */
	public String getName() {

		// DONE your code here
		return this.name;
	}

	// DONE: You'll need to add some new methods here
}
