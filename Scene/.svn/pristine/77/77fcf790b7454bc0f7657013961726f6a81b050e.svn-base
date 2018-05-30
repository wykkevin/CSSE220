import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Face {
	private int x;
	private int y;
	private int radius;
	private Color outlineColor;
	private Color fillColor;
	private Color eyeColor;
	private Color mouthColor;
	private int xTrans;
	private int yTrans;
	private int copies;

	public Face(int x, int y, int radius, Color outlineColor, Color fillColor, Color eyeColor, Color mouthColor,
			int xTrans, int yTrans, int copies) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.outlineColor = outlineColor;
		this.fillColor = fillColor;
		this.eyeColor = eyeColor;
		this.mouthColor = mouthColor;
		this.xTrans = xTrans;
		this.yTrans = yTrans;
		this.copies = copies;
	}

	public void drawOn(Graphics2D g5) {
		// DONE: Draw the house body (a rectangle) and the roof (3 lines or a
		// Polygon)
		Graphics2D house = (Graphics2D) g5;
		for (int i = 0; i < this.copies; i++) {
			g5.translate(this.x  + this.xTrans * i, this.y  + this.yTrans * i);
			g5.rotate(-Math.toRadians(20)*i);
			Ellipse2D.Double basicFace = new Ellipse2D.Double(this.x + this.xTrans * i, this.y + this.yTrans * i,
					this.radius * 2, this.radius * 2);
			g5.setColor(this.outlineColor);
			g5.draw(basicFace);
			g5.setColor(this.fillColor);
			g5.fill(basicFace);
			g5.setColor(this.eyeColor);
			g5.fillOval((int) (this.x + this.radius * (1 - (0.5 + 0.28) / Math.sqrt(2)) + this.xTrans * i),
					(int) (this.y + this.radius * (1 - (0.5 + 0.28) / Math.sqrt(2)) + this.yTrans * i),
					(int) (this.radius * 0.56), (int) (this.radius * 0.56));
			g5.fillOval((int) (this.x + this.radius * (2 - (1 - 0.5 / Math.sqrt(2) + 0.28)) + this.xTrans * i),
					(int) (this.y + this.radius * (1 - (0.5 + 0.28) / Math.sqrt(2)) + this.yTrans * i),
					(int) (this.radius * 0.56), (int) (this.radius * 0.56));
			g5.setColor(this.mouthColor);
			g5.drawLine((int) (this.x + this.xTrans * i + this.radius * (1 - 0.7 * Math.cos(Math.toRadians(15)))),
					(int) (this.y + this.yTrans * i + this.radius * (1 + 0.7 * Math.sin(Math.toRadians(15)))),
					(int) (this.x + this.xTrans * i + this.radius * (1 + 0.7 * Math.cos(Math.toRadians(15)))),
					(int) (this.y + this.yTrans * i + this.radius * (1 + 0.7 * Math.sin(Math.toRadians(15)))));
			g5.drawArc((int) (this.x + this.xTrans * i + this.radius * (1 - 0.7)),
					(int) (this.y + this.yTrans * i + this.radius * (1 - 0.7)), (int) (this.radius * 2 * 0.7),
					(int) (this.radius * 2 * 0.7), -15, -150);
			g5.rotate(Math.toRadians(20)*i);
			g5.translate(-this.x  - this.xTrans * i, -this.y  - this.yTrans * i);

		}

	}
}
