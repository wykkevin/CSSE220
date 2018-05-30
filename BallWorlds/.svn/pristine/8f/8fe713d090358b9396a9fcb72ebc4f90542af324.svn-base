package ballworlds;

import java.awt.Color;
import java.awt.geom.Point2D;

import util.Random;

/**
 * 
 * An Exploder behaves like a Bouncer, except that as it moves/bounces, it also
 * picks a random size between 2 and 10 times its initial size, and slowly grows
 * to that size. When it reaches that random size, it dies. When it reaches that
 * random size, it constructs two new Exploders, each starting where the
 * original Exploder died.
 *
 * @author Emma Oswood, Yuankai Wang. Created Jan 19, 2017.
 */
public class Exploder extends AbstractBouncer {
	private double targetSize = Random.randRange(10, 50);

	public Exploder(BallEnvironment world) {
		super(world);
	}

	// constructor for all Exploders made after the initial. It sets the center
	// point at a specified point, rather than in the center.
	public Exploder(BallEnvironment world, Point2D centerPoint) {
		super(world, centerPoint);
	}

	@Override
	public Color getColor() {
		return Color.yellow;
	}

	@Override
	public void updateSize() {
		this.radius = this.radius * 1.01;
		if (this.radius >= this.targetSize) {
			explode();
		}

	}

	private void explode() {
		for (int i = 0; i < 2; i++) {
			Exploder newExploder = new Exploder(this.getWorld(), this.getCenterPoint());
			this.getWorld().addBall(newExploder);
		}
		this.getWorld().removeBall(this);
	}

	@Override
	public void updateColor() {
		// does nothing for exploder

	}

	@Override
	public double getDiameter() {
		return this.radius * 2;
	}

}
