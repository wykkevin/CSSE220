import java.util.Iterator;

/**
 * A Cool class that would be even cooler if it used generics and iterators
 * 
 * It represents a pair of two objects of the same type. Right now it's only a
 * pair of ints, but we want it to be a pair of anythings
 * 
 * @author hewner
 *
 */
public class CoolPair<MyType> implements Iterable<MyType> {

	private MyType first, last;

	public CoolPair(MyType first, MyType last) {
		this.first = first;
		this.last = last;
	}

	public String toString() {
		return "(" + this.first + ", " + this.last + ")";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoolPair<Integer> pair = new CoolPair(5, 6);
		System.out.println("Woohoo!: " + pair.toString());

		Iterator<Integer> current = pair.iterator();
		while (current.hasNext()) {
			int val = current.next();
			System.out.println(val);
		}

		for (int val : pair) {
			System.out.println(val);
		}
	}

	private class CoolPairIterator implements Iterator<MyType> {

		int position = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub.
			return position < 2;
		}

		@Override
		public MyType next() {
			MyType valueToReturn;
			if (position == 0) {
				valueToReturn = first;
			} else {
				if (position == 1) {
					valueToReturn = last;
				} else {
					throw new RuntimeException("read too far");
				}
			}
			position++;
			return valueToReturn;
		}

	}

	@Override
	public Iterator<MyType> iterator() {
		return new CoolPairIterator();
	}

}
