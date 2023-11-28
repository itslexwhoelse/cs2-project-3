import java.util.Scanner;

public class HumanPlayer implements Player{
    public HumanPlayer(Scanner in) {
        String player = "human";
    }

    public void take() {
        Scanner in = new Scanner(System.in);
        System.out.println("what row?");
        int row = in.nextInt();
        System.out.println("how many stones?");
        int stones = in.nextInt();
        if (stones > Board.rowArray[row]) { //anything more than the stones in the row will just take everything.
            stones = Board.rowArray[row]; // this is just so ill stop crashing the program while testing.
        }
        Board.rowArray[row] = Board.rowArray[row] - stones;
        Board.printNewBoard(stones);
    }


    public void check() {
        System.out.println("I am a human");
    }
}
