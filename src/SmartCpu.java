public class SmartCpu implements Player{
    private int playerNumber;
    public SmartCpu() {
        String player = "smart cpu";
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
        System.out.println("Placeholder");
    }
}
