import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

/**
 * This class handles the drawing of the contents of the sun viewer frame. It
 * uses several Sun objects.
 * 
 * @author Curt Clifton and Amanda Stouder. Updated 3/26/2014.
 */
public class SunComponent extends JComponent {

	private static final double LITTLE_SUN_SIZE = 30.0;
	private static final double LITTLE_SUN_SEPARATION = 100.0;
	private static final int NUM_LITTLE_SUNS = 5;
	private static final double LITTLE_SUNS_Y = 400.0;
	private static final Color LITTLE_SUN_COLOR = Color.RED;
	/**
	 * X offset to be used to move row of little suns fully onto screen
	 */
	private static final double LITTLE_SUNS_X_OFFSET = 50; 

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Gets the 2D graphics object
		//TODO: Step 1: Get a Graphics2D object
		
		
		
		//TODO: Step 2: Create a Sun using the default (parameterless) constructor, then draw it to the frame

		
		
		//TODO: Step 7: Create an array of little Suns, with length NUM_LITTLE_SUMS, and draw them to the screen
		//The little suns should start at x = LITTLE_SUNS_X_OFFSET and should be separated by the amount in LITTLE_SUN_SEPARATION
		//The little suns should be drawn in LITTLE_SUN_COLOR

	}
}
