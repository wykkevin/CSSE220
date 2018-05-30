package shapes;

public class ShapesComputationMain {
	
	/**
	 * This is the function you need to modify to work with both
	 * rectangles and circles.  You will have to adjust the code
	 * slightly, once you've finished elsewhere, but not too much.
	 * 
	 * @param rects
	 * @return
	 */
	public static double computeAverageArea(Rectangle[] rects) {
		double sum = 0;
		for(Rectangle r : rects) {
			sum += r.getArea();
		}
		return sum/rects.length;
	}
	
	
	/**
	 * Computes the area of Rectangles and Circles
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Rectangle[] rects = new Rectangle[3];
		rects[0] = new Rectangle(1,10);
		rects[1] = new Rectangle(10,1);
		rects[2] = new Rectangle(5,5);
		System.out.println("Average rectangle area: " + computeAverageArea(rects));
		
		Circle[] circles = new Circle[2];
		circles[0] = new Circle(1);
		circles[1] = new Circle(10);
		//after you a finished, the line below should work
		//System.out.println("Average rectangle area: " + computeAverageArea(circles));

	}

}
