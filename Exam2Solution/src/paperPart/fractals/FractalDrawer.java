package paperPart.fractals;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * This component renders a fractal.
 *
 * @author Curt Clifton
 */
public class FractalDrawer extends JComponent {

	private Fractal fractal;

	/**
	 * Constructs a component to draw the given fractal.
	 *
	 * @param fractal
	 */
	public FractalDrawer(Fractal fractal) {
		fractal.registerDrawer(this);
		this.fractal = fractal;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		this.fractal.drawOn((Graphics2D) g);
	}
	
	

}
