package paperPart.fractals;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

/**
 * This class implements Sierpinski's triangle.
 *
 * @author Curt Clifton.
 */
public class SierpinskiTriangle extends AbstractSierpinski {

	private static final double HEIGHT_TO_BASE_RATIO = Math.sqrt(3)/2;

	public void drawOn(Graphics2D graphics) {
		// TODO Auto-generated method stub.
		Dimension size = getSize();

		double left = INSET;
		double bottom = size.getHeight() - INSET;
		double base = size.getWidth() - 2*INSET;
		drawTriangle(graphics, left, bottom, base);
		
	}
	
	private void drawTriangle(Graphics2D g, double left, double bottom, double base) {

		// TODO Don't forget your base case
		if (base < STOP) return;
		
		// Draws the first equilateral triangle called for by the algorithm.
		Point2D p1 = new Point2D.Double(left, bottom);
		Point2D p2 = new Point2D.Double(left + base, bottom);
		Point2D p3 = new Point2D.Double(left + base / 2.0, bottom - base
				* HEIGHT_TO_BASE_RATIO);
		Shape triangle = makeTriangle(p1, p2, p3);
		g.setColor(Color.RED);
		g.fill(triangle);

		// TODO Implement the rest of this method.
		// Draws inset triangle
		Point2D mp12 = makeMidpoint(p1, p2);
		Point2D mp23 = makeMidpoint(p2, p3);
		Point2D mp31 = makeMidpoint(p3, p1);
		Shape triangle2 = makeTriangle(mp12, mp23, mp31);
		g.setColor(Color.WHITE);
		g.fill(triangle2);
		
		// Recursive for smaller triangles
		double newBase = base/2.0;
		drawTriangle(g, p1.getX(), p1.getY(), newBase);
		drawTriangle(g, mp12.getX(), mp12.getY(), newBase);
		drawTriangle(g, mp31.getX(), mp31.getY(), newBase);
	}

	private Point2D makeMidpoint(Point2D p1, Point2D p2) {
		double x = (p1.getX() + p2.getX()) / 2.0;
		double y = (p1.getY() + p2.getY()) / 2.0;
		return new Point2D.Double(x,y);
	}

	/**
	 * Constructs a triangle connecting the three given points.
	 * 
	 * @param p1
	 * @param p2
	 * @param p3
	 * @return a new triangle shape
	 */
	private Shape makeTriangle(Point2D p1, Point2D p2, Point2D p3) {
		Path2D triangle = new Path2D.Double();
		triangle.moveTo(p1.getX(), p1.getY());
		triangle.lineTo(p2.getX(), p2.getY());
		triangle.lineTo(p3.getX(), p3.getY());
		triangle.lineTo(p1.getX(), p1.getY());
		return triangle;
	}

}
