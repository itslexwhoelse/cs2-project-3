import java.util.Random;

public class RandomCpu implements Player {

    public RandomCpu() {
        String player = "Random CPU";
    }

    public void check() {
        System.out.println("I am a random cpu");
    }

    public void take() {
        Random random = new Random();
        int stones = 0;
        int row = random.nextInt(Board.getRows());
        if(Board.rowArray[row] >= 0) {
            stones = random.nextInt(Board.rowArray[row]);
        }
        System.out.println("Random CPU takes " + stones + " stones from row " + row);
        Board.rowArray[row] = -stones;
        Board.printNewBoard(stones);
    }
}


