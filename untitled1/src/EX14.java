public class EX14 {
    public static void main(String[] args) {
        int n = 5;

        // Upper part of the pattern (inverted triangle)
        for (int rows = 1; rows <= n; rows++) {
            for (int column = 1; column <= (n - rows + 1); column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern (right triangle)
        for (int rows = 2; rows <= n; rows++) {
            for (int column = 1; column <= rows; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}