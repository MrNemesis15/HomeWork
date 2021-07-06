package homework;


import java.util.Random;
import java.util.Scanner;

public class XOgame {

    static final int SIZE = 3;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static final int DOTS_TO_WIN = 3;
    static char[][] map;
    static final Scanner sc = new Scanner (System.in);
    static final Random random = new Random ();

    public static void main(String[] args) {
        initMap ();
        printMap ();

        while (true) {
            humanTurn ();
            printMap ();
            if (checkWinLines (DOT_X, DOTS_TO_WIN)) {
                System.out.println ("Вы победили");
                break;
            }
            if (isFull ()) {
                System.out.println ("Ничья");
                break;
            }
            aiTurn ();
            printMap ();
            if (checkWinLines (DOT_O, DOTS_TO_WIN)) {
                System.out.println ("Компьютер победил!");
                break;
            }
            if (isFull ()) {
                System.out.println ("Ничья");
                break;
            }
        }

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }
    }

    public static void printMap() {
        System.out.print ("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print (i + 1 + " ");
        }
        System.out.println ();
        for (int i = 0; i < SIZE; i++) {
            System.out.print (i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.printf ("%c ", map[i][j]);
            }
            System.out.println ();
        }
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println ("input Y X");
            y = sc.nextInt () - 1;
            x = sc.nextInt () - 1;
        } while (!isCellValid (y, x));
        map[y][x] = DOT_X;

    }

    public static void aiTurn() {
        int x;
        int y;
//        Попытка победить самому
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid (i, j)) {
                    map[i][j] = DOT_O;
                    if (checkWinLines (DOT_O, DOTS_TO_WIN)) {
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
//Сбить линию противнака если остался 1 ход до победы
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid (i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWinLines (DOT_X, DOTS_TO_WIN)) {
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
//        Попытка победить самому 2 хода
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid (i, j)) {
                    map[i][j] = DOT_O;
                    if (checkWinLines (DOT_O, DOTS_TO_WIN - 1) && Math.random () < 0.5) {
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
//Сбить линию противнака если остался 2 ход до победы
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid (i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWinLines (DOT_X, DOTS_TO_WIN - 1) && Math.random () < 0.5) {
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        do {
            y = random.nextInt (SIZE);
            x = random.nextInt (SIZE);
        } while (!isCellValid (y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE || y > SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;

                }
            }

        }
        return true;
    }


    static boolean checkLine(int cy, int cx, int vy, int vx, char dot, int dotsToWin) {
        if (cx + vx * (dotsToWin - 1) > SIZE - 1 || cy + vy * (dotsToWin - 1) > SIZE - 1 || cy + vy * (dotsToWin - 1) < 0) {
            return false;
        }
        for (int i = 0; i < dotsToWin; i++) {
            if (map[cy + i * vy][cx + i * vx] != dot) {
                return false;
            }

        }
        return true;
    }

    static boolean checkWinLines(char dot, int dotsToWin) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine (i, j, 0, 1, dot, dotsToWin) ||
                        checkLine (i, j, 1, 0, dot, dotsToWin) ||
                        checkLine (i, j, 1, 1, dot, dotsToWin) ||
                        checkLine (i, j, -1, 1, dot, dotsToWin)) {
                    return true;
                }

            }

        }
        return false;
    }

}

