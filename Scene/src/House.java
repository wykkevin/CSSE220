import java.awt.Color;
import java.awt.Graphics2D;

public class House {
	private static final int HEIGHT = 50;
	private static final int WIDTH = 100;
	private static final int ROOF_HEIGHT = 20;
	private int x;
	private int y;
	private Color color;

	public House(int x, int y, Color color) {
		// DONE: save off the parameters into instance variables
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public void drawOn(Graphics2D g2) {
		// DONE: Draw the house body (a rectangle) and the roof (3 lines or a
		// Polygon)
		Graphics2D house = (Graphics2D) g2;
		g2.setColor(this.color);
		g2.fillRect(this.x, this.y, WIDTH, HEIGHT);
		g2.drawLine(this.x, this.y, this.x + WIDTH / 2, this.y - ROOF_HEIGHT);
		g2.drawLine(this.x + WIDTH, this.y, this.x + WIDTH / 2, this.y - ROOF_HEIGHT);
		g2.drawLine(this.x, this.y, this.x + WIDTH / 2, this.y);
	}

}
