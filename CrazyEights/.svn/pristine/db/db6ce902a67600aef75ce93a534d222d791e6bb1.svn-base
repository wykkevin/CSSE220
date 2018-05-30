import org.junit.Before;
import org.junit.Test;

public class CrazyEightsTest {

	private CrazyEights game;

	@Before
	public void setUp() throws Exception {
		game = new CrazyEights();
	}

	/*
	 * Test if the deck name is valid.
	 */
	@Test
	public void testDeckName() {
		String[] expected = new String[] { "Deck name not valid. Please try again." };
		String[] result = game.handleCommand("start-game 2 gameDeck false").split("\n");
		compareStringArrayResults(expected, result);
	}

	/*
	 * Test if the game has started before enter other commands.
	 */
	@Test
	public void testCommandAvailability() {
		String[] expected = new String[] { "Please start a game first." };
		String[] result1 = game.handleCommand("draw-card").split("\n");
		String[] result2 = game.handleCommand("play-card 8H").split("\n");
		compareStringArrayResults(expected, result1);
		compareStringArrayResults(expected, result2);
	}

	/*
	 * Test if the enter for shuffle is a boolean.
	 */
	@Test
	public void testShuffleWorks() {
		String[] expected = new String[] { "Please enter a boolean for shuffle." };
		String[] result = game.handleCommand("start-game 2 testDeck notboolean").split("\n");
		compareStringArrayResults(expected, result);
	}

	private static void compareStringArrayResults(String[] expected, String[] actual) {
		String expectedResults = "";
		String actualResults = "";
		for (String s : expected) {
			expectedResults += s.trim() + "\n";
		}
		for (String s : actual) {
			actualResults += s.trim() + "\n";
		}

	}
}
