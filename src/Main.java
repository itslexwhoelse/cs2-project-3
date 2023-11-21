import java.util.Scanner;

public class Main {
/*
*
*
*
*
*
*/

    public static void main(String[] args) {
        Player playerOne = createPlayer(1);
        Player playerTwo = createPlayer(2);
        Board board = new Board();
        Board.printBoard();
        playerOne.check();
        playerTwo.check();
        //implement better playing rules etc etc
        playerOne.take();
        playerTwo.take();

    }

    public static Player createPlayer(int playerNum) {
            Scanner in = new Scanner(System.in);
            System.out.println("Choose player " + playerNum);
            System.out.println("1: Human");
            System.out.println("2: Dumb CPU");
            System.out.println("3: Random CPU");
            System.out.println("4: Smart CPU");
        int choice = in.nextInt();

            if (choice == 1) { //human
                return new HumanPlayer(in);
            } else if (choice == 2) { //dumb
                return new DumbCpu();
            } else if (choice == 3) { //random
                return new RandomCpu();
            } else if (choice == 4) { //smart
                return new SmartCpu();
            }
            return null;
    }

}
