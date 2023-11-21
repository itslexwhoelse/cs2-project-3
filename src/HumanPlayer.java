import java.util.Scanner;

public class HumanPlayer implements Player{
    @Override
    public void check() {
        System.out.println("I am a human");
    }

    public HumanPlayer(Scanner in) {
        String player = "human";

    }
}
