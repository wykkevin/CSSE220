import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
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

	// FIXME: remove for exam
	/**
	 * Stores the total amount of debt.
	 */
	private double total;

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
		this.total = 0.0;
		for (Debt d : this.individualDebts) {
			this.total += d.getAmountOwed();
		}
		return this.total;
		// FIXME: replace return value with default that always fails tests
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
		double total = 0.0;
		for (Debt d : this.individualDebts) {
			if (d.getDebtKind().equals(debtKind)) {
				total += d.getAmountOwed();
			}
		}
		return total;
		// FIXME: replace return value with default that always fails tests
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
		double subtotal = findTotalOfKind(debtKind);
		if (subtotal <= 0.0) {
			// specified return value is zero in this case, regardless of total
			return 0.0;
		} else {
			return 100.0 * subtotal / getTotalDebt();
		}
		// FIXME: replace return value with default that always fails tests
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

		// Calculate location for pie and legend
		
		// For each kind of debt...
		// ...Set color
		// ...Draw label
		// ...Draw wedge

		// Draw border of pie

		// ---------------------------------------------------------------------
		// FIXME: remove for exam
		// Calculate location and dimension for pie chart and location for legend
		double verticalSize = this.getHeight() - 2 * INSET;
		double horizontalSize = (this.getWidth() - 3 * INSET) / 2.0;
		double circleDiameter = Math.min(verticalSize, horizontalSize);
		float labelX = (float) (horizontalSize + 2 * INSET);
		float labelY = (float) (INSET + LABEL_SPACING);

		double startAngle = 0;

		// For each kind of debt...
		g2.setFont(LEGEND_FONT);
		int colorIndex = 0;
		for (String kind : KINDS) {
			// CONSIDER: It's inefficient to recalculate this each time. We'll
			// be able to do a much nicer version once we learn about Maps.
			// We could do a somewhat nicer version using arrays, but that
			// isn't required.
			double percentage = findPercentageOfKind(kind);

			// Set color
			g2.setColor(COLORS[colorIndex % COLORS.length]);
			colorIndex++;

			// Draw label
			String label = String.format("%5.1f%% %s", percentage, kind);
			g2.drawString(label, labelX, labelY);
			labelY += LABEL_SPACING;

			// Draw wedge
			double sliceAngle = percentage * 360 / 100;
			Arc2D pieSlice = new Arc2D.Double(INSET, INSET, circleDiameter,
					circleDiameter, startAngle, sliceAngle, Arc2D.PIE);
			g2.fill(pieSlice);
			g2.setColor(BORDER_COLOR);
			g2.draw(pieSlice);
			startAngle += sliceAngle;
		}

		// Draw border of pie
		g2.setColor(BORDER_COLOR);
		Ellipse2D pieCrust = new Ellipse2D.Double(INSET, INSET, circleDiameter,
				circleDiameter);
		g2.draw(pieCrust);
		// ---------------------------------------------------------------------

		g2.setColor(originalColor);
	}
}
