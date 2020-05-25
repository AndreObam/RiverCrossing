import javax.swing.*;

/**
 * The Player class was created in order to provide graphical icons of the 'player' in the RiverCrossing game upon
 * the calling of methods. This was implemented using swing components such as a ImageIcons and public methods
 * which return these icons.
 *
 * @see Driver
 * @see GameArena
 * @see GameArenaWindow
 * @author Andre Obamwonyi
 */
public class Player {
    /*Image Library - Player Icons*/
    private ImageIcon playerLStump = new ImageIcon("Images/stump2_man.jpg");
    private ImageIcon playerUStump = new ImageIcon("Images/stump3_man.jpg");
    private ImageIcon playerHPlank = new ImageIcon("Images/plank1_man.jpg");
    private ImageIcon playerVPlank = new ImageIcon("Images/plank2_man.jpg");
    private ImageIcon playerWStump = new ImageIcon("Images/stump1_man.jpg");

    /**
     * This method is called by the GameArena Class, the'Player on a Lower Stump' ImageIcon is assigned to the button
     * which handled the event.
     * @return 'PlayerLStump'.
     */
    public ImageIcon PlayerLStump(){
        return playerLStump;
    }

    /**
     * This method is called by the GameArena Class, the 'Player on an Upper Stump' ImageIcon is assigned to the button
     * which handled the event.
     * @return 'PlayerUStump'.
     */
    public ImageIcon PlayerUStump(){
        return playerUStump;
    }

    /**
     * This method is called by the GameArena Class, the 'Player on a Horizontal Plank' ImageIcon is assigned to the
     * button which handled the event.
     * @return 'PlayerHPlank'.
     */
    public ImageIcon PlayerHPlank(){
        return playerHPlank;
    }

    /**
     * This method is called by the GameArena Class, the 'Player On A Vertical Plank' ImageIcon is assigned to the
     * button which handled the event.
     * @return 'PlayerVPlank'.
     */
    public ImageIcon PlayerVPlank(){
        return playerVPlank;
    }

    /**
     * This method is called by the GameArena Class, the 'Player On A Water Stump' ImageIcon is assigned to the button
     * which handled the event.
     * @return 'PlayerWStump'.
     */
    public ImageIcon PlayerWStump(){
        return playerWStump;
    }
}
