import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * This class starts the SunViewer exam problem
 * 
 * @author Amanda Stouder. Created Mar 26, 2014.
 */
public class SunViewer {
	private static final Dimension FRAME_SIZE = new Dimension(750,600);

	/**
	 * Starts the viewer.
	 *
	 * @param args ignored
	 */
	public static void main(String[] args) {
		JFrame sunFrame = new JFrame();
		
		sunFrame.setTitle("Suns!");
		sunFrame.setSize(FRAME_SIZE);
		
		sunFrame.add(new SunComponent());
		
		sunFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sunFrame.setVisible(true);
	}
}
