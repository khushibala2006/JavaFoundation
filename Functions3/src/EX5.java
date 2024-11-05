import java.util.Scanner;
import java.lang.Math;


public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number");
        int num = sc.nextInt();

        int root = (int) Math.sqrt(num);


        if (root * root == num) {
            System.out.println(" it is a perfect square");
        }else{
            System.out.println( " it is not a perfect square");
        }   }
}
