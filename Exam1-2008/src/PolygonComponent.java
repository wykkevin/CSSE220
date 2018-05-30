import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;


/**
 * Draws some polygons.
 *
 * @author Curt Clifton.
 *         Created Sep 30, 2008.
 */
public class PolygonComponent extends JComponent {
	private Polygon line;
	private Polygon triangle;
	private Polygon quad;
	private Polygon dodecagon;

	/**
	 * Constructs a component with some polygons to draw.
	 */
	public PolygonComponent() {
		this.line = new Polygon();
		this.line.addPoint(new Point2D.Double(0, 0));
		this.line.addPoint(new Point2D.Double(10.0, 10.0));

		this.triangle = new Polygon();
		this.triangle.addPoint(new Point2D.Double(20, 20));
		this.triangle.addPoint(new Point2D.Double(30, 20));
		this.triangle.addPoint(new Point2D.Double(20, 30));

		this.quad = new Polygon();
		this.quad.addPoint(new Point2D.Double(40, 40));
		this.quad.addPoint(new Point2D.Double(40, 55));
		this.quad.addPoint(new Point2D.Double(50, 45));
		this.quad.addPoint(new Point2D.Double(50, 40));
		
		final int SIDES = 20;
		final double RADIUS = 250;
		final double CENTER_X = 400;
		final double CENTER_Y = 300;
		final double STEP = Math.PI * 2.0 / SIDES; 
		this.dodecagon = new Polygon();
		
		for (double d = 0; d < Math.PI * 2.0; d += STEP) {
			double x = CENTER_X + RADIUS * Math.cos(d);
			double y= CENTER_Y + RADIUS * Math.sin(d);
			Point2D next = new Point2D.Double(x, y);
			this.dodecagon.addPoint(next);
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		this.line.drawOn(g2);
		this.triangle.drawOn(g2);
		this.quad.drawOn(g2);
		this.dodecagon.drawOn(g2);
	}


}
