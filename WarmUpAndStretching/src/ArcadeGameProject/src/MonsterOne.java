import java.awt.Point;

/**
 * This is a class for monster one
 */
public class MonsterOne extends Monster {

	public MonsterOne(GameComponent component, Hero hero) {
		super(component, hero);
		this.life = 1;
	}

	@Override
	public String getName() {
		return "monster1";
	}

	// this monster goes everywhere it wants.
	@Override
	public void run() {
		while (true) {
			if (this.component.getPaused() == false) {
				double random0To4 = (int) (Math.random() * 4);
				if (random0To4 == 0 && this.movable("up") && this.getPosition().y > 0) {// up
					Point newPosition = new Point(this.position.x, this.position.y - this.speed);
					this.setPosition(newPosition);
				}
				if (random0To4 == 1 && this.movable("down") && this.getPosition().y < 650) {// down
					Point newPosition = new Point(this.position.x, this.position.y + this.speed);
					this.setPosition(newPosition);
				}
				if (random0To4 == 2 && this.movable("left") && this.getPosition().x > 0) {// left
					Point newPosition = new Point(this.position.x - this.speed, this.position.y);
					this.setPosition(newPosition);
				}
				if (random0To4 == 3 && this.movable("right") && this.getPosition().x < 650) {// right
					Point newPosition = new Point(this.position.x + this.speed, this.position.y);
					this.setPosition(newPosition);
				}
			}

			try {
				Thread.sleep(750);
			} catch (InterruptedException exception) {
				System.out.println("monsterone is killed");
			}
		}
	}
}
