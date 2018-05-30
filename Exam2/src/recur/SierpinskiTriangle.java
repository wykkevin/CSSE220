package recur;

/**
 * A Sierpinski triangle.
 * 
 * @author Curt Clifton. Created Oct 29, 2009.
 */
public class SierpinskiTriangle {
	private final long sideLength;

	/**
	 * Constructs a Sierpinski triangle with sides of length n.
	 * 
	 * @param n
	 */
	public SierpinskiTriangle(long n) {
		this.sideLength = n;
	}

	/**
	 * @return the area inside this triangle
	 */
	public double area() {
		double height = this.sideLength * Math.sqrt(3) / 2;
		return height * this.sideLength / 2;
	}

	/**
	 * Calculates the area of the shaded portion of the triangle. For a side
	 * length of 1, the shaded area is just three-quarters of the total area.
	 * For larger triangles, calculates the shaded area recursively.
	 * 
	 * @return the area of the shaded portion of this triangle
	 */
	public double shadedArea() {
		/*
		 * TODO: implement this method recursively, you may use a helper method
		 * but are not required to do so.
		 */
		return Double.MAX_VALUE; // placeholder line, replace with your code
	}
}
