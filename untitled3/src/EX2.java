import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number");
        int n = sc.nextInt();

        if ( n>= 90){
            System.out.println(" grade A");
        }else if (n>= 80){
            System.out.println(" grade B");
        }else if (n>= 70){
            System.out.println(" grade C");
        }else if (n>= 60){
            System.out.println(" grade D");
        }else if (n>= 50){
            System.out.println(" grade E");
        }

    }
}
