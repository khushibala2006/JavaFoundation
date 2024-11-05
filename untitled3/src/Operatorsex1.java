import java.util.Scanner;

public class Operatorsex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter thr first number");
        double num1 = sc.nextDouble();
        System.out.println(" enter thr second number");
        double num2 = sc.nextDouble();
        System.out.println(" enter thr third number");
        double num3 = sc.nextDouble();
        double maximum = num1;
         if (num1 > num2) {
             maximum = num1;
         }
         if (num2 > num3) {
             maximum = num2;
        }
        if (num3 > maximum) {
             maximum = num3;
        }

        System.out.println(" the max number is " + maximum);

    }
}
