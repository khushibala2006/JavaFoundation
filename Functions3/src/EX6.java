import java.util.Scanner;
import java.util.*;

public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        int root = (int)Math.sqrt(a + 1);

        if ( root * root  == a + 1) {
            System.out.println( " it is a sunny number");
        } else {
            System.out.println( " it is not a sunny number");
             }




    }
}
