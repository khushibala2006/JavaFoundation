import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a >= 1000 && a < 10000 &&  a % 3 == 0 && a % 13 == 0 || a % 5 == 0 && a % 17 == 0){
            System.out.println("valid");
        }else {
            System.out.println("Not valid");
        }
    }
}
