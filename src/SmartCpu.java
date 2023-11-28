import java.util.Arrays;
import java.util.Random;

public class SmartCpu implements Player{
    private int playerNumber;
    public SmartCpu() {
    }

    public String check() {
        return " a smart cpu";
    }
    public void assign(int number) {
        playerNumber = number;
    }
    public int getPlayerNumber() {
        return playerNumber;
    }
    public void take() {
        int stones = 0;
        int row = 0;
        while(Board.rowArray[row] == 0) {
            row += 1;
        }
        boolean oddRows = Board.rowArray.length == Board.rowArray.length % 2; //odd if true
        boolean oddStones = Board.getCurrentStones() == Board.getCurrentStones() % 2; //odd if true
        if (Board.rowArray[row] == Arrays.stream(Board.rowArray).sum()) {
            stones = Arrays.stream(Board.rowArray).sum();
        }
        if(oddStones) {
            if (oddRows) { //odd if true
                stones = Board.rowArray[row];
            } else {
                stones = Board.rowArray[row] - 1;
            }
        } else {
            if (oddRows) { //odd if true
                stones = Board.rowArray[row] - 1;
            } else {
                stones = Board.rowArray[row];
            }
        }

        System.out.println("Player "+ playerNumber +": Smart CPU takes " + stones + " stones from row " + row);
        Board.rowArray[row] = Board.rowArray[row] - stones;
        Board.printNewBoard(stones);

    }
}
