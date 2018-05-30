package events;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class ColoredSquareComponent extends JComponent {

	private static final int BORDER_WIDTH = 60;
	private Color color = Color.pink;

	@Override
	protected void paintComponent(Graphics arg0) {
		Graphics2D g = (Graphics2D) arg0;
		int side = Math.min(getWidth(), getHeight()) - 2 * BORDER_WIDTH;
		g.setColor(this.color);
		g.fillRect(BORDER_WIDTH, BORDER_WIDTH, side, side);
	}

	public void changeColor(Color newColor) {
		this.color = newColor;
		this.repaint();
	}

}
