import java.util.ArrayList;

public class Team {
	private ArrayList<Student> students;
	private String name;
	private double grade;

	public Team(String name) {
		this.name = name;
		this.students = new ArrayList<Student>();
	}

	public ArrayList<Student> getStudents() {
		return this.students;
	}

	public String getName() {
		return this.name;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGrade(double grade) {
		for (Student student : this.students) {
			student.addGrade(grade);
		}
		this.grade = grade;
	}

	public double getGrade() {
		return this.grade;
	}
	// You'll need to add methods, constructors and fields here

}
