import javax.swing.*;
import javax.swing.border.Border;
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
    final private int PLAYERCOUNT = 4;
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

    //IDEA: have another boarder layout in the main middle pannel that displayes the card being passed around.
    private JPanel mainPanel;

    private JPanel[] playerPanels;
    private GridBagConstraints gbc;

    private void createPlayerPanels() {
        for(int i = 0; i < playerPanels.length; i++) {
            JPanel playerPanel = new JPanel();
            playerPanel.setLayout(new GridBagLayout());

            //sets dimensions for panels that go on the top and bottom
            if(i%2 == 0) {
                playerPanel.setPreferredSize(new Dimension(900, 192));
            }
            //sets dimensions for panels that go on the sides
            else {
                playerPanel.setPreferredSize(new Dimension(196, 517));
            }

            playerPanels[i] = playerPanel;
        }
    }


    public Table(){
        table = new JFrame();
        table.setSize(900, 900);
        table.getContentPane().setLayout(new BorderLayout());

        playerPanels = new JPanel[4];
        createPlayerPanels();

        gbc = new GridBagConstraints();

        // player 1 area
        table.getContentPane().add(playerPanels[0], BorderLayout.SOUTH);
        // player 2 area
        table.getContentPane().add(playerPanels[1], BorderLayout.EAST);
        //player 3 area
        table.getContentPane().add(playerPanels[2], BorderLayout.NORTH);
        //player 4 area
        table.getContentPane().add(playerPanels[3], BorderLayout.WEST);

    }

    /**
     * Method to test different components
     * currently testing player pannels
     */
    public void drawTest() {
        // goes through every player pannel
        for(int i = 0; i < playerPanels.length; i++) {

            //creating border for all the spaces
            playerPanels[i].setBorder(BorderFactory.createLineBorder(Color.black));

            // adds 4 cards to the player area
            for(int j = 0; j < 4; j++) {

                JButton fillerCard = new JButton(".");

                // north and south spaces
                if(i%2 ==0) {
                    playerPanels[i].add(fillerCard);

                }
                // east and west spaces
                else{
                    gbc.gridx = 0;
                    gbc.gridy = j;
                    playerPanels[i].add(fillerCard, gbc);
                }
            }
        }
        table.setVisible(true);
    }


    public void createDeck() {

    }
    /**
     * Deals equal ammount of cards to each player from the deck
     */
    public void dealCards() {

    }

    public static void main(String[] args) {
        Table game = new Table();
        game.drawTest();
    }
}
