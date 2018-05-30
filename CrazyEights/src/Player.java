import java.util.ArrayList;

/**
 * 
 * Class creates a Player object and keeps track of player's cards in hand.
 *
 * @author oswoodel.
 *         Created Jan 8, 2017.
 */
public class Player {

	private ArrayList<String> cards;

	public Player() {
		this.cards = new ArrayList<String>();
	}

	public void drawCard(String card) {
		this.cards.add(card);
	}

	public ArrayList<String> getCards() {
		return this.cards;
	}

	public void removeCard(String card) {
		this.cards.remove(card);
	}
}
