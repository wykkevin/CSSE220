import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class MultipartLine {
	private int xFirst;
	private int yFirst;
	private int xLast;
	private int yLast;
	private ArrayList<Integer> xAddList;
	private ArrayList<Integer> yAddList;

	public MultipartLine(int a, int b, int c, int d) {
		this.xFirst = a;
		this.yFirst = b;
		this.xLast = c;
		this.yLast = d;
		this.xAddList = new ArrayList<Integer>();
		this.yAddList = new ArrayList<Integer>();
	}

	public void drawOn(Graphics2D graphics2) {
		graphics2.setColor(Color.black);
		graphics2.drawLine(this.xFirst, this.yFirst, this.xLast, this.yLast);
		for (int i = 0; i < this.xAddList.size(); i++) {
			if (i == 0) {
				graphics2.drawLine(this.xLast, this.yLast, this.xAddList.get(0), this.yAddList.get(0));
			} else {
				graphics2.drawLine(this.xAddList.get(i - 1), this.yAddList.get(i - 1), this.xAddList.get(i),
						this.yAddList.get(i));
			}
		}
	}

	public void addPoint(int x, int y) {
		this.xAddList.add(x);
		this.yAddList.add(y);
	}

}
