package lesson4_dz;

import java.util.Random;
import java.util.Scanner;

public class Lesson4_dz {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private  static int fieldSizeWin;
    private static int scoreHuman;
    private static int scoreAI;

    public static void main(String[] args) {
        while (true) {
            playRound();
            System.out.printf("SCORE IS: HUMAN   AI\n            %d      %d\n", scoreHuman, scoreAI);
            System.out.print("Wanna play again? Enter Y or N >>> ");
            if (!SCANNER.next().toLowerCase().equals("y")) break;
        }
    }

    private static void playRound() {
        initField(5, 5, 5);
        printField();

        while (true) {
            humanTurn();
            printField();
            if (checkGameState(DOT_HUMAN)) break;
            aiTurn();
            printField();
            if (checkGameState(DOT_AI)) break;
        }
    }

    private static boolean checkGameState(char dot) {
        if (checkDraw()) return true;

        if (checkWin(dot)) {
            if (dot == DOT_HUMAN) {
                System.out.println("Human win!");
                scoreHuman++;
            } else {
                System.out.println("AI win!");
                scoreAI++;
            }
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(y, x)) return false;
            }
        }
        System.out.println("Ooops... It's DRAW!");
        return true;
    }

    /*
     * Переделать проверку победы с циклами
     * * Сделать проверку победы на поле 5х5 и длину последовательности 4
     * ** Сделать проверку на произвольные размеры поля и длину последовательности
     */
    private static boolean checkWin(char dot) {

        boolean hor, ver;
        hor = true; ver = true;
        for (int x = 0; x < fieldSizeWin; x++) {
            for (int y = 0; y < fieldSizeWin; y++) {
                hor &= (field [x][y] == dot);
                ver &= (field [y][x] == dot);
            }
            if (hor || ver) return true;
        }

        boolean diagonal1 ,diagonal2;
        diagonal1 = true;
        diagonal2 = true;
        for (int i = 0; i < fieldSizeWin; i++) {
            diagonal1 &= (field[i][i] == dot);
            diagonal2 &= (field[i][fieldSizeWin - i-1] == dot);
        }
            if (diagonal1 ||diagonal2) return true;
            return false;




//        //hor
//        if (field[0][0] == dot && field[0][1] == dot && field[0][2] == dot) return true;
//        if (field[1][0] == dot && field[1][1] == dot && field[1][2] == dot) return true;
//        if (field[2][0] == dot && field[2][1] == dot && field[2][2] == dot) return true;
//        //ver
//        if (field[0][0] == dot && field[1][0] == dot && field[2][0] == dot) return true;
//        if (field[0][1] == dot && field[1][1] == dot && field[2][1] == dot) return true;
//        if (field[0][2] == dot && field[1][2] == dot && field[2][2] == dot) return true;
//        //diag
//        if (field[0][0] == dot && field[1][1] == dot && field[2][2] == dot) return true;
//        if (field[0][2] == dot && field[1][1] == dot && field[2][0] == dot) return true;
//        return false;



    }

    /*
     * *** Сделать более умного ИИ (чтобы ходил хоть как то осмысленно)
     */
    private static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(y, x));
        field[y][x] = DOT_AI;
    }


    private static void humanTurn() {
        int x, y;

        do {
            System.out.print("Please enter coordinates of your turn x & y split with whitespace >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(y, x) || !isCellEmpty(y, x));

        field[y][x] = DOT_HUMAN;
    }

    private static boolean isCellValid(int y, int x) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }

    private static boolean isCellEmpty(int y, int x) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void initField(int sizeY, int sizeX, int sizeW) {
        fieldSizeY = sizeY;
        fieldSizeX = sizeX;
        fieldSizeWin= sizeW;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }
        System.out.println();

        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i <= fieldSizeX * 2 + 1; i++) {
            System.out.print("_");
        }
        System.out.println();

    }
}
