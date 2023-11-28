import java.util.Random;

public class RandomCpu implements Player {
    private int playerNumber;
    public RandomCpu() {
    }

    public String check() {
        return " a random cpu";
    }
    public void assign(int number) {
        playerNumber = number;
    }
    public int getPlayerNumber() {
        return playerNumber;
    }
    public void take() {
        Random random = new Random();

        int stones = 0;
        int row = random.nextInt(Board.getRows()+1);
            while(Board.rowArray[row] == 0) {
                row = random.nextInt(Board.getRows()+1);
            }
        stones = random.nextInt(1,Board.rowArray[row]+1);
        System.out.println("Random CPU takes " + stones + " stones from row " + row);
        Board.rowArray[row] = Board.rowArray[row] - stones;
        Board.printNewBoard(stones);
    }
}


