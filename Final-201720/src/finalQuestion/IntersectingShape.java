package finalQuestion;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Area;

public abstract class IntersectingShape {
	protected static final int WIDTH = 70;
	protected static final int HEIGHT = 50;
	protected boolean intersecting = false;

	public abstract Shape getShape();

	public void checkIntersectionsWith(IntersectingShape other) {
		if (other == this)
			return;

		// a way to detect intersections that works for arbitrary shapes
		Area a = new Area(this.getShape());
		Area b = new Area(other.getShape());
		a.intersect(b);
		if (!a.isEmpty()) {
			intersecting = true;
		}
	}

	/**
	 * Draws the rectangle on the graphics object
	 * 
	 * @param g
	 *            - the graphics object to draw on
	 */
	public void drawOn(Graphics2D g) {
		if (intersecting) {
			g.setColor(Color.black);
			g.draw(this.getShape());
		} else {
			g.setColor(Color.blue);
			g.fill(this.getShape());
		}
	}

}
