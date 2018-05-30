package shapes;

/**
 * 
 * Class representing a circle.  You may need to modify this class slightly.
 * 
 * @author hewner
 *
 */
public class Circle {
	private double r;

	/**
	 * 
	 * Constructs a circle with the given radius
	 * 
	 * @param r radius
	 */
	public Circle(double r) {
		this.r = r;
	}

	/**
	 * 
	 * Computes the area of the circle
	 * 
	 * @return
	 */
	public double getArea() {
		return this.r * this.r * Math.PI;
	}

}
