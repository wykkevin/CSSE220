package dots;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JComponent;

/**
 * This class uses a Dotter to display dots based on mouse clicks.
 * 
 * @author Curt Clifton
 */
public class DotDisplay extends JComponent {

	private static final Dimension SIZE = new Dimension(600,400);
	private Dotter dotter;

	/**
	 * Constructs a dot display using the given dotter.
	 * 
	 * @param dotter
	 */
	public DotDisplay(final Dotter dotter) {
		this.dotter = dotter;
		MouseListener ml = new MyMouseListener();
		this.addMouseListener(ml);
		this.setPreferredSize(SIZE);
	}

	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseReleased(MouseEvent e) {
			switch (e.getButton()) {
			case MouseEvent.BUTTON1:
				DotDisplay.this.dotter.leftClickAt(e.getX(), e.getY());
				break;
			case MouseEvent.BUTTON3:
				DotDisplay.this.dotter.rightClickAt(e.getX(), e.getY());
			}
			DotDisplay.this.repaint();
		}

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.fillRect(0, 0, this.getWidth(), this.getHeight());
		g2.setColor(new Color(255, 128, 0));

		List<Shape> dots = this.dotter.dots();
		for (Shape d : dots) {
			g2.fill(d);
		}
	}

}
