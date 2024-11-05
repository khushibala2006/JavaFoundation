import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();

        if ( a % 111 == 0 ){
            System.out.println( a + " is a nelson number ");

        }else{
            System.out.println( a + " is not a nelson number ");
        }

    }
}
