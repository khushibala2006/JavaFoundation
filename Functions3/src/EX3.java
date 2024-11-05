import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x1 point: ");
        int x1 = sc.nextInt();
        System.out.println("Enter the x2 point: ");
        int x2= sc.nextInt();
        System.out.println(" enter the y1 point: ");
        int y1 = sc.nextInt();
        System.out.println(" enter the y2 point: ");
        int y2= sc.nextInt();

        double distance = Math.sqrt(Math.pow(( x2 - x1),2) + Math.pow((y2-y1),2));
        System.out.println("The distance between the two points is: " + distance);







    }
}
