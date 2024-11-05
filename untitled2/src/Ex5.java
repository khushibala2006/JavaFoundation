import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth : ");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("The area of the breadth is " + area + " square cm ");
    }
}
