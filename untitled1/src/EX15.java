import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
        int row = 5;

        // Upper part of the pattern
        for (int r = 1; r <= row; r++) {

            // Spaces
            for (int s = 1; s <= (row - r); s++) {
                System.out.print(" ");
            }

            // Numbers
            for (int t = 1; t <= (2 * r - 1); t++) {
                System.out.print(t);
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int r = row - 1; r >= 1; r--) {

            // Spaces
            for (int s = 1; s <= (row - r); s++) {
                System.out.print(" ");
            }

            // Numbers
            for (int t = 1; t <= (2 * r - 1); t++) {
                System.out.print(t);
            }
            System.out.println();
        }
    }
    }