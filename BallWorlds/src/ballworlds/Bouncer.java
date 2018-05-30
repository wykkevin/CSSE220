package ballworlds;

import java.awt.Color;

/**
 * 
 * Bouncer behaves just like a Mover, except that it bounces off the edges of
 * its world.
 *
 * @author Emma Oswood, Yuankai Wang Created Jan 20, 2017.
 */
public class Bouncer extends AbstractBouncer {

	public Bouncer(BallEnvironment world) {
		super(world);
		this.radius = 20;
	}

	@Override
	public Color getColor() {
		return Color.orange;
	}

	@Override
	public void updateSize() {
		// Does nothing for bouncer
	}

	@Override
	public void updateColor() {
		// Does nothing for bouncer
	}

	@Override
	public double getDiameter() {
		return this.radius * 2;
	}
}
