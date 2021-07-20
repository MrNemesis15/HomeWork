package homework8;

import jdk.nashorn.internal.ir.IfNode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static homework8.Logic.*;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;
    private int fieldSize;
    private int winLenght;

    private boolean isInit;

    private int cellWidht;
    private int cellHeight;


    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground (Color.white);

        addMouseListener (new MouseAdapter () {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX () / cellWidht;
                int cellY = e.getY () / cellHeight;
                if (isInit && !Logic.isGameFinished) {
                    Logic.humanTurn (cellY, cellX);
                }
                repaint ();
            }
        });


    }

    void startNewGame(int fieldSize, int winLenght) {
        this.fieldSize = fieldSize;
        this.winLenght = winLenght;

        isInit = true;
        repaint ();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent (g);
        if (!isInit) {
            return;
        }
        int panelWidth = getWidth ();
        int panelHeight = getHeight ();

        g.setColor (Color.black);
        ((Graphics2D) g).setStroke (new BasicStroke (3f));

        cellWidht = panelWidth / fieldSize;
        cellHeight = panelHeight / fieldSize;

        for (int i = 0; i < fieldSize; i++) {
            int y = i * cellHeight;
            g.drawLine (0, y, panelHeight + 100, y);

        }
        for (int i = 0; i < fieldSize; i++) {
            int x = i * cellWidht;
            g.drawLine (x, 0, x, panelHeight + 100);

        }

        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[i][j] == DOT_O) {
                    draw0 (g, i, j);
                }
            }
        }

        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[i][j] == DOT_X) {
                    drawX (g, i, j);
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
//                if (checkLine (i, j, 0, 1, DOT_O, DOTS_TO_WIN) ||
//                        checkLine (i, j, 1, 0, DOT_O, DOTS_TO_WIN) ||
//                        checkLine (i, j, 1, 1, DOT_O, DOTS_TO_WIN) ||
//                        checkLine (i, j, -1, 1, DOT_O, DOTS_TO_WIN)) {
////                    drawWinLine (g,i,j);
                if (checkLine (i, j, 0, 1, DOT_O, DOTS_TO_WIN)) {
                    g.drawLine (i, j, i + DOTS_TO_WIN, DOTS_TO_WIN);
                    g.setColor (Color.BLUE);
                    ((Graphics2D) g).setStroke (new BasicStroke (2f));
                }
                if (checkLine (i, j, 1, 0, DOT_O, DOTS_TO_WIN)) {
                    g.drawLine (i, j, DOTS_TO_WIN, j +DOTS_TO_WIN);
                    g.setColor (Color.BLUE);
                    ((Graphics2D) g).setStroke (new BasicStroke (2f));
                }
                if (checkLine (i, j, 1, 1, DOT_O, DOTS_TO_WIN)) {
                    g.drawLine (i, j, i + DOTS_TO_WIN, j + DOTS_TO_WIN);
                    g.setColor (Color.BLUE);
                    ((Graphics2D) g).setStroke (new BasicStroke (2f));
                }
                if (checkLine (i, j, -1, 1, DOT_O, DOTS_TO_WIN)) {
                    g.drawLine (i, j, i - DOTS_TO_WIN, j +DOTS_TO_WIN);
                    g.setColor (Color.BLUE);
                    ((Graphics2D) g).setStroke (new BasicStroke (2f));
                }repaint ();

            }

        }

    }
    
    private void drawX(Graphics g, int y, int x) {
        g.setColor (Color.BLUE);
        ((Graphics2D) g).setStroke (new BasicStroke (2f));
        g.drawLine (x * cellWidht, y * cellHeight, (x + 1) * cellWidht, (y + 1) * cellHeight);
        g.drawLine ((x + 1) * cellWidht, y * cellHeight, x * cellWidht, (y + 1) * cellHeight);
    }

    private void draw0(Graphics g, int y, int x) {
        g.setColor (Color.RED);
        g.drawOval (x * cellWidht, y * cellHeight, cellWidht, cellHeight);
        ((Graphics2D) g).setStroke (new BasicStroke (3f));

    }
//    private void drawWinLine(Graphics g, int y, int x) {
//        g.setColor (Color.YELLOW);
//        g.drawLine (x * DOT_X,y*DOT_X, x*1111,y*1111);
//        ((Graphics2D) g).setStroke (new BasicStroke (3f));
//
//    }

}
