import javax.swing.*;

public class Hangman extends JFrame {
    // counts incorrect guesses a player has made
    private int incorrectGuesses;

    // store the challenge from the WordDB here
    private String[] wordChallenge;

    private final WordDB wordDB;
    private JLabel hangmanImage;


    public Hangman() {
        super("Hangman Game");
        setSize(CommonConstants.FRAME_SIZE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        // init vars
        wordDB = new WordDB();
        wordChallenge = wordDB.loadChallenge();

        addGuiComponents();
    }

    private void addGuiComponents() {
        // hangman image
        hangmanImage = CustomTools.loadImage(CommonConstants.IMAGE_PATH);
        assert hangmanImage != null;
        hangmanImage.setBounds(0, 0, hangmanImage.getPreferredSize().width, hangmanImage.getPreferredSize().height);

        getContentPane().add(hangmanImage);
    }
}
