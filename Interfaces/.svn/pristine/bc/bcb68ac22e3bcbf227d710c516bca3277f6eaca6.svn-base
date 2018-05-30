package numberSequence;

public class Fibonacci implements Sequence {
	private int first;
	private int second;

	public Fibonacci(){
		this.first=1;
		this.second=0;
	}
	
	@Override
	public int next() {
		int temp = this.second;
		this.second = this.first + this.second;
		this.first = temp;
		return this.second;
	}

	@Override
	public void reset() {
		this.first = 1;
		this.second = 0;

	}

}
