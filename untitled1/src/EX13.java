import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        int row = 5;
        //           for rows (r);
            for( int r =0; r<=row; r++) {

//                for space (s);
                for (int s = 1; s <= (row - r); s++) {
                    System.out.print(" ");
                }
//            for stars( t);
                for (int t = 0; t <= ((2 * r )); t++) {
                    System.out.print("*");

                }
                System.out.println(" ");
            }
        //           for rows (r);
        for( int r =row-1; r>=0; r--) {

//                for space (s);
            for (int s = (row - r); s >= 1; s--) {
                System.out.print(" ");
            }
//            for stars( t);
            for (int t =  ((2 * r)); t >= 0 ; t--) {
                System.out.print("*");

            }
            System.out.println(" ");


        }



    }
}