public class SnakeandLadderSimulator {
    private static final int NO_PLAY = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator");
        int position = 0;
        int die = rollDie();
        int option = getOption();

        switch (option) {
            case LADDER:
                position += die * 2;
                System.out.print("LADDER ");
                break;
            case SNAKE:
                System.out.print("SNAKE ");
                break;
            case NO_PLAY:
                position += die;
                System.out.print("NO PLAY ");
                break;
        }

        System.out.println("Die: " + die + ", Position: " + position);
    }

    private static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }

    private static int getOption() {
        return (int) (Math.random() * 3);
    }
}