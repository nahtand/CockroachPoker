import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {

    }

    /**
     * adds cards to the deck
     */
    public void addCard() {

    }

    /**
     *
     * @param index
     * @return
     */
    public Card getCard(int index) {
        return deck.get(index);

    }

    /**
     * REMOVES and returns the card
     * @param index
     * @return
     */
    public Card popCard(int index) {
        //
        Card card = deck.get(index);
        //remove card from deck
        return card;

    }

    public void showCards() {

    }

    /**
     * shows card at given index
     * @param index
     */
    public void showCards(int index) {

    }

    public void hideCards() {

    }

    public void hideCards(int index) {

    }
}
