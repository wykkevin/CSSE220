package dots;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

/**
 * An implementation of the Dotter interface. 
 *
 * @author <TODO: your name here>
 */
public class MyDotter implements Dotter {
	// FIXME: remove for template
	private ArrayList<Shape> dots = new ArrayList<Shape>();
	private static final double SIZE = 20;

	public ArrayList<Shape> dots() {
		// TODO implement this method
		return this.dots;
	}
	
	public void leftClickAt(int x, int y) {
		// TODO add a square to this collection at the given coordinates.
		this.dots.add(new Rectangle2D.Double(x, y, SIZE, SIZE));
	}

	public void rightClickAt(int x, int y) {
		// TODO add a circle to this collection at the given coordinates.
		this.dots.add(new Ellipse2D.Double(x,y,SIZE,SIZE));
	}

}
