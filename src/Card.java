import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class Card extends JButton {
    private CardType type;
    private Player owner;
    private ArrayList<Player> previousOwners;
    private Image back;
    private Image front;
    private RotatedIcon rotatedImage;


    public Card(CardType type) {
        this.type = type;

        //algorithm provided by Professor Dave Smith
        try{
            front = ImageIO.read(getClass().getResource(CardType.getFilePath(type)));
            ImageIcon image = new ImageIcon(front);
            rotatedImage = new RotatedIcon(image, 0);
            setIcon(rotatedImage);
            setBorderPainted(false);
            setOpaque(false);
            setContentAreaFilled(false);
            setBorderPainted(false);
            setVisible(true);
        }
        catch(IOException e) {
            System.out.println("file not found");
            e.getMessage();

        }


    }

    public void rotateCard(double degree) {
        rotatedImage.setDegrees(degree);
        setIcon(rotatedImage);

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
