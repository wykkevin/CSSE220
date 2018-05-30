import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;


public class ResponsiveCircleComponent extends JComponent {

	private Ellipse2D ellipse = new Ellipse2D.Double(20, 20, 70, 70);
	private Color color = Color.green;
	
	public void setCenter(int x, int y) {
		ellipse = new Ellipse2D.Double(x - 35, y - 35, 70, 70);
		this.repaint();
	}
	
	public void cycleColor() {
		if(this.color == Color.green) {
			this.color = Color.blue;
		} else {
			this.color = Color.green;
		}
		this.repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
/*		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D ellipse = new Ellipse2D.Double(20, 20, 70, 70);
		g2.setColor(Color.green);
		g2.fill(ellipse);
*/		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(color);
		g2.fill(ellipse);

	}

}
