package paperPart.fractals;

import java.awt.Color;
import java.awt.Dimension;

/**
 * An abstract fractal implementation adding color support.
 *
 * @author Curt Clifton
 */
public abstract class AbstractSierpinski implements Fractal {
	private Color baseColor = Color.RED;
	private Color foreColor = Color.WHITE;
	private FractalDrawer drawer;
	/**
	 * Inset of figure from edge.
	 */
	static final int INSET = 10;
	static final double STOP = 3.0;
	
	/**
	 * @return the foreground color for this
	 */
	final Color getForegroundColor() {
		return this.foreColor;
	}
	
	/**
	 * @return the background color for this
	 */
	final Color getBackgroundColor() {
		return this.baseColor;
	}
	
	public void registerDrawer(FractalDrawer drawer) {
		this.drawer = drawer;
	}
	
	/**
	 * @return the size of the component on which this will be drawn
	 */
	final Dimension getSize() {
		return this.drawer.getSize();
	}

}
