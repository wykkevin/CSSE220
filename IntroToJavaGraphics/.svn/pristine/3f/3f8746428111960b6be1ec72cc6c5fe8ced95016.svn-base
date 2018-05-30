import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KevinComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics aaa) {
		Graphics2D g = (Graphics2D) aaa;
		g.drawRect(10, 10, 200, 200);
		Graphics2D h = (Graphics2D) aaa;
		int recWidth = 10;
		int recHeight = 10;
		for (int i = 1; i <= 37; i++) {
			h.drawRect(0, 0, recWidth, recHeight);
			recWidth += 10;
			recHeight += 10;
		}
		aaa.setColor(Color.green);
		Graphics2D m = (Graphics2D) aaa;
		m.drawOval(30, 30, 40, 150);
		m.fillOval(5, 5, 200, 100);
		Graphics2D n = (Graphics2D) aaa;
		n.drawArc(70, 200, 150, 30, 1, 270);
		Font font = new Font("Bodoni MT Black", Font.BOLD, 72);
	    aaa.setFont(font);
		Graphics2D p = (Graphics2D) aaa;
		p.drawString("qwertyuiop", 500, 110);
		
	}

}
