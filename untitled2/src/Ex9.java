import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the celsius: ");
        double celsius= sc.nextInt();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit + " Fahrenheit");

    }
}
