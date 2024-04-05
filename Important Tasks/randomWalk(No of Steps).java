import java.util.Random;

public class RandomWalker {
    public static void main(String[] args) {
        int r = 10; // Manhattan distance from the starting point

        // Initialize variables for the current position and the number of steps taken
        int x = 0;
        int y = 0;
        int steps = 0;

        // Create a random number generator
        Random random = new Random();

        // Perform the random walk
        while (Math.abs(x) + Math.abs(y) != r) {
            int direction = random.nextInt(4); // Generate a random number between 0 and 3

            // Update the position based on the random direction
            switch (direction) {
                case 0: // North
                    y++;
                    break;
                case 1: // East
                    x++;
                    break;
                case 2: // South
                    y--;
                    break;
                case 3: // West
                    x--;
                    break;
            }

            steps++; // Increment the number of steps taken
        }

        // Print the number of steps taken
        System.out.println("Number of steps taken: " + steps);
    }
}
