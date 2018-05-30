package listenerExamples;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DrawViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400,600);
		JButton clearButton = new JButton("Clear Screen");
		
		DrawComponent component = new DrawComponent();
		
		//TODO: Create a drawListener that takes in a DrawComponent and 
		//implements MouseListener, then comment in the next two lines
//		MouseListener dl = new DrawListener(component);
		

	//	component.addMouseListener(dl);
		
//		ActionListener a=new MouseClick(component);
		
		
		MouseClick myClick=new MouseClick(component);
		component.addMouseListener(myClick);
		
		frame.add(component, BorderLayout.CENTER);
		frame.add(clearButton, BorderLayout.SOUTH);
		
		//TODO: Add ActionListener for the clearButton by
		//implementing an anonymous class that calls the
		//clear method of the DrawComponent. You may need
		//to make a minor change to the DrawComponent declaration above.
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
