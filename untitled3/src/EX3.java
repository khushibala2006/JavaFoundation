import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        if ( n < 1 && n >99){
            System.out.println("Invalid Input");
        }
        System.out.println(" please specify a number greater than 0 and less than 100");
    }
}
