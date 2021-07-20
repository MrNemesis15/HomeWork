package homework8;

import javax.swing.*;
import java.awt.*;

public class Setting extends JFrame {

    private GameWindow gameWindow;
    private final int MIN_FIELD_SIZE = 3;
    private final int MAX_FIELD_SIZE = 10;
    private JSlider sliderFieldSize;
    private JSlider sliderDotsToWin;

    public Setting(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBounds (500, 500, 500, 500);
        setTitle ("TicTacToe setting");

        sliderFieldSize = new JSlider (MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        sliderFieldSize.setPaintTicks (true);
        sliderFieldSize.setPaintLabels (true);
        sliderFieldSize.setMajorTickSpacing (1);
        sliderDotsToWin = new JSlider (MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        sliderDotsToWin.setPaintTicks (true);
        sliderDotsToWin.setPaintLabels (true);
        sliderDotsToWin.setMajorTickSpacing (1);
//        sliderFieldSize.addChangeListener (e -> sliderDotsToWin.setMaximum (sliderDotsToWin.getValue ()));

        setLayout (new GridLayout (5, 1));
        add (new Label ("Field Size"));
        add (sliderFieldSize);
        add (new Label ("Win Line"));
        add (sliderDotsToWin);

        JButton button = new JButton ("Start a Game");
        add (button);

        button.addActionListener (e -> {
            int fieldSize = sliderFieldSize.getValue ();
            int winLenght = sliderDotsToWin.getValue ();

            Logic.SIZE = fieldSize;
            Logic.DOTS_TO_WIN = winLenght;
            Logic.initMap ();
            Logic.printMap ();
            Logic.isGameFinished = false;
            gameWindow.startNewGame (fieldSize, winLenght);

            setVisible (false);
        });

        setVisible (false);
    }
}
