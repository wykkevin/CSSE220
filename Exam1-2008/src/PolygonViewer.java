import javax.swing.JFrame;


/**
 * Uses the Polygon class to draw a pretty picture.
 *
 * @author Curt Clifton.
 *         Created Sep 30, 2008.
 */
public class PolygonViewer {

	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	/**
	 * Starts the Polygon viewer.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setSize(WIDTH, HEIGHT);
		frame.setTitle("Polygonal");
		
		frame.add(new PolygonComponent());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
