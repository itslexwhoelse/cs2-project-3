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

        Board.rowArray[row] = -stones;
        Board.printNewBoard();
    }


    public void check() {
        System.out.println("I am a human");
    }


}
