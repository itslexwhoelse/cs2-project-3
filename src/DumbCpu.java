import java.util.Arrays;

public class DumbCpu implements Player{
    private int playerNumber;
    public DumbCpu() {
    }

    public String check() {
        return " a dumb cpu";
    }
    public void assign(int number) {
        playerNumber = number;
    }
    public int getPlayerNumber() {
        return playerNumber;
    }
    public void take() {
        int stones = 1;
        int row = 0;
        while (Board.rowArray[row] == 0) {
            row += 1;
            if (row > Board.rowArray.length) {
                break;
            }
        }
            System.out.println("Player "+ playerNumber +": Dumb CPU takes " + stones + " stones from row " + row);
            Board.rowArray[row] = Board.rowArray[row] - stones;
            Board.printNewBoard(stones);
    }
}
