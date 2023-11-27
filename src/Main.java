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
    play();
    }



    public static Player createPlayer(int playerNum) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose player " + playerNum);
        System.out.println("1: Human");
        System.out.println("2: Dumb CPU");
        System.out.println("3: Random CPU");
        System.out.println("4: Smart CPU");
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                return new HumanPlayer(in);
            }
            case 2 -> {
                return new DumbCpu();
            }
            case 3 -> {
                return new RandomCpu();
            }
            case 4 -> {
                return new SmartCpu();
            }
            default -> System.out.println("invalid");
        }
        return null; //no players here...
    }


    public static void play() {
        boolean playing = true;
        int initStones = Board.getStones();
        int currentTotalStones= initStones;
        int currentPlayer = 1;
        Player playerOne = createPlayer(1);
        Player playerTwo = createPlayer(2);
        Board board = new Board();
        Board.printBoard();
        playerOne.check();
        playerTwo.check(); //prints what the player type is

        while (playing) {
            if (currentTotalStones == 0) {
                playing = false; //exit if the game is over
            } else {
                playerOne.take();
                playerTwo.take();
            }


        }
    }

}
