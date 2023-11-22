public class SnakeandLadderSimulator {
    private static final int WINNING_POSITION = 100;
    private static final int NO_PLAY = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator");
        int[] positions = { 0, 0 };
        int currentPlayer = 0;

        while (true) {
            int die = rollDie();
            int option = getOption();

            switch (option) {
                case LADDER:
                    if (positions[currentPlayer] + (die * 2) <= WINNING_POSITION) {
                        positions[currentPlayer] += die * 2;
                        System.out.println("Player " + (currentPlayer + 1) + " climbed a ladder and plays again.");
                        continue;
                    }
                    break;
                case SNAKE:

                    if (positions[currentPlayer] < 0) {
                        positions[currentPlayer] = 0;
                    }
                    break;
                case NO_PLAY:
                    if (positions[currentPlayer] + die <= WINNING_POSITION) {
                        positions[currentPlayer] += die;
                    }
                    break;
            }

            System.out.println(
                    "Player " + (currentPlayer + 1) + " rolled " + die + ", Position: " + positions[currentPlayer]);

            if (positions[currentPlayer] == WINNING_POSITION) {
                System.out.println("Player " + (currentPlayer + 1) + " wins!");
                break;
            }

            currentPlayer = 1 - currentPlayer;
        }
    }

    private static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }

    private static int getOption() {
        return (int) (Math.random() * 3);
    }
}