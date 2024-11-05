public class EX19 {
  public static void main(String[] args) {
    int n = 4;

//    for rows;
    for (int row = 1; row <= n; row++) {

//      for column;
      for (int column = 1; column <= row; column++) {
        System.out.print(" * ");
      }
      System.out.println("  ");

    }
  }
}
