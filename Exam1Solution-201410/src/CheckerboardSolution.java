import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;


public class CheckerboardSolution {

	
	private int x, y;
	private int width, height, rows, columns;
	private ArrayList<Color> colors;
	
	/**
	 * When no additional parametes are set, Checkerboard
	 * creates a 3 column 2 row checkerboard with a width of 750 and height of 500
	 * with it's upper left corner at the given x and y coordinates
	 * 
	 * @param x
	 * @param y
	 */
	public CheckerboardSolution(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.width = 750;
		this.height = 500;
		this.columns = 3;
		this.rows = 2;
		this.colors = new ArrayList<Color>();
		this.colors.add(Color.white);
		this.colors.add(Color.black);
	}
	
	/**
	 * Sets the number of horizontal rows
	 * 
	 * @param rows
	 */
	public void setNumberOfRows(int rows)
	{
		this.rows = rows;
	}
	
	/**
	 * Sets the number of vertical columns
	 * 
	 * @param cols
	 */
	public void setNumberOfColumns(int cols)
	{
		this.columns = cols;
	}
	
	/**
	 * Sets the width of the checkerboard
	 * 
	 * @param width in pixels
	 */
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	/**
	 * Sets the height of the checkerboard
	 * 
	 * @param height
	 */
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	/**
	 * Adds an additional color to the rotation
	 * 
	 * @param color
	 */
	public void addColor(Color color)
	{
		this.colors.add(color);
	}
	
	public void drawOn(Graphics2D g2) {
		
		int boxWidth = this.width/this.columns;
		int boxHeight = this.height/this.rows;
		
		int colorNum = 0;
		
		g2.translate(this.x, this.y);
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++) {
				Rectangle r = new Rectangle(boxWidth*j, boxHeight*i, boxWidth, boxHeight);
				System.out.println(r);
				g2.setColor(this.colors.get(colorNum % this.colors.size()));
				colorNum++;
				g2.fill(r);
			}
		}
		g2.translate(-this.x, -this.y);
	}
}
