import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class GoBoard {

	private final int CENTER_X = 200;
	private final int CENTER_Y = 200;
	private final int CELL_WIDTH = 30;

	private ArrayList<Integer> xCoord;
	private ArrayList<Integer> yCoord;
	private ArrayList<Color> color;

	private final int STONE_DIAMETER = 26;

	public GoBoard() {
		this.xCoord = new ArrayList<Integer>();
		this.yCoord = new ArrayList<Integer>();
		this.color = new ArrayList<Color>();
	}

	public void drawOn(Graphics2D g) {
		// TODO Your code here
		// State 1 & 2
		g.setColor(Color.black);
		for (int i = -4; i < 5; i++) {
			g.drawLine(CENTER_X + i * CELL_WIDTH, (int) (CENTER_Y - 4.5 * CELL_WIDTH), CENTER_X + i * CELL_WIDTH,
					(int) (CENTER_Y + CELL_WIDTH * 4.5));
		}
		for (int j = -4; j < 5; j++) {
			g.drawLine((int) (CENTER_X - 4.5 * CELL_WIDTH), CENTER_Y + j * CELL_WIDTH,
					(int) (CENTER_X + 4.5 * CELL_WIDTH), CENTER_Y + j * CELL_WIDTH);
		}
		g.fillOval(200 - STONE_DIAMETER / 2, 200 - STONE_DIAMETER / 2, STONE_DIAMETER, STONE_DIAMETER);
		g.setColor(Color.white);
		g.fillOval(200 - STONE_DIAMETER / 2 - CELL_WIDTH, 200 - STONE_DIAMETER / 2 - CELL_WIDTH, STONE_DIAMETER,
				STONE_DIAMETER);
		for (int k = 0; k < xCoord.size(); k++) {
			g.setColor(color.get(k));
			g.fillOval(200 - STONE_DIAMETER / 2 + xCoord.get(k) * CELL_WIDTH,
					200 - STONE_DIAMETER / 2 + yCoord.get(k) * CELL_WIDTH, STONE_DIAMETER, STONE_DIAMETER);
		}
	}

	/**
	 * This function adds a stone to the board at the specified coordinates. 0,0
	 * adds a stone in the center. 0,2 adds a stone two below the center.
	 * 
	 * @param color
	 *            - color of the stone to place
	 * @param x
	 *            - in our go coordinate system
	 * @param y
	 *            - in our go coordinate system
	 */

	public void placeStone(Color color, int x, int y) {
		// TODO Your code here
		// State 2
		this.color.add(color);
		this.xCoord.add(x);
		this.yCoord.add(y);
	}
}
