import java.util.ArrayList;
import java.util.Random;

public class Board {
    private static int rows;
    private ArrayList<Integer> boardArray;

    public Board() {
        Random random = new Random();
        int numberOfRows = random.nextInt(3,8);
        rows = numberOfRows;
        System.out.println("constructing board with " + numberOfRows + " rows");
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

}
