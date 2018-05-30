import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

/**
 * A component on which draw a pie chart that results from debt analysis.
 * 
 * @author Delvin Defoe, Curt Clifton, and you. Created on Dec. 23, 2010.
 * 
 */
public class DebtComponent extends JComponent {
	// TODO: 1. Study the provided code and javadocs, noting/adding fields 
	// that might be useful.
	
	/**
	 * Amount to inset drawing from edges of component.
	 */
	private static final double INSET = 30.0;

	/**
	 * Amount to separate lines of text in the legend.
	 */
	private static final float LABEL_SPACING = 30;

	/**
	 * Font to use for drawing the legend.
	 */
	private static final Font LEGEND_FONT = new Font("Monospaced", Font.BOLD,
			24);

	/**
	 * Color of edges of pie slices.
	 */
	private static final Color BORDER_COLOR = Color.BLACK;

	/**
	 * Stores a list of the debt kinds so we can loop over them.
	 */
	private static final String[] KINDS = new String[] { Debt.CREDIT_CARD,
			Debt.STUDENT_LOAN, Debt.MORTGAGE, Debt.PERSONAL_LOAN,
			Debt.AUTO_LOAN };

	private static final Color[] COLORS = new Color[] { new Color(255, 0, 0),
			new Color(100, 0, 255), new Color(0, 128, 0),
			new Color(255, 100, 0), new Color(0, 100, 255) };

	/**
	 * Stores a list of every individual debt to be analyzed and charted.
	 */
	private ArrayList<Debt> individualDebts;

	/**
	 * Constructs a DebtComponent for drawing a pie chart of the given debts.
	 * 
	 * @param debts
	 *            the debts incurred
	 */
	public DebtComponent(ArrayList<Debt> debts) {
		this.individualDebts = new ArrayList<Debt>(debts);
	}

	/**
	 * Calculates the total debt.
	 * 
	 * @return the total debt
	 */
	public double getTotalDebt() {
		// TODO: 2. Implement and unit test getTotalDebt(). Unit tests are
		// provided.
		double total=0;
		for (Debt debts:this.individualDebts){
			total+=debts.getAmountOwed();
		}
		return total; // replace this placeholder line of code
	}

	/**
	 * Returns the total amount of debt of the given kind.
	 * 
	 * @param debtKind
	 *            the kind of debt, like "Student Loan". See constants in
	 *            {@link Debt}.
	 * @return the total amount, or zero if no debt of that kind
	 */
	public double findTotalOfKind(String debtKind) {
		// TODO: 3. Implement and unit test findTotalOfKind(). Unit tests are
		// provided.
		double kindNumber=0;
		for (Debt debts:this.individualDebts){
			if (debtKind.equals(debts.getDebtKind())){
				kindNumber+=debts.getAmountOwed();
			}
		}
		return kindNumber; // replace this placeholder line of code
	}

	/**
	 * Returns the percentage of debt that is of the given kind.
	 * 
	 * @param debtKind
	 *            the kind of debt, like "Student Loan". See constants in
	 *            {@link Debt}.
	 * @return the percentage from 0.0 to 100.0, or zero if no debt of that kind
	 */
	public double findPercentageOfKind(String debtKind) {
		// TODO: 4. Implement and unit test findPercentageOfKind(). Unit tests
		// are provided.
		if (getTotalDebt()==0){
			return 0;
		}
		return 100*findTotalOfKind(debtKind)/getTotalDebt(); // replace this placeholder line of code
	}

	@Override
	protected void paintComponent(Graphics g) {
		// All the painting and drawing should be done in this method.
		// This method is called automatically, as needed.
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Color originalColor = g2.getColor();

		// TODO: 5. Implement and test drawing.  The comments below suggest the
		// steps you might take, but you are free to implement this however
		// seems best to you.

		// Calculate location and dimension for pie chart and location for legend
		
		// For each kind of debt...
		
		
			// ...Set color
		
		
		
			// ...Draw label
		
		
		
			// ...Draw wedge
		

		// Draw border of pie

		g2.setColor(originalColor);
	}
}
