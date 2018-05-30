import java.awt.Color;
import java.awt.Graphics2D;

public class PineTree {
	private int height;
	private int width;
	private int x;
	private int y;

	public PineTree(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	
	public void drawOn(Graphics2D g3) {
		Color brown=new Color(145,112,23);
		g3.setColor(brown);
		g3.fillRect(this.x+this.width/3, this.y+this.height*2/3, this.width/3, this.height/3);
		Color green = new Color(40, 135, 22);
		g3.setColor(green);
		int[] xArray=new int[3];
		int[] yArray=new int[3];
		xArray[0]=this.x+this.width/2;
		xArray[1]=this.x;
		xArray[2]=this.x+this.width;
		yArray[0]=this.y;
		yArray[1]=this.y+this.height*2/3;
		yArray[2]=this.y+this.height*2/3;
		g3.fillPolygon(xArray, yArray, 3);
	}
}
