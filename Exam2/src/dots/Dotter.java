package dots;

import java.awt.Shape;
import java.util.ArrayList;

/**
 * Implementations of this interface store lists of dots at given coordinates.
 * "Dots" may be circles or squares. 
 * 
 * @author Curt Clifton
 */
public interface Dotter {
	/**
	 * @return a list of all the "dots" in this collection
	 */
	ArrayList<Shape> dots();

	/**
	 * Adds a "dot" to this collection at the given coordinates.
	 * 
	 * @param x
	 * @param y
	 */
	void leftClickAt(int x, int y);

	/**
	 * Adds a "dot" to this collection at the given coordinates.
	 * 
	 * @param x
	 * @param y
	 */
	void rightClickAt(int x, int y);
}
