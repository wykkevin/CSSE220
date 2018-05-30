package listenerExamples;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseClick implements MouseListener,ActionListener {

	private DrawComponent mycomponent;

	public MouseClick(DrawComponent component) {
		this.mycomponent = component;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("aaa");
		if (e.getModifiers() == e.BUTTON1_MASK) {
			this.mycomponent.addSquare(e.getX(), e.getY(), 10, Color.red);
		}
		if (e.getButton() == MouseEvent.BUTTON3) {
			this.mycomponent.addCircle(e.getX(), e.getY(), 10, Color.blue);
		}
		this.mycomponent.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Clear");
		this.mycomponent.clear();
		this.mycomponent.repaint();
	}

}
