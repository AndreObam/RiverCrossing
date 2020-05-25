import javax.swing.*;
import java.awt.*;

/**
 * The GameArenaWindow class was created in order to develop a user interface which held the RiverCrossing game
 * (GameArena), this was done using swing components such as a JFrame (Window) and JPanels (Menu Panel and Help Panel).
 *
 * @see Driver
 * @see Player
 * @see GameArena
 * @author Andre Obamwonyi
 */
public class GameArenaWindow {
    /*Game Arena Window Attributes*/
    private JFrame window = new JFrame();
    private JPanel menuPanel = new JPanel();
    private JPanel helpPanel = new JPanel();
    private JLabel scoreTitle = new JLabel();
    private JLabel timerTitle = new JLabel();
    private JLabel helpTitle = new JLabel();
    private GameArena gA = new GameArena();

    /**
     *This method is used to create the GameArena GUI, it displays the RiverCrossing game(GameArena) inside a window.
     *The user is able to interact with the panel by clicking on different buttons corresponding wth various events.
     *In addition, it displays the menuPanel (score and time) and it displays the help panel (instructions).
     */
    public GameArenaWindow() {
        /*Layout Formats*/
        BorderLayout border = new BorderLayout();
        GridLayout menuGrid = new GridLayout(1, 2);

        /*Game Arena - Window Layout*/
        window.setLayout(border);
        window.add(menuPanel, border.NORTH);
        window.add(gA.getPanel());
        window.add(helpPanel, border.SOUTH);

        /*Game Arena - Window Properties*/
        window.setTitle("River Crossing");
        window.setSize(335, 550);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        /*Menu Panel Properties/Settings*/
        menuPanel.setLayout(menuGrid);
        menuPanel.add(scoreTitle);
        menuPanel.setBackground(Color.GREEN);
        menuPanel.add(timerTitle);
        timerTitle.setText("Timer:   00:00");
        scoreTitle.setText("Score:   0");

        /*Help Panel Properties/Settings*/
        helpPanel.add(helpTitle);
        helpPanel.setBackground(Color.GREEN);
        helpTitle.setText("Left-Click to Move Player, Right-Click to Collect Plank");
    }
}
