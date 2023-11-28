import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    https://github.com/itslexwhoelse/cs2-project-3
    if you're looking at this from my github, here's some recursion.
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
                return new HumanPlayer();
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
        String winner;
        Player playerOne = createPlayer(1);
        playerOne.assign(1);
        Player playerTwo = createPlayer(2);
        playerTwo.assign(2);
        Board board = new Board();
        Board.printBoard();
        System.out.println("Player 1 is" + playerOne.check());
        System.out.println("Player 2 is" + playerTwo.check());
        while (true) {
                playerOne.take();
                if(Arrays.stream(Board.rowArray).sum() == 0) {
                    winner = "Player One Wins!";
                    System.out.println(winner);
                    break; //someone won, leave
                }
                playerTwo.take();
            if(Arrays.stream(Board.rowArray).sum() == 0) {
                winner = "Player Two Wins!";
                System.out.println(winner);
                break; //the other person won. LEAVE
            }
        }

    }

}
