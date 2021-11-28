import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Card extends JButton {
    private CardType type;
    private Player owner;
    private ArrayList<Player> previousOwners;
    private Image back;
    private Image front;

    //TODO: 11/27/2021 Get card class working with gui

    public Card(CardType type) {
        this.type = type;

        //algorithm provided by Professor Dave Smith
        try{
            front = ImageIO.read(getClass().getResource(CardType.getFilePath(type)));
            ImageIcon image = new ImageIcon(front);
            //RotatedIcon ri = new RotatedIcon(image, ri.getDegrees(rotation));
            //setIcon(ri);
            setBorderPainted(false);
            setOpaque(false);
            setContentAreaFilled(false);
            setBorderPainted(false);
            setVisible(true);
        }
        catch(IOException e) {

        }


    }

    public void setOwner(Player p) {
        owner = p;
    }

    public Player getOwner() {
        return owner;
    }

    public CardType getType() {
        return type;
    }


}
