package paperPart;

/**
 * Simple recursion.
 * 
 * @author Curt Clifton
 */
public class Recur {
	public static void main(String[] args) {
		Recur rec = new Recur();
		int answer = rec.g(8);

		System.out.println(answer);
	}

	private int g(int n) {
		if (n <= 1)
			return 2;
		int p = this.g(n / 2);
		return n - p;
	}
}
