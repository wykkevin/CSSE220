import java.util.ArrayList;

public class StudentAssignments {
	private String name;
	private ArrayList<String> stringArrayList;
	private ArrayList<Double> doubleArrayList;

	public StudentAssignments(String name) {
		this.name = name;
		this.stringArrayList = new ArrayList<String>();
		this.doubleArrayList = new ArrayList<Double>();
	}

	public StudentAssignments() {
		this.name = "Studenty McStudenton";
		this.stringArrayList = new ArrayList<String>();
		this.doubleArrayList = new ArrayList<Double>();
	}

	public void addAssignment(String nameOfAssignment, double score) {
		this.stringArrayList.add(nameOfAssignment);
		this.doubleArrayList.add(score);
	}

	public void printGradeReport() {
		String toPrint=this.name;
		for (int i = 0; i < this.stringArrayList.size(); i++) {
			toPrint+=" "+this.stringArrayList.get(i) + " - " + this.doubleArrayList.get(i);
		}
		System.out.println(toPrint);
	}
	
	public void calculateAverage(){
		double total=0;
		for(int i = 0; i < this.doubleArrayList.size(); i++){
			total=total+doubleArrayList.get(i);
		}
		System.out.println("The average score is:"+total/doubleArrayList.size());
	}
}