import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ResponsiveCircleMain {

	/**
	 * The width of the frame.
	 */
	public static final int WIDTH = 300;
	/**
	 * The height of the frame.
	 */
	public static final int HEIGHT = 300;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setTitle("A Circle");
		ResponsiveCircleComponent c = new ResponsiveCircleComponent();
		c.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		frame.add(c);
		
		//remove me
		JButton button = new JButton("Change color");
		frame.add(button,BorderLayout.SOUTH);
		ResponsiveCircleListener listener = new ResponsiveCircleListener(c);
		button.addActionListener(listener);
		//c.addMouseMotionListener(listener);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
	
}
