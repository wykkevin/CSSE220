import static org.junit.Assert.*;

import java.awt.geom.Point2D;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Polygon class.
 * 
 * @author Curt Clifton. Created Sep 30, 2008.
 */
public class PolygonTest {

	private static final double EPSILON = 0.00001;
	private Polygon empty;
	private Polygon point;
	private Polygon line;
	private Polygon triangle;
	private Polygon quad;

	/**
	 * Sets up some polygons for testing.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.empty = new Polygon();

		this.point = new Polygon();
		this.point.addPoint(new Point2D.Double(7,7));
		
		this.line = new Polygon();
		this.line.addPoint(new Point2D.Double(0, 0));
		this.line.addPoint(new Point2D.Double(1.0, 1.0));

		this.triangle = new Polygon();
		this.triangle.addPoint(new Point2D.Double(0, 0));
		this.triangle.addPoint(new Point2D.Double(10, 0));
		this.triangle.addPoint(new Point2D.Double(0, 10));

		this.quad = new Polygon();
		this.quad.addPoint(new Point2D.Double(0, 0));
		this.quad.addPoint(new Point2D.Double(0, 15));
		this.quad.addPoint(new Point2D.Double(10, 5));
		this.quad.addPoint(new Point2D.Double(10, 0));
	}

	/**
	 * Test method for {@link Polygon#perimeter()}.
	 */
	@Test
	public void testPerimeterEmpty() {
		assertEquals(0.0, this.empty.perimeter(), EPSILON);
	}

	/**
	 * Test method for {@link Polygon#perimeter()}.
	 */
	@Test
	public void testPerimeterPoint() {
		assertEquals(0.0, this.point.perimeter(), EPSILON);
	}

	/**
	 * Test method for {@link Polygon#perimeter()}.
	 */
	@Test
	public void testPerimeterLine() {
		assertEquals(2.0 * Math.sqrt(2.0), this.line.perimeter(), EPSILON);
	}

	/**
	 * Test method for {@link Polygon#perimeter()}.
	 */
	@Test
	public void testPerimeterTriangle() {
		assertEquals(20.0 + 10.0 * Math.sqrt(2.0), this.triangle.perimeter(),
				EPSILON);
	}

	/**
	 * Test method for {@link Polygon#perimeter()}.
	 */
	@Test
	public void testPerimeterQuad() {
		assertEquals(30.0 + 10.0 * Math.sqrt(2.0), this.quad.perimeter(),
				EPSILON);
	}

	/**
	 * Test method for {@link Polygon#area()}.
	 */
	@Test
	public void testAreaEmpty() {
		assertEquals(0.0, this.empty.area(), EPSILON);
	}


	/**
	 * Test method for {@link Polygon#area()}.
	 */
	@Test
	public void testAreaPoint() {
		assertEquals(0.0, this.point.area(), EPSILON);
	}
	/**
	 * Test method for {@link Polygon#area()}.
	 */
	@Test
	public void testAreaLine() {
		assertEquals(0.0, this.line.area(), EPSILON);
	}

	/**
	 * Test method for {@link Polygon#area()}.
	 */
	@Test
	public void testAreaTriangle() {
		assertEquals(50.0, this.triangle.area(), EPSILON);
	}

	/**
	 * Test method for {@link Polygon#area()}.
	 */
	@Test
	public void testAreaQuad() {
		assertEquals(100.0, this.quad.area(), EPSILON);
	}

}
