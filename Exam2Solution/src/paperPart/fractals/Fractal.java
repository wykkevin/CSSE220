package paperPart.fractals;

import java.awt.Graphics2D;

/**
 * This is the type of a fractal image.
 *
 * @author Curt Clifton
 */
public interface Fractal {

	/**
	 * Registers that the given Fractal Drawer is responsible for rendering this
	 * fractal.
	 *
	 * @param drawer
	 */
	void registerDrawer(FractalDrawer drawer);

	/**
	 * Draws this fractal on the given graphics object.
	 *
	 * @param graphics
	 */
	void drawOn(Graphics2D graphics);

}
