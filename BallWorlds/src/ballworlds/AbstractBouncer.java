package ballworlds;

import java.awt.geom.Point2D;

import util.Random;

/**
 * A ball that bounces off the walls.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public abstract class AbstractBouncer extends Ball {

	protected double xvelocity;
	protected double yvelocity;
	protected double radius = 5;

	/**
	 * Constructs a abstract bouncer in the given world.
	 * 
	 * @param world
	 */
	public AbstractBouncer(BallEnvironment world) {
		super(world);
		// set initial position to the center of the world
		// x and y from parameters not used... fix later?
		Point2D centerPoint = new Point2D.Double(this.getWorld().getSize().getWidth() / 2,
				this.getWorld().getSize().getHeight() / 2);
		this.setCenterPoint(centerPoint);
		setVelocity();
	}

	public AbstractBouncer(BallEnvironment world, Point2D centerPoint) {
		super(world, centerPoint);
		setVelocity();
	}

	public void setVelocity() {
		// set velocities, and prevents them from being set at 0.
		this.xvelocity = Random.randRange(-500, 500) / 100;
		this.yvelocity = Random.randRange(-500, 500) / 100;
		while (this.xvelocity == 0 && this.yvelocity == 0) {
			this.xvelocity = Random.randRange(-500, 500) / 100;
			this.yvelocity = Random.randRange(-500, 500) / 100;
		}
	}

	public void keepInTheWorld() {
		// changes point interacting with edge to point on circumference of
		// circle rather than center.
		double edgeX = 0;
		double edgeY = 0;
		if (this.xvelocity > 0 && this.yvelocity > 0) {
			edgeX = this.radius;
			edgeY = this.radius;
		} else if (this.xvelocity > 0) {
			edgeX = this.radius;
			edgeY = -this.radius;
		} else if (this.yvelocity > 0) {
			edgeX = -this.radius;
			edgeY = this.radius;
		} else {
			edgeX = -this.radius;
			edgeY = -this.radius;
		}
		// bounce off
		Point2D edgePoint = new Point2D.Double(this.getCenterPoint().getX() + edgeX,
				this.getCenterPoint().getY() + edgeY);
		if (!this.getWorld().isInsideWorldY(edgePoint)) {
			this.yvelocity = -this.yvelocity;
		}
		if (!this.getWorld().isInsideWorldX(edgePoint)) {
			this.xvelocity = -this.xvelocity;
		}
	}

	@Override
	public void updatePosition() {
		Point2D movingCenter = new Point2D.Double(this.getCenterPoint().getX() + this.xvelocity,
				this.getCenterPoint().getY() + this.yvelocity);
		this.setCenterPoint(movingCenter);
		keepInTheWorld();
	}

}
