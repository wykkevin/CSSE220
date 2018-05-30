import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Class for bricks.
 */
public class Wall {

	private Point position;
	private int imageNumber;
	public Powerup powerup;

	public Wall(Point position, int hardness) {
		// Both the width and height of the wall are 50
		this.position = position;
		this.imageNumber = hardness;
	}

	public void destroy() {
		System.out.println("Bye bye");
	}

	public void draw(Graphics2D g2) {
		if (this.imageNumber == 1) {
			BufferedImage brick1;
			try {
				brick1 = ImageIO.read(new File("src/image/brick1.jpg"));
				g2.drawImage(brick1, this.position.x, this.position.y, 50, 50, null);
			} catch (IOException exception) {
				System.out.println("Unexpected IOException");
			}
		}
		if (this.imageNumber == 2) {
			BufferedImage brick2;
			try {
				brick2 = ImageIO.read(new File("src/image/brick2.png"));
				g2.drawImage(brick2, this.position.x, this.position.y, 50, 50, null);
			} catch (IOException exception) {
				System.out.println("Unexpected IOException");
			}
		}
		if (this.imageNumber == 4) {
			BufferedImage extraLife;
			try {
				extraLife = ImageIO.read(new File("src/image/ExtraLife.jpg"));
				g2.drawImage(extraLife, this.position.x, this.position.y, 50, 50, null);
			} catch (IOException exception) {
				System.out.println("Unexpected IOException");
			}
		}

		if (this.imageNumber == 5) {
			BufferedImage extraBomb;
			try {
				extraBomb = ImageIO.read(new File("src/image/ExtraBomb.png"));
				g2.drawImage(extraBomb, this.position.x, this.position.y, 50, 50, null);
			} catch (IOException exception) {
				System.out.println("Unexpected IOException");
			}
		}

		if (this.imageNumber == 6) {
			BufferedImage longerRange;
			try {
				longerRange = ImageIO.read(new File("src/image/LongerRange.png"));
				g2.drawImage(longerRange, this.position.x, this.position.y, 50, 50, null);
			} catch (IOException exception) {
				System.out.println("Unexpected IOException");
			}
		}

		if (this.imageNumber == 7) {
			BufferedImage bombUpgrade;
			try {
				bombUpgrade = ImageIO.read(new File("src/image/BombUpgrade.jpg"));
				g2.drawImage(bombUpgrade, this.position.x, this.position.y, 50, 50, null);
			} catch (IOException exception) {
				System.out.println("Unexpected IOException");
			}
		}

		if (this.imageNumber == 8) {
			BufferedImage bombAction1;
			try {
				bombAction1 = ImageIO.read(new File("src/image/bombAction1.png"));
				g2.drawImage(bombAction1, this.position.x, this.position.y, 50, 50, null);
			} catch (IOException exception) {
				System.out.println("Unexpected IOException");
			}
		}

		if (this.imageNumber == 9) {
			BufferedImage bombAction2;
			try {
				bombAction2 = ImageIO.read(new File("src/image/bombAction2.png"));
				g2.drawImage(bombAction2, this.position.x, this.position.y, 50, 50, null);
			} catch (IOException exception) {
				System.out.println("Unexpected IOException");
			}
		}
	}
}
