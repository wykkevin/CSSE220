import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * Application that runs the debt analysis for a student's total debt. The
 * results are displayed on a pie chart.
 * 
 * @author Delvin Defoe and Curt Clifton. Created on Dec. 23, 2010.
 * 
 */
public class DebtAnalysis {

	/**
	 * The width of the window.
	 */
	public static final int WIDTH = 1000;
	/**
	 * The height of the window.
	 */
	public static final int HEIGHT = 540;
	/**
	 * The window title.
	 */
	public static final String TITLE = "Debt Analyst";

	/**
	 * Starts the debt analysis and displays the pie chart.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		ArrayList<Debt> studentDebt = new ArrayList<Debt>();
		studentDebt.add(new Debt(Debt.CREDIT_CARD, "Bank of America", 2200));
		studentDebt.add(new Debt(Debt.AUTO_LOAN, "Sycamnore Hyundai", 19870));
		studentDebt.add(new Debt(Debt.STUDENT_LOAN, "Sallie Mae", 150040));
		studentDebt.add(new Debt(Debt.PERSONAL_LOAN, "Fifth Third bank", 2500));
		studentDebt.add(new Debt(Debt.MORTGAGE, "Wells Fargo", 129800));
		studentDebt.add(new Debt(Debt.CREDIT_CARD, "Capital One", 4800));
		studentDebt.add(new Debt(Debt.PERSONAL_LOAN, "Citi Financial", 3400));
		studentDebt.add(new Debt(Debt.CREDIT_CARD, "Chase", 1800));
		displayPieChart(studentDebt);
	}

	/**
	 * Displays the given results as a pie chart.
	 * 
	 * @param debtItems
	 *            items from credit report
	 */
	private static void displayPieChart(ArrayList<Debt> debtItems) {
		JFrame frame = new JFrame(DebtAnalysis.TITLE);
		frame.setSize(DebtAnalysis.WIDTH, DebtAnalysis.HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DebtComponent dc = new DebtComponent(debtItems);
		frame.add(dc);
		frame.setVisible(true);

	}

}
