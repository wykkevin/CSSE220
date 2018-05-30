package recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionProblemsTest {

	@Test
	public void testCapitalizeEveryThirdCharacter() {
		assertEquals("twist", RecursionProblems.replaceStringWithString("test", "e", "wi"));
		assertEquals("test", RecursionProblems.replaceStringWithString("aesa","a","t"));
		assertEquals("test", RecursionProblems.replaceStringWithString("test", "a", "wi"));
		assertEquals("tst", RecursionProblems.replaceStringWithString("test", "e", ""));
		assertEquals("Buffalo", RecursionProblems.replaceStringWithString("Buqealo", "qe", "ff"));
		assertEquals("test", RecursionProblems.replaceStringWithString("a", "a", "test"));
		assertEquals("", RecursionProblems.replaceStringWithString("", "a", "test"));
		assertEquals("Stouder", RecursionProblems.replaceStringWithString("Stephan", "ephan", "ouder"));
	}
}
