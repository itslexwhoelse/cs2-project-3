import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Board {
    private static int rows;
    static int[] rowArray;


    public Board() {
        Random random = new Random();
        int numberOfRows = random.nextInt(3,8);
        rows = numberOfRows;
        System.out.println("constructing board with " + numberOfRows + " rows");
        rowArray = new int[rows+1];
        for (int i = 0; i <= rows; i++) {
            rowArray[i] = i+3;

        }
        System.out.println("Initialized row array " + Arrays.toString(rowArray));
    }

    public static void printBoard(){
        for (int i = 0; i <= rows; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j <= i + 2;j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void  printNewBoard(){
        for (int i = 0; i < rowArray.length; i++) {
            //prints row number
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < rowArray[i]; j++) {
                // # of columns based on row number
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
