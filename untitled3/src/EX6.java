import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int fixedprice = 100;
        double totallbill = fixedprice + unit;

        if (unit <= 100) {
             totallbill = 6.30 * unit;
        } else if (unit < 200) {
             totallbill = 66.85 * unit;
        } else if (unit > 200) {
             totallbill = 7.40 * unit;
        }
        System.out.println( " totall electricitybill is " + totallbill);
    }
}