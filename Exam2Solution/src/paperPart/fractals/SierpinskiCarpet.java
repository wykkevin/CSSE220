package paperPart.fractals;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 * This class implements Sierpinski's triangle.
 * 
 * @author Curt Clifton.
 */
public class SierpinskiCarpet extends AbstractSierpinski implements Fractal {

	public void drawOn(Graphics2D graphics) {
		Dimension size = getSize();

		final double width = size.getWidth() - 2 * INSET;
		final double height = size.getHeight() - 2 * INSET;
		drawCarpet(graphics, INSET, INSET, width, height);
	}

	private void drawCarpet(Graphics2D g, double left, double top,
			double width, double height) {
		// TODO: implement Sierpinski Carpet
		if (width < STOP || height < STOP)
			return;

		Rectangle2D rect = new Rectangle2D.Double(left, top, width, height);
		g.setColor(Color.RED);
		g.fill(rect);

		double recurWidth = width / 3.0;
		double recurHeight = height / 3.0;

		double[] xPoints = new double[3];
		double[] yPoints = new double[3];
		double x = left;
		double y = top;
		for (int i = 0; i < 3; i++) {
			xPoints[i] = x;
			yPoints[i] = y;
			x += recurWidth;
			y += recurHeight;
		}

		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				double recurLeft = xPoints[c];
				double recurTop = yPoints[r];
				if (r == 1 && c == 1) {
					// Center
					rect = new Rectangle2D.Double(recurLeft, recurTop,
							recurWidth, recurHeight);
					g.setColor(Color.WHITE);
					g.fill(rect);
				} else {
					// Recurse
					drawCarpet(g, recurLeft, recurTop, recurWidth, recurHeight);
				}
			}
		}

	}
}
