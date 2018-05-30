package paperPart;

/**
 * Demonstrates method overriding.
 * 
 * @author Curt Clifton.
 */
public class InheritanceExample {
	interface Top {
		public void alpha();

		public void beta();
	}

	class Zero implements Top {
		public void alpha() {
			System.out.println("X");
		}

		public void beta() {
			System.out.println("Y");
		}
	}

	class One implements Top {
		public void alpha() {
			System.out.print("A");
			this.beta();
		}

		public void beta() {
			System.out.println("B");
		}
	}

	class Two extends One {
		public void beta() {
			System.out.println("C");
		}

		public void gamma() {
			System.out.println("D");
		}
	}

	/**
	 * Runs the example.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		new InheritanceExample().run();
	}

	private void run() {
		Top p = new Zero();
		Top q = new One();
		One r = new Two();
		Two s = new Two();

		// p.gamma(); compile error
		// q.gamma(); compile error
		// r.gamma(); compile error
		s.gamma();

		p.beta();
		q.beta();
		r.beta();
		s.beta();

		p.alpha();
		q.alpha();
		r.alpha();
		s.alpha();
	}

}
