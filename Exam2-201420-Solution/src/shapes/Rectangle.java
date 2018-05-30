package shapes;

/**
 * Class representing a rectangle.  You may need to modify this class slightly.
 * 
 * @author hewner
 *
 */
public class Rectangle {
	private double height, width;
	
	/**
	 * 
	 * Constructs a new rectangle with the given height and width
	 * 
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Returns the area of the rectangle
	 * 
	 * @return area
	 */
	public double getArea() {
		return width*height;
	}
}
