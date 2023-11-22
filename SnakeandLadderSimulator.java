public class SnakeandLadderSimulator {
    public static void main(String[] args) {
        int position = 0;
        int die = rollDie();

        System.out.println("Welcome to Snake and Ladder Simulator");

        System.out.println("Die: " + die + " ,Position: " + position);
    }

    private static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }
}