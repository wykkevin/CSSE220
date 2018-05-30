
/**
 * A single method class that needs to be tested. The JUnit test file should be named TestThisClassTest.java.
 *
 */
public class TestThisClass {

	/**
	 * Takes a point in the 2D plane.
	 * Returns true if the point is within the unit circle
	 * (i.e. the circle of radius 1 centered on the origin)
	 * 
	 * NOTE that if a point is ON the unit circle, it does not count.
	 * It has to be within the unit circle.
	 * 
	 * @param xCoordinate
	 * @param yCoordinate
	 * @return true if the point is within the unit circle
	 */
	public static boolean isInsideUnitCircle(double xCoordinate, double yCoordinate) {
		// TODO: build Unit tests that test this function appropriately
		//
		// For full credit, you tests must contain 3 asserts
		// that test *different* cases (e.g. boundary cases, etc.)
		// However, your tests do not need to be exhaustive.
		//
		// Your test should use the JUnit framework and be in its own file
		// TestThisClassTest.java.

		return xCoordinate*xCoordinate + yCoordinate*yCoordinate < 1;
	}
	
}
