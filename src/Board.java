import java.util.Arrays;
import java.util.Random;

public class Board {
    private static int rows;
    static int[] rowArray;
    private static int initStones;
    private static int currentStones;
    private static int takenStones;


    public Board() {

        Random random = new Random();
        int numberOfRows = random.nextInt(3,8);
        rows = numberOfRows;
        System.out.println("constructing board with " + (numberOfRows+1) + " rows");
        rowArray = new int[rows+1];
        for (int i = 0; i <= rows; i++) {
            rowArray[i] = i+3;
            initStones += i+3;

        }
        System.out.println("Initialized row array " + Arrays.toString(rowArray) + " with " + initStones + " stones");
        currentStones = initStones;
    }

    public static int getStones() {
        for (int i = 0; i <= rows; i++) {
            currentStones += i+3;
        }
        return currentStones;
    }
    public static int getRows() {
        return rows;
    }
    public static int getCurrentStones() {
        return currentStones;
    }


    public static void printBoard(){
        for (int i = 0; i <= rows; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j <= rowArray[i] -1;j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void printNewBoard(int less){
        System.out.println(Arrays.toString(rowArray));
        takenStones += less;
        for (int i = 0; i <= rows; i++) { //
            //prints row number
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < rowArray[i]; j++) {
                // # of columns based on row number
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(subtractStones() + " stones left");
    }
    public static int subtractStones(){
        return currentStones-takenStones;
    }



}
