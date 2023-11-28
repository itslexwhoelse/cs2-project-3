import java.util.Scanner;

public class HumanPlayer implements Player{
    private int playerNumber;

    public HumanPlayer() {
    }
    public String check() {
        return " a human";
    }
    public void assign(int number) {
        playerNumber = number;
    }
    public int getPlayerNumber() {
        return playerNumber;
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
        System.out.println("Player "+ playerNumber +": takes " + stones + " stones from row " + row);
        Board.rowArray[row] = Board.rowArray[row] - stones;
        Board.printNewBoard(stones);
    }
}
