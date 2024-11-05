import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the principal value");
        double principalvalue = sc.nextDouble();
        System.out.println(" enter the rate of interest");
        double interest = sc.nextDouble();
        System.out.println(" enter the no. of times interest compounded ");
        int n = sc.nextInt();
        System.out.println(" enter the time in years");
        int time = sc.nextInt();
        double  totalamount = principalvalue * Math.pow((1+interest / n) , n * time);
        System.out.println( totalamount);

    }
}
