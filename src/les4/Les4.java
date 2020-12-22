package les4;

import java.util.Random;
import java.util.Scanner;

public class Les4 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        char[][] field = createField();

        while (true) {

            drawField(field);

            doPlayerMove(field);
            if (checkWin(field, 'X')) {
                System.out.println("Congrats!!!");
                System.out.println("Player is winner!!!");
                break;
            }
            if (checkDraw(field)) {
                System.out.println("Sorry, game is draw!!!");
                System.out.println("Bey!!!");
                break;
            }

            doAIMove(field);
            if (checkWin(field, 'O')) {
                System.out.println("Sorry!!!");
                System.out.println("AI is winner!!!");
                break;
            }
            if (checkDraw(field)) {
                System.out.println("Sorry, game is draw!!!");
                System.out.println("Bey!!!");
                break;
            }
        }
    }

    static boolean checkDraw(char[][] field) {
        int freeCells = field.length * field.length;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != '-') {
                    freeCells--;
                }
            }
        }

        return freeCells == 0;
    }

    static boolean checkWin(char[][] field, char sign) {
        // Horizontal
        for (int i = 0; i < field.length; i++) {
            //if (field[i][0] == sign && field[i][1] == sign && field[i][2] == sign)
            for (int j=0; j<field.length; j++)
            {
               // return true;
                if(field[i][j]==sign)
                {
               if (j==field.length-1) {
                   return  true;
               }}
                else {break;}
            }
            //return  true;
        }

        // Vertical
        for (int i = 0; i < field.length; i++) {
           // if (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign) {
               // return true;
            for (int j=0; j<field.length; j++)
            {
                // return true;
                if(field[j][i]==sign)
                {
                    if (j==field.length-1) {
                        return  true;
                    }}
                else {break;}
            }
           // return  true;
            }


        // Diagonal
       // if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) {
           //// return true;
       // }
        for (int i=0, j=0 ; i<field.length; i++,j++)
        {
            // return true;
            if(field[i][j]==sign)
            {
                if (i==field.length-1) {
                    return  true;
                }}
            else {break;}
        }

       
        for (int i=0, j=field.length-1 ; i<field.length; i++,j--)
        {
            // return true;
            if(field[i][j]==sign)
            {
                if (i==field.length-1) {
                    return  true;
                }}
            else {break;}
        }

        return false;
    }

    static void doPlayerMove(char[][] field) {
        int x, y;

        do {
            x = chooseCoordinate(field.length, 'X');
            y = chooseCoordinate(field.length, 'O');
        } while (field[x][y] != '-');

        field[x][y] = 'X';

        drawField(field);
        drawSeparator();
    }

    static void doAIMove(char[][] field) {
        Random random = new Random();
        int x, y;

        do {
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (field[x][y] != '-');

        field[x][y] = 'O';
        drawField(field);
        drawSeparator();
    }

    static int chooseCoordinate(int maxLength, char sign) {
        Scanner scanner = new Scanner(System.in);

        int coord;
        do {
            System.out.printf("Please enter %s-coord in range [1..3]%n", sign);
            coord = scanner.nextInt() - 1;
        } while (coord < 0 || coord >= maxLength);

        return coord;
    }

    static char[][] createField() {
        return new char[][] {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
             //   {'-', '-', '-','-', '-'},
               // {'-', '-', '-','-', '-'}
        };
    }

    static void drawSeparator() {
        for (int i = 0; i < 4; i++) {
            System.out.println();
        }
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
