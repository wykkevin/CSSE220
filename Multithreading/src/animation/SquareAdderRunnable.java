package animation;

public class SquareAdderRunnable implements Runnable{
	
	private AnimationComponent component;
	
	SquareAdderRunnable(AnimationComponent component){
		this.component=component;
	}

	@Override
	public void run() {
		try {
			while (true) {
				this.component.addSquare();
				Thread.sleep(100);
			}
		} catch (InterruptedException exception) {
			throw new RuntimeException("Unexpected thread interrupt");
		}
	}

}
