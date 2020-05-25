import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * The GameArena class is used in order to provide a graphical output of the RiverCrossing game.
 * This was done using swing components such as a JPanel and a range of JButtons with set ImageIcons.
 * An ActionListener is implemented; triggering different user-navigation actions dependent on the button clicked.
 *
 * @see Player
 * @see Driver
 * @see GameArenaWindow
 * @author Andre Obamwonyi
 */
public class GameArena implements ActionListener {
    /*Game Arena Attributes*/
    private JButton tiles[][] = new JButton[13][9];
    private JPanel gridPanel = new JPanel();
    private Player user = new Player();

    /*Image Library - Map Icons*/
    private ImageIcon water = new ImageIcon("Images/water1.jpg");
    private ImageIcon monster1 = new ImageIcon("Images/water3.jpg");
    private ImageIcon monster2 = new ImageIcon("Images/water4.jpg");
    private ImageIcon lowerBank = new ImageIcon("Images/bank1.jpg");
    private ImageIcon upperBank = new ImageIcon("Images/bank2.jpg");
    private ImageIcon waterStump = new ImageIcon("Images/stump1.jpg");
    private ImageIcon lowerStump = new ImageIcon("Images/stump2.jpg");
    private ImageIcon upperStump = new ImageIcon("Images/stump3.jpg");
    private ImageIcon hPlank = new ImageIcon("Images/plank1.jpg");
    private ImageIcon vPlank = new ImageIcon("Images/plank2.jpg");

    /**
     * This method is used in order to create the GameArena GUI; it sets the 13x9 grid layout and assigns a button
     * to each of cell, each is assigned an actionListener and image icon dependent on the condition(location) met.
     */
    public GameArena() {
        /*Game Arena Layout*/
        GridLayout arenaGrid = new GridLayout(13, 9);
        gridPanel.setLayout(arenaGrid);

        /*Used to add buttons set with the 'upper bank' image icon to the grid*/
        for (int i = 0; i < 9; i++) {
            tiles[1][i] = new JButton(upperBank);
            gridPanel.add(tiles[1][i]);
            tiles[1][i].addActionListener(this);
        }

        /*Used to add buttons set with the 'water' image icon to the grid*/
        for(int i = 1; i < 12; i++){
            for(int j = 0; j < 9; j++){
                tiles[i][j] = new JButton(water);
                gridPanel.add(tiles[i][j]);
                tiles[i][j].addActionListener(this);
            }
        }

        /*Used to add buttons set with the 'lower bank' image icon to the grid*/
        for (int i = 0; i < 9; i++) {
            tiles[12][i] = new JButton(lowerBank);
            gridPanel.add(tiles[12][i]);
            tiles[12][i].addActionListener(this);
        }

        Reset(); //Function resets the grid image icons (stumps and planks)

        /*Sets the 'starting' image of the player and the monster images at the set locations*/
        tiles[12][4].setIcon(user.PlayerLStump());
        tiles[5][3].setIcon(monster1);
        tiles[4][6].setIcon(monster1);
        tiles[5][4].setIcon(monster2);
        tiles[5][5].setIcon(monster2);
        tiles[4][2].setIcon(monster2);
    }

    /**
     * This method is used in order to reset the image icons of tiles; it uses the arena item location mappings as seen
     * in the example Game Arena level in the project specification.
     */
    public void Reset() {
        /*Set locations of the stumps*/
        tiles[12][4].setIcon(lowerStump);
        tiles[2][0].setIcon(waterStump);
        tiles[6][0].setIcon(waterStump);
        tiles[8][0].setIcon(waterStump);
        tiles[10][0].setIcon(waterStump);
        tiles[6][2].setIcon(waterStump);
        tiles[4][4].setIcon(waterStump);
        tiles[8][4].setIcon(waterStump);
        tiles[6][6].setIcon(waterStump);

        /*Set locations of the vertical planks*/
        tiles[9][0].setIcon(vPlank);
        tiles[8][0].setIcon(vPlank);
        tiles[7][0].setIcon(vPlank);
        tiles[11][4].setIcon(vPlank);
        tiles[10][4].setIcon(vPlank);
        tiles[9][4].setIcon(vPlank);

        /*Set locations of the horizontal planks*/
        tiles[6][3].setIcon(hPlank);
        tiles[6][4].setIcon(hPlank);
        tiles[6][5].setIcon(hPlank);
    }

    /**
     * This method returns the 'gridPanel' panel.
     * This component can be added to a panel in order to display the RiverCrossing Game.
     * @return 'gridPanel'.
     */
    public JComponent getPanel() {
        return gridPanel;
    }

    /**
     * This method was created in order to enable player navigation;
     * It handles events (mouseClicks) and different actions are triggered depending on image icon of clicked button.
     * @param event This is an instance of the ActionEvent class.
     */
    public void actionPerformed(ActionEvent event) {
        JButton button = (JButton) event.getSource();
        if (button.getIcon() == waterStump) {
            Reset();
            button.setIcon(user.PlayerWStump());
        } else if (button.getIcon() == lowerStump) {
            Reset();
            button.setIcon(user.PlayerLStump());
        } else if (button.getIcon() == upperStump) {
            Reset();
            button.setIcon(user.PlayerUStump());
        } else if (button.getIcon() == hPlank) {
            Reset();
            button.setIcon(user.PlayerHPlank());
        } else if (button.getIcon() == vPlank) {
            Reset();
            button.setIcon(user.PlayerVPlank());
        }
    }
}