package paperPart.fractals;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * This is the main class of a fractal drawing program.  A UML diagram of the
 * program is on the exam.
 *
 * @author Curt Clifton
 */
public class Main {

	private static final Dimension SIZE = new Dimension(800,600);

	/**
	 * Starts the program.
	 *
	 * @param args ignored
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Fractals");
		frame.setSize(SIZE);
		
		Fractal f = getRandomFractal();
		FractalDrawer fd = new FractalDrawer(f);
		frame.add(fd);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private static Fractal getRandomFractal() {
		if (Math.random() < 0.5) {
			return new SierpinskiTriangle();
		} else {
			return new SierpinskiCarpet();
		}
	}

}
