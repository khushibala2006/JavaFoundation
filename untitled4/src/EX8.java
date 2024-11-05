import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 10;

        if ( x > 15 || ( x%2==0 && x/7>1) )
        {
            x = 90;
        }
        System.out.println(x);
    }
}
// it is same as ex 7 but there is a small difference and difference is that it will aplly both the condition
// and the sec condition will work if input satified the both && part