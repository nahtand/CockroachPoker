import javax.swing.*;
import java.awt.*;

/*
 * the Table class will combine all the components of the Cockroach poker into one graphical interface
 * the table will display:
        * each player's "Table Deck" which will be the ones that everyone sees
        * the cpu players' hand decks faced down
        * the user player's hand deck faced up (for the user only, the cpu players are not aware of your card details)
            * or a pop up menu
        * an indicator for whos turn it is (popup or color indicator)

 */
public class Table {
    //main deck
    private Deck cardDeck;
    //user player
    private Player player;
    //computer players
    private CpuPlayer cpu1;
    private CpuPlayer cpu2;
    private CpuPlayer cpu3;
    //GUI stuff
    private JFrame table;
    private BorderLayout mainLayout;
    private GridBagLayout playerLayout;
    private JPanel mainPanel;
    private JPanel player1Panel;
    private JPanel player2Panel;
    private JPanel player3Panel;
    private JPanel player4Panel;

    public Table(){

    }

    public void createDeck() {

    }
    /**
     * Deals equal ammount of cards to each player from the deck
     */
    public void dealCards() {

    }
}
