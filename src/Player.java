public class Player {
    private String playerName;
    private Deck playerHand; // player's hand that only they can see
    private Deck tableHand; // player's hand that is displayed for everyone else to see

    public Player(String playerName) {
        this.playerName = playerName;
        playerHand = new Deck();
        tableHand = new Deck();
    }

    public void createHand(Deck mainDeck) {

    }

    public void addToTableHand(){

    }

    public Card pickCard(Card card) {
        //check if card is in deck, reutrn that card
        return card;
    }

    public void pass(){}

    public void accept(){}


}
