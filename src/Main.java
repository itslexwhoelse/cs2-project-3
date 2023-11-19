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
        Board board = new Board();
        Board.printBoard();
    }

    public static Player createPlayer(Scanner in, int playerNum) {
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
