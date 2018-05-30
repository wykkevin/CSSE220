import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class FaceComponent extends JComponent {
	/**
	 * Draws Faces.
	 */
	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		Graphics2D graphics2 = (Graphics2D) graphics;
		Face testFace=new Face(0,100,50,Color.black,Color.yellow,Color.blue,Color.green,50,90,6);
		testFace.drawOn(graphics2);
	}
}
