import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if ( n % 3 != 0 || n % 17 != 0 ) {
            System.out.println( " valid ");
        }else{
            System.out.println( " invalid ");
        }
    }
}
