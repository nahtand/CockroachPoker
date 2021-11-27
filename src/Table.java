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
    JFrame table;
    BorderLayout mainLayout;
    GridBagLayout playerLayout;
    JPanel mainPanel;
    JPanel player1Panel;
    JPanel player2Panel;
    JPanel player3Panel;
    JPanel player4Panel;
}
