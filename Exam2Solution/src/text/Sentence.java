package text;

/**
 * This class implements a sentence with some basic search methods.
 *
 * @author Curt Clifton.
 */
public class Sentence {
	private String text;
	
	/**
	 * Constructs a sentence object with the given text.
	 *
	 * @param text
	 */
	public Sentence(String text) {
		this.text = text;
	}
	
	/**
	 * Searches for the given string in this sentence.
	 *
	 * @param t
	 * @return true if t is in this sentence
	 */
	public boolean find(String t) {
		// TODO: implement this method recursively, you may use a helper method
		if (this.text.startsWith(t))
			return true;
		final int length = this.text.length();
		if (length == 0 || length < t.length())
			return false;
		Sentence s = new Sentence(this.text.substring(1));
		return s.find(t);
	}
	
	/**
	 * Finds the starting position of the first substring of this sentence that
	 * matches the given string.  Or returns -1 if t is not a substring of this
	 * sentence. 
	 *
	 * @param t
	 * @return the starting position, or -1 if not found
	 */
	public int indexOf(String t) {
		// TODO: implement this method recursively, you may use a helper method
		if (this.text.startsWith(t)) {
			return 0;
		}
		final int length = this.text.length();
		if (length == 0 || length < t.length())
			return -1;
		Sentence s = new Sentence(this.text.substring(1));
		int i = s.indexOf(t);
		if (i == -1)
			return -1;
		else
			return 1 + i;
	}
}
