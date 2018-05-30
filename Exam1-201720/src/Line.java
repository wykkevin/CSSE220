import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Graphical object for drawing lines.
 * 
 * Feel free to modify this class in any way you wish!
 * 
 * @author hewner (and you!)
 *
 */
public class Line {
	private int xStart;
	private int xEnd;
	private int yStart;
	private int yEnd;
	private Color myColor;

	public Line() {
	}

	public Line(int xStart, int yStart, int xEnd, int yEnd, Color color) {
		this.xStart = xStart;
		this.yStart = yStart;
		this.xEnd = xEnd;
		this.yEnd = yEnd;
		this.myColor = color;
	}

	public Line(int xStart, int yStart, int xEnd, int yEnd) {
		this.xStart = xStart;
		this.yStart = yStart;
		this.xEnd = xEnd;
		this.yEnd = yEnd;
		this.myColor = Color.orange;
	}

	public void drawOn(Graphics2D graphics2) {

		graphics2.setColor(this.myColor);
		graphics2.drawLine(this.xStart, this.yStart, this.xEnd, this.yEnd);
	}

	public void setColor(Color myColor) {
		this.myColor = myColor;
	}

	public void setStart(int x, int y) {
		this.xStart = x;
		this.yStart = y;
	}

	public void setEnd(int x, int y) {
		this.xEnd = x;
		this.yEnd = y;
	}
}