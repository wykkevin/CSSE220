import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * This class creates a Deck object, which keeps track of cards in draw pile and
 * cards in discard pile.
 *
 * @author oswoodel. Created Jan 8, 2017.
 */
public class Deck {

	private ArrayList<String> remainingCards;
	private ArrayList<String> discardPile;

	public Deck(String name) {
		this.remainingCards = new ArrayList<String>();

		// Checks if name provided is known.
		if (name.equals("testDeck")) {
			strListtoArrayList(NamedDecks.testDeck);
		}
		if (name.equals("standardDeck")) {
			strListtoArrayList(NamedDecks.standardDeck);
		}

		this.discardPile = new ArrayList<String>();
	}

	/*
	 * Constructor without name. Automatically uses and shuffles StandardDeck.
	 */
	public Deck() {
		this.remainingCards = new ArrayList<String>();
		strListtoArrayList(NamedDecks.standardDeck);
		this.discardPile = new ArrayList<String>();
		this.shuffle();
	}

	/*
	 * Converts String[] provided in NamedDecks to ArrayList<String> for our
	 * use.
	 */
	public void strListtoArrayList(String[] deck) {
		for (int i = 0; i < deck.length; i++) {
			this.remainingCards.add(deck[i]);
		}
	}

	public void shuffle() {
		Collections.shuffle(this.remainingCards);
	}

	/*
	 * Takes a String from remainingCards and removes it. If it was the last
	 * card, it will reshuffle the discard pile (minus top card) and put it into
	 * the remainingCards.
	 */
	public String drawCard() {
		String card = this.remainingCards.get(0);
		this.remainingCards.remove(0);
		if (remainingCards.size() == 0) {
			String topDiscard = this.discardPile.get(discardPile.size() - 1);
			this.discardPile.remove(topDiscard);
			this.remainingCards = this.discardPile;
			this.discardPile = new ArrayList<String>();
			shuffle();
			addDiscardPile(topDiscard);
		}
		return card;
	}

	public ArrayList<String> getRemainingCards() {
		return this.remainingCards;
	}

	public void addDiscardPile(String card) {
		this.discardPile.add(card);
	}

	public String getLastCardOfDiscardPile() {
		return this.discardPile.get(this.discardPile.size() - 1);
	}

}
