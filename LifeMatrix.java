//Duc HO

package eclipseworkspacecsci162;

import java.util.Random;
import java.util.Scanner;

public class LifeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        long seed = scanner.nextLong();

        // Create a 2D matrix filled with false values
        boolean[][] matrix = new boolean[rows][cols];

        // Initialize a random number generator with the provided seed
        Random random = new Random(seed);

        // Fill the interior of the matrix row by row with random booleans
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                matrix[i][j] = random.nextBoolean();
            }
        }

        // Print the matrix with '-' for false and '#' for true
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j]) {
                    System.out.print("# ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(); // Print a newline after each row
        }

        scanner.close();
    }
}