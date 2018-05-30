package finalQuestion;

import java.awt.Color;
import java.awt.Graphics2D;

public class FlashingRect extends IntersectingRect implements Runnable {

	private Graphics2D g2;
	private IntersectingComponent component;

	public FlashingRect(int x, int y, Graphics2D g2, IntersectingComponent component) {
		super(x, y);
		this.g2 = g2;
		this.component = component;
	}

	/**
	 * It shows change color by print, but cannot actually change color on
	 * frame.
	 */
	public void changeColor() {
		if (intersecting) {
			System.out.println("I am changing");
			g2.setColor(Color.black);
			g2.draw(this.getShape());
			System.out.println("Changing to outline form");
			if (g2.getColor() == Color.black) {
				g2.setColor(Color.blue);
				g2.fill(this.getShape());
				System.out.println("Changing to regular form");
			}
		}
	}

	@Override
	public void run() {
		while (true) {
			changeColor();
			this.component.repaint();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
