import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class ResponsiveCircleListener implements ActionListener, MouseMotionListener{

	private ResponsiveCircleComponent component;
	
	public ResponsiveCircleListener(ResponsiveCircleComponent c) {
		this.component = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button pressed!");
		component.cycleColor();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		component.setCenter(e.getX(), e.getY());
		
	}

}
