import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the weight in kg");
        int weight = sc.nextInt();
        System.out.println(" enter the height in meters");
        double height = sc.nextDouble();
        double BMI = weight / height * height;

        if ( BMI < 18.5){
            System.out.println(" thr person is thin");
        }else if (BMI  <= 25){
            System.out.println(" thr person is normal");
        }else if (BMI  <= 30){
            System.out.println(" thr person is overwqeight");
        }else if (BMI > 30){
            System.out.println(" thr person is obese");
        }
        System.out.println(" BMI IS " + BMI);
    }
}
