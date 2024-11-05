import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        if ( a % 7 == 0 ){
            System.out.println( a + " is a buzz number");
        }else if(  a % 10 == 7){
            System.out.println( a + " is a buzz number");
        }else {
            System.out.println( a + " is not a buzz number");
        }


    }
}
