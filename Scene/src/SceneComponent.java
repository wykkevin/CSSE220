import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class SceneComponent extends JComponent {
	/**
	 * Draws Scene.
	 */
	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		Graphics2D graphics2 = (Graphics2D) graphics;

		graphics2.setColor(Color.blue);
		graphics2.fillRect(0, 0, 750, 375);
		graphics2.setColor(Color.green);
		graphics2.fillRect(0, 375, 750, 225);

		Sun finalSun = new Sun();
		finalSun.drawOn(graphics2);
		for (int i = 0; i < 5; i++) {
			House house = new House(80 + 120 * i, 480, Color.red);
			house.drawOn(graphics2);
		}
		for (int j = 0; j < 25; j++) {
			PineTree littleTree = new PineTree(200 + 20 * j, 345, 10, 40);
			littleTree.drawOn(graphics2);
		}
		for (int k = 0; k < 15; k++) {
			PineTree largeTree = new PineTree(202 + 30 * k, 355, 20, 80);
			largeTree.drawOn(graphics2);
		}

	}
}