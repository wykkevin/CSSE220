import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

/**
 * This class draws the circle of circles.
 * 
 * @author Curt Clifton. Created Sep 10, 2008.
 */
public class CirclesComponent extends JComponent {
	/**
	 * Distance to offset the figure from the top and left edges of the frame.
	 */
	public static final double MARGIN = 10.0;
	private double bigRadius;
	private int circleCount;
	private double individualRadius;

	/**
	 * Creates a new CirclesComponent, storing the user inputs.
	 * 
	 * @param bigRadius
	 * @param circleCount
	 * @param individualRadius
	 */
	public CirclesComponent(double bigRadius, int circleCount,
			double individualRadius) {
		this.bigRadius = bigRadius;
		this.circleCount = circleCount;
		this.individualRadius = individualRadius;
	}

	@Override
	protected void paintComponent(Graphics g) {
		// Asks the superclass to do its work
		super.paintComponent(g);

		/*
		 * DONE: Use the three user variables initialized above, plus the
		 * graphics tools we've been working on to draw a "circle of circles".
		 */
		Graphics2D g2 = (Graphics2D) g;
		double bigCircleCenter = MARGIN + this.bigRadius + this.individualRadius;
		double radianStep = 2.0 * Math.PI / this.circleCount;
		for (double d = 0.0; d < 2.0 * Math.PI; d += radianStep) {
			double centerX = this.bigRadius * Math.cos(d) + bigCircleCenter;
			double centerY = this.bigRadius * Math.sin(d) + bigCircleCenter;
			Ellipse2D.Double circle = new Ellipse2D.Double(centerX
					- this.individualRadius, centerY - this.individualRadius,
					2.0 * this.individualRadius, 2.0 * this.individualRadius);
			g2.draw(circle);
		}
	}

}
