import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/*
 * Draws some Pine trees on a graphics area.
 */

public class PineTreesComponent extends JComponent {

	/*
	 * Draw Pine trees.
	 */

	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		Graphics2D graphics2 = (Graphics2D) graphics;
		
		PineTree tree = new PineTree(100, 100, 100, 200);
		tree.drawOn(graphics2);
		
		PineTree littleTree = new PineTree(300, 200, 50, 100);
		littleTree.drawOn(graphics2);
	}
}