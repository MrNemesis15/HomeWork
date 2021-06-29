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
            if (checkWin (DOT_X)) {
                System.out.println ("Вы победили");
                break;
            }
            if (isFull ()) {
                System.out.println ("Ничья");
                break;
            }
            aiTurn ();
            printMap ();
            if (checkWin (DOT_O)) {
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
    //       Пробовал написать условия для проверки через цикл однако моихнавыков не хватило данный цикл не работает при вводе числа в строку где оно имееться выдает ошибку.
    public static boolean checkWin(char c) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == c && map[i][j + 1] == c && map[i][j + 2] == c) {
                    return true;
                }
                if (map[i][j] == c && map[i + 1][j] == c && map[i + 2][j] == c) {
                    return true;
                }
                if (map[i][j] == c && map[i + 1][j + 1] == c && map[i + 2][j + 2] == c) {
                    return true;
                }
                if (map[i][j + 2] == c && map[i + 1][j + 1] == c && map[i + 2][j - 2] == c) {
                    return true;

                }

            }

        }
        return false;
    }
}

//        if (map[0][0] == c && map[0][1] == c && map[0][2] == c) {
//            return true;
//        }
//        if (map[1][0] == c && map[1][1] == c && map[1][2] == c) {
//            return true;
//        }
//        if (map[2][0] == c && map[2][1] == c && map[2][2] == c) {
//            return true;
//        }
//        if (map[0][0] == c && map[1][0] == c && map[2][0] == c) {
//            return true;
//        }
//        if (map[0][1] == c && map[1][1] == c && map[2][1] == c) {
//            return true;
//        }
//        if (map[0][2] == c && map[1][2] == c && map[2][2] == c) {
//            return true;
//        }
//        if (map[0][0] == c && map[1][1] == c && map[2][2] == c) {
//            return true;
//        }
//        if (map[0][2] == c && map[1][1] == c && map[2][0] == c) {
//            return true;
//        }
//        return false;
//    }

//    private static boolean checkWin(char sym) {
//        for (int i = 0; i < SIZE; i++) {
//            int result = 0;
//            for (int j = 0; j < SIZE; j++) {
//                if (map[i][j] == sym) result++;
//            }
//            if (result == SIZE) return true;
//        }
//        for (int i = 0; i < SIZE; i++) {
//            int result = 0;
//            for (int j = 0; j < SIZE; j++) {
//                if (map[i][j] == sym) result++;
//            }
//            if (result == SIZE) return true;
//        }
//        int first = 0;
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                if (j == 1 && map[i][j] == sym) first++;
//            }
//        }
//        if (first == SIZE) return true;
//        int second = 0;
//        for (int i = 0; j < SIZE - 1; i < SIZE && j >= 0, i++, j--){
//            if (map[i][j] == sym) second++;
//        }
//        if (second == SIZE) return true;
//        {
//            return false;
//        }
//
//    }


//    private static boolean findRightDown(int y, int x) {
//        for (int j = 0; j < DOTS_TO_WIN; j++) {
//
//            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || currentDot != map[y][x]) return false;
//
//            y++;
//            x++;
//        }
//        return true;
//    }
//
//    private static boolean findDown(int y, int x) {
//        for (int j = 0; j < DOTS_TO_WIN; j++) {
//
//            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || currentDot != map[y][x]) return false;
//
//            y++;
//        }
//        return true;
//    }


