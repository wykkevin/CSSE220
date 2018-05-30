package dots;

import javax.swing.JFrame;

/**
 * Starts the dot drawing program.
 *
 * @author Curt Clifton
 */
public class Main {

	/**
	 * Starts the dot drawing program.
	 *
	 * @param args ignored
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Dots");
		
		Dotter dotter = new MyDotter();
		DotDisplay dd = new DotDisplay(dotter);
		frame.add(dd);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
