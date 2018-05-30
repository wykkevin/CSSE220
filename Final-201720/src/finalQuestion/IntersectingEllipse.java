package finalQuestion;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class IntersectingEllipse extends IntersectingShape {

	private Ellipse2D ellipse;
	
	public IntersectingEllipse(int x, int y) {
		ellipse = new Ellipse2D.Double(x, y, WIDTH, HEIGHT);
	}

	@Override
	public Shape getShape() {
		return ellipse;
	}

}
