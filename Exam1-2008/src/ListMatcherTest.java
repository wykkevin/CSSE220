import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests ListMatcher
 * 
 * @author Curt Clifton. Created Sep 30, 2008.
 */
public class ListMatcherTest {

	private ArrayList<Integer> empty;
	private ArrayList<Integer> countUp;
	private ArrayList<Integer> countDown;
	private ArrayList<Integer> upDupes;
	private ArrayList<Integer> inDupes;

	private ArrayList<Integer> emptyClone;
	private ArrayList<Integer> countUpClone;
	private ArrayList<Integer> countDownClone;
	private ArrayList<Integer> upDupesClone;
	private ArrayList<Integer> inDupesClone;

	/**
	 * Test method for
	 * {@link ListMatcher#areMatching(java.util.ArrayList, java.util.ArrayList)}
	 * .
	 */
	@Before
	public void setUp() {
		this.empty = new ArrayList<Integer>();
		this.countUp = new ArrayList<Integer>();
		this.countDown = new ArrayList<Integer>();
		this.upDupes = new ArrayList<Integer>();
		this.inDupes = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			this.countUp.add(i);
			this.countDown.add(9 - i);
			this.upDupes.add(i);
			this.upDupes.add(i);
			this.inDupes.add(i);
			this.inDupes.add(9 - i);
		}
		
		this.emptyClone = new ArrayList<Integer>(this.empty);
		this.countUpClone = new ArrayList<Integer>(this.countUp);
		this.countDownClone = new ArrayList<Integer>(this.countDown);
		this.upDupesClone = new ArrayList<Integer>(this.upDupes);
		this.inDupesClone = new ArrayList<Integer>(this.inDupes);

	}

	/**
	 * Test method for
	 * {@link ListMatcher#areMatching(java.util.ArrayList, java.util.ArrayList)}
	 * .
	 */
	@Test
	public void testAreMatchingEmpty1() {
		assertTrue(ListMatcher.areMatching(this.empty, this.empty));
		verifyListsUnchanged();
	}

	/**
	 * Test method for
	 * {@link ListMatcher#areMatching(java.util.ArrayList, java.util.ArrayList)}
	 * .
	 */
	@Test
	public void testAreMatchingEmpty2() {
		assertFalse(ListMatcher.areMatching(this.empty, this.countUp));
		verifyListsUnchanged();
	}
	/**
	 * Test method for
	 * {@link ListMatcher#areMatching(java.util.ArrayList, java.util.ArrayList)}
	 * .
	 */
	@Test
	public void testAreMatchingEmpty3() {
		assertFalse(ListMatcher.areMatching(this.countUp, this.empty));
		verifyListsUnchanged();
	}

	/**
	 * Test method for
	 * {@link ListMatcher#areMatching(java.util.ArrayList, java.util.ArrayList)}
	 * .
	 */
	@Test
	public void testAreMatchingUp1() {
		assertTrue(ListMatcher.areMatching(this.countUp, this.countUp));
		verifyListsUnchanged();
	}

	/**
	 * Test method for
	 * {@link ListMatcher#areMatching(java.util.ArrayList, java.util.ArrayList)}
	 * .
	 */
	@Test
	public void testAreMatchingUp2() {
		assertTrue(ListMatcher.areMatching(this.countUp, this.countDown));
		verifyListsUnchanged();
	}

	/**
	 * Test method for
	 * {@link ListMatcher#areMatching(java.util.ArrayList, java.util.ArrayList)}
	 * .
	 */
	@Test
	public void testAreMatchingUp3() {
		assertTrue(ListMatcher.areMatching(this.countDown, this.countUp));
		verifyListsUnchanged();
	}

	/**
	 * Test method for
	 * {@link ListMatcher#areMatching(java.util.ArrayList, java.util.ArrayList)}
	 * .
	 */
	@Test
	public void testAreMatchingUp4() {
		assertFalse(ListMatcher.areMatching(this.countUp, this.upDupes));
		verifyListsUnchanged();
	}

	/**
	 * Test method for
	 * {@link ListMatcher#areMatching(java.util.ArrayList, java.util.ArrayList)}
	 * .
	 */
	@Test
	public void testAreMatchingUp5() {
		assertFalse(ListMatcher.areMatching(this.upDupes, this.countUp));
		verifyListsUnchanged();
	}

	/**
	 * Test method for
	 * {@link ListMatcher#areMatching(java.util.ArrayList, java.util.ArrayList)}
	 * .
	 */
	@Test
	public void testAreMatchingDupes1() {
		assertTrue(ListMatcher.areMatching(this.upDupes, this.upDupes));
		verifyListsUnchanged();
	}

	/**
	 * Test method for
	 * {@link ListMatcher#areMatching(java.util.ArrayList, java.util.ArrayList)}
	 * .
	 */
	@Test
	public void testAreMatchingDupes2() {
		assertTrue(ListMatcher.areMatching(this.upDupes, this.inDupes));
		verifyListsUnchanged();
	}

	/**
	 * Test method for
	 * {@link ListMatcher#areMatching(java.util.ArrayList, java.util.ArrayList)}
	 * .
	 */
	@Test
	public void testAreMatchingDupes3() {
		assertTrue(ListMatcher.areMatching(this.inDupes, this.upDupes));
		verifyListsUnchanged();
	}

	/**
	 * Test method for
	 * {@link ListMatcher#areMatching(java.util.ArrayList, java.util.ArrayList)}
	 * .
	 */
	@Test
	public void testAreMatchingDupes4() {
		assertTrue(ListMatcher.areMatching(this.inDupes, this.inDupes));
		verifyListsUnchanged();
	}

	/**
	 * This helper method checks that the original lists were not changed by the
	 * tests.
	 */
	@Test
	public void verifyListsUnchanged() {
		assertTrue(this.empty.equals(this.emptyClone));
		assertTrue(this.countUp.equals(this.countUpClone));
		assertTrue(this.countDown.equals(this.countDownClone));
		assertTrue(this.upDupes.equals(this.upDupesClone));
		assertTrue(this.inDupes.equals(this.inDupesClone));
	}

}
