package events;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ColorListener implements ActionListener {

	private JButton button;
	private ColoredSquareComponent component;

	public ColorListener(JButton button, ColoredSquareComponent component) {
		this.button = button;
		this.component = component;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (this.button.getText().equals("Red")) {
			this.component.changeColor(Color.red);
		} else if (this.button.getText().equals("Blue")) {
			this.component.changeColor(Color.blue);
		} else if (this.button.getText().equals("Green")) {
			this.component.changeColor(Color.green);
		}
	}
}
