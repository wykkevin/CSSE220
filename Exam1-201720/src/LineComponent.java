import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class LineComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(2)); // makes lines thicker

		// FINAL QUESTION STAGE 1
		// uncomment the code below for stage 1
		// For full credit: DO NOT modify the code below beyond removing
		// comments
		// You will need to modify the Line class

		//PART 1
		
		
		Line greenLine = new Line();
		greenLine.setColor(Color.GREEN);
		greenLine.setStart(10, 10);
		greenLine.setEnd(210, 10);
		
		Line blueLine = new Line();
		blueLine.setColor(Color.BLUE);
		blueLine.setStart(10, 10);
		blueLine.setEnd(210, 50);
		
		greenLine.drawOn(g2);
		blueLine.drawOn(g2);

		

		// PART 2
		
		
		Line redLine = new Line(300,300,300,375, Color.RED);
		redLine.drawOn(g2);
		
		Line orangeLine = new Line(0,400,400,0); //line should default to Orange
		orangeLine.drawOn(g2);
		
		
		
		//PART 3
		
		
		MultipartLine blackLine = new MultipartLine(10, 100, 60, 100); //multipart lines are all black
		
		blackLine.addPoint(60, 150);
		blackLine.addPoint(10, 150);
		blackLine.drawOn(g2);
		
		MultipartLine blackLine2 = new MultipartLine(40, 200, 60, 250);
		blackLine2.addPoint(80, 200);
		blackLine2.drawOn(g2);
		
	}
}
