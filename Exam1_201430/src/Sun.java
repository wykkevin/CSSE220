import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D.Double;

/**
 * This class is a graphics shape that draws a sun. It displays a colored circle
 * for the center of the sun, and 8 rays around the sun, represented by
 * squares. All items are outlined in black, stored in the BORDER_COLOR constant.
 * 
 * @author Curt Clifton, Amanda Stouder. Updated 3/26/2014
 */
public class Sun {

	//The following constants include scaling information and border color of the Sun
	//Try to use these constants in your code to avoid magic numbers
	private static final Color BORDER_COLOR = Color.BLACK;
	private static final int NUMBER_OF_RAYS = 8;
	private static final double RAY_LENGTH_SCALE = 0.5;
	private static final double RAY_WIDTH_SCALE = 0.1;
	private static final double RAY_DISTANCE_FROM_SUN_SCALE = .2;

	//The following constants define the values to use when the user calls the default Sun constructor
	private static final double DEFAULT_SUN_DIAMETER = 100.0;
	private static final double DEFAULT_SUN_X = 100.0;
	private static final double DEFAULT_SUN_Y = 100.0;
	private static final Color DEFAULT_SUN_COLOR = Color.YELLOW;
	

	//The following are suggested fields of a Sun. You may add more or only use some.
	private double x;
	private double y;
	private double circleDiameter;
	private double rayLength;
	private double rayWidth;
	private double rayDistanceFromSun;
	private Color color;

	/**
	 * Constructs a new sun using the defaults provided in the constants above
	 */
	//TODO: Step 3: Implement a default (parameterless) constructor for the Sun class
	//Try and use as many of the default constants provided above as possible

	
	
	/**
	 * Creates a Sun object using the data provided
	 * 
	 * @param x The upper left x value for the Sun's main circle
	 * @param y The upper left y value for the Sun's main circle
	 * @param circleDiameter The diameter of the Sun's main cricle
	 * @param color The color to use to fill the Sun
	 */
	// TODO: Step 6: Implement a constructor for the Sun object which takes the values listed in the javadoc above

	/**
	 * Draws the sun onto the given Graphics2D object.
	 * 
	 * @param graphics2
	 *            Graphics object onto which to draw
	 */
	public void drawOn(Graphics2D graphics2) {
		//TODO: Step 4: Implement the drawOn method. Draw just the circle for the Sun to start with.

	}
	
	
	/**
	 * A method that draws each ray of a sun.
	 * @param graphics2 The graphics object to use when drawing
	 * @param angle The angle at which the ray should be drawn
	 */
	private void drawRay(Graphics2D graphics2, double angle) {
		//TODO: Step 5: Implement the drawRay method. This method should use the Graphics2D.rotate method
		//Then call this method from drawOn
	
	}
}
