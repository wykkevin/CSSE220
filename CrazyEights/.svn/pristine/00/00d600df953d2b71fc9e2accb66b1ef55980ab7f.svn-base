import java.util.ArrayList;
import java.util.Scanner;

public class CrazyEights {

	/**
	 * These fields track players, the deck used and the turn of the player.
	 */

	private ArrayList<Player> players;
	private Deck deck;
	private int turnIndex;

	public CrazyEights() {
		this.players = new ArrayList<Player>();
	}

	/**
	 * Decodes a command and invokes the right method. You may update this
	 * method if you find it's necessary for your design, but be careful you
	 * don't break anything. If you make changes to this method, do it in very
	 * small increments and frequently run the tests.
	 * 
	 * @param command
	 *            The command to decode
	 * @return the results of the command. "ok" if success but no result.
	 */
	@SuppressWarnings("resource")
	public String handleCommand(String command) {
		Scanner input = new Scanner(command);
		String commandType = input.next();
		String toReturn = null;

		if (commandType.equals("start-game")) {
			int numPlayers = input.nextInt();
			String deckName = null;
			boolean shuffle = true;
			if (input.hasNext()) {
				deckName = input.next();
			}
			if (input.hasNext()) {
				if (input.hasNextBoolean()) {
					shuffle = input.nextBoolean();
				} else {
					return "Please enter a boolean for shuffle.";
				}
			}
			toReturn = handleStartGame(numPlayers, deckName, shuffle);
		} else if (commandType.equals("play-card")) {

			String cardValue = input.next();
			if (this.players.size() != 0) {
				toReturn = handlePlayCard(cardValue);
			} else {
				toReturn = "Please start a game first.";
			}
		} else if (commandType.equals("draw-card")) {
			if (this.players.size() != 0) {
				toReturn = handleDrawCard();
			} else {
				toReturn = "Please start a game first.";
			}

		} else if (commandType.equals("exit")) {
			input.close();
			System.exit(0);
		} else {
			toReturn = "Unknown command " + commandType + "\n" + playerInfo();
		}
		input.close();
		return toReturn;
	}

	/**
	 * Handles starting a game for the specified number of players with the
	 * specified deck.
	 */
	private String handleStartGame(int numPlayers, String deckName, boolean shuffle) {
		// DONE: Implement this
		this.players = new ArrayList<Player>();
		this.turnIndex = 1;
		if (!(numPlayers == 2 || numPlayers == 3 || numPlayers == 4)) {
			return "Incorrect number of players, must be between 2 and 4.";
		}

		for (int i = 1; i <= numPlayers; i++) {
			Player newPlayer = new Player();
			this.players.add(newPlayer);
		}

		if (deckName == null) {
			this.deck = new Deck();
		} else if (deckName.equals("testDeck") || deckName.equals("standardDeck")) {
			this.deck = new Deck(deckName);
		} else {
			return "Deck name not valid. Please try again.";
		}

		if (shuffle == true) {
			this.deck.shuffle();
		} else if (shuffle == false) {
			return deal() + "\n" + playerInfo();
		} else {
			System.out.println("Please enter a boolean for shuffle.");
			return "Please enter a boolean for shuffle.";
		}

		return deal() + "\n" + playerInfo();
	}

	/**
	 * Performs the initial distribution of cards to players.
	 */
	private String deal() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < this.players.size(); j++) {
				this.players.get(j).drawCard(this.deck.drawCard());
			}
		}
		// adds first card to discard pile.
		this.deck.addDiscardPile(this.deck.drawCard());
		return "Cards dealt.";
	}

	/**
	 * Handles the play-card command.
	 * 
	 * @param cardValue
	 *            - The value (rank and suit) of the card to play.
	 * @return The string message to display to the user before the game state
	 *         text.
	 */
	private String handlePlayCard(String cardValue) {
		Player currentPlayer = this.players.get(this.turnIndex - 1);
		boolean hasPlayableCard = false;
		String card = "";

		for (int i = 0; i < currentPlayer.getCards().size(); i++) {
			String testCard = currentPlayer.getCards().get(i);
			if (cardValue.equals(testCard)) {
				card = testCard;
				hasPlayableCard = true;
				// checks that card is playable.
				if (card.substring(0, card.length() - 1)
						.equals(this.deck.getLastCardOfDiscardPile().substring(0,
								this.deck.getLastCardOfDiscardPile().length() - 1))
						|| card.substring(card.length() - 1, card.length())
								.equals(this.deck.getLastCardOfDiscardPile().substring(
										this.deck.getLastCardOfDiscardPile().length() - 1,
										this.deck.getLastCardOfDiscardPile().length()))
						|| card.substring(0, 1).equals("8")) {
					this.deck.addDiscardPile(card);
					currentPlayer.removeCard(card);
				} else {
					hasPlayableCard = false;
				}
			}
		}

		if (hasPlayableCard == false) {
			return "Card was not valid for play. Please try again." + "\n" + playerInfo();
		}

		// tests for winning case.
		if (currentPlayer.getCards().size() == 0) {
			return "Player " + this.turnIndex + " wins!";
		}

		changeTurnIndex();
		return "Card " + card + " played." + "\n" + playerInfo();
	}

	/**
	 * Handles the draw-card command.
	 * 
	 * @return The string message to display to the user before the game state
	 *         text.
	 */
	private String handleDrawCard() {
		// DONE: Implement this
		Player currentPlayer = this.players.get(this.turnIndex - 1);

		String cardDrawn = this.deck.drawCard();
		this.players.get(this.turnIndex - 1).drawCard(cardDrawn);
		return "Card " + cardDrawn + " was drawn." + "\n" + playerInfo();
	}

	/**
	 * Returns information on Player's number, cards held in hand, and card on
	 * top of discard pile.
	 */
	private String playerInfo() {
		String returnString = "";
		String playerCard = "";
		for (int i = 0; i < this.players.get(this.turnIndex - 1).getCards().size(); i++) {
			playerCard += this.players.get(this.turnIndex - 1).getCards().get(i) + " ";
		}
		returnString = "Player " + this.turnIndex + ", your turn." + "\n" + "Your cards are " + playerCard + "\n"
				+ "The top discard is " + this.deck.getLastCardOfDiscardPile();
		return returnString;
	}

	/*
	 * Updates which player's turn it is.
	 */
	private void changeTurnIndex() {
		if (this.turnIndex >= this.players.size()) {
			this.turnIndex = 1;
		} else {
			this.turnIndex++;
		}
	}

	/**
	 * 
	 * Run the CrazyEights in console mode (that is, input is to come from the
	 * console).
	 * 
	 * THIS METHOD IS WRITTEN FOR YOU - no need to edit
	 * 
	 * @param args
	 *            Command line arguments (ignored)
	 */
	public static void main(String[] args) {
		CrazyEights game = new CrazyEights();
		System.out.println("Welcome to CrazyEights.  Enter commands.  Type 'exit' to end.");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String commandLine = scanner.nextLine();
			String result = game.handleCommand(commandLine);
			System.out.println(result);
		}

	}

}
