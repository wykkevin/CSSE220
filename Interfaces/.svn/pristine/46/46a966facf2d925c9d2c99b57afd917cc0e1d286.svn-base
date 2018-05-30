package numberSequence;

public class AddSeveral implements Sequence{
	private int current;
	private int number;
	
	public AddSeveral(int number){
		this.current=0;
		this.number=number;
	}
	
	@Override
	public int next(){
		this.current+=this.number;
		return this.current;
	}
	
	@Override
	public void reset(){
		this.current=0;
	}
}
