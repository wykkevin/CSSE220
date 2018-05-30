package text;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Sentence class.
 *
 * @author Curt Clifton
 */
public class SentenceTest {

	private Sentence empty;
	private Sentence repeats;
	private Sentence clapton;

	/**
	 * Sets up some test sentences.
	 *
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.empty = new Sentence("");
		this.repeats = new Sentence("foo foo foo");
		this.clapton = new Sentence("Lay down, Sally");
	}

	/**
	 * Test method for {@link text.Sentence#find(java.lang.String)}.
	 */
	@Test
	public void testFind1() {
		assertFalse(this.repeats.find("bar"));
	}
	
	/**
	 * Test method for {@link text.Sentence#find(java.lang.String)}.
	 */
	@Test
	public void testFind2() {
		assertTrue(this.repeats.find("foo"));
	}
	
	/**
	 * Test method for {@link text.Sentence#find(java.lang.String)}.
	 */
	@Test
	public void testFind3() {
		assertFalse(this.clapton.find("Mary"));
	}
	
	/**
	 * Test method for {@link text.Sentence#find(java.lang.String)}.
	 */
	@Test
	public void testFind4() {
		assertTrue(this.clapton.find("Sally"));
	}
	
	/**
	 * Test method for {@link text.Sentence#find(java.lang.String)}.
	 */
	@Test
	public void testFind5() {
		assertFalse(this.empty.find("Rose"));
	}
	
	/**
	 * Test method for {@link text.Sentence#find(java.lang.String)}.
	 */
	@Test
	public void testFind6() {
		assertTrue(this.empty.find(""));
	}

	/**
	 * Test method for {@link text.Sentence#indexOf(java.lang.String)}.
	 */
	@Test
	public void testIndexOf1() {
		assertEquals(0, this.repeats.indexOf("foo"));
	}
	
	/**
	 * Test method for {@link text.Sentence#indexOf(java.lang.String)}.
	 */
	@Test
	public void testIndexOf2() {
		assertEquals(3, this.repeats.indexOf(" foo "));
	}
	
	/**
	 * Test method for {@link text.Sentence#indexOf(java.lang.String)}.
	 */
	@Test
	public void testIndexOf3() {
		assertEquals(-1, this.repeats.indexOf("bar"));
	}
	
	/**
	 * Test method for {@link text.Sentence#indexOf(java.lang.String)}.
	 */
	@Test
	public void testIndexOf4() {
		assertEquals(10, this.clapton.indexOf("Sally"));
	}
	
	/**
	 * Test method for {@link text.Sentence#indexOf(java.lang.String)}.
	 */
	@Test
	public void testIndexOf5() {
		assertEquals(-1, this.empty.indexOf("Rose"));
	}
	
	/**
	 * Test method for {@link text.Sentence#indexOf(java.lang.String)}.
	 */
	@Test
	public void testIndexOf6() {
		assertEquals(0, this.empty.indexOf(""));
	}

}
