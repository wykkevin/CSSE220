import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Draws a circle of circles.
 * 
 * @author Curt Clifton. Created Sep 10, 2008.
 */
public class CircleOfCircles {
	private static final int TITLE_BAR_HEIGHT = 30;

	/**
	 * Draws the frame.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter the big radius:");
		double bigRadius = Double.parseDouble(input);

		// DONE: get the remaining user inputs and store them in the following
		// variables:
		input = JOptionPane.showInputDialog("Enter the number of circles:");
		int circleCount = Integer.parseInt(input);

		input = JOptionPane
				.showInputDialog("Enter the radius for the individual circles:");
		double individualRadius = Double.parseDouble(input);

		// DONE: set up and display the frame using the component
		JFrame frame = new JFrame();

		int size = (int) (2.0 * (CirclesComponent.MARGIN + bigRadius + individualRadius));
		frame.setSize(size, size + TITLE_BAR_HEIGHT);
		frame.setTitle("Circle of Circles");
		CirclesComponent component = new CirclesComponent(bigRadius,
				circleCount, individualRadius);
		frame.add(component);

		frame.setVisible(true);
	}

}
