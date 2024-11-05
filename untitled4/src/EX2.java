import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int heartdisease = sc.nextInt();


        if ( a > 15 ) {
            System.out.println(" person is allowed");
        }else if ( a > 45 && heartdisease ==0 ) {
            System.out.println(" person is allowed");
        }else {
            System.out.println(" person is not allowed");
        }
    }
}
