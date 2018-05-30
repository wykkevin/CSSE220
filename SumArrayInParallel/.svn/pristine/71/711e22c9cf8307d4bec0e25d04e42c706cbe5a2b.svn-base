//TODO Implement the SumThread class
public class SumThread implements Runnable {
	private int[] data;
	private int startIndex;
	private int stopIndex;
	private long sum = 0;

	public SumThread(int[] data, int start, int stop) {
		this.data = data;
		this.startIndex = start;
		this.stopIndex = stop;
	}

	public long getSum() {
		return this.sum;
	}

	@Override
	public void run() {
		for (int i = this.startIndex; i < this.stopIndex; i++) {
			this.sum += this.data[i];
		}
	}
}
