import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter num2");
        int a = sc.nextInt();
        System.out.println(" enter num1");
        int b = sc.nextInt();
        int larger   = a;

        if ( larger > b ){
            int subtraction = larger - b;
        }else if( b > larger ){
            int subtraction = b - larger;
            System.out.println("subtraction = " + subtraction);
        }

    }
}
