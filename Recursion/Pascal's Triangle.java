// Print Pascal's Triangle in Java
import java.io.*;

public class Main {
  
static int fact(int i)
  {
    if (i == 0)
      return 1;
    return i * fact(i - 1);
  }
  public static void main(String[] args)
  {
    int n = 4, i, j;

    //tip == i<=n j<=n-i " " j<=i  n! / r! * (n-r)! ln
  
    for (i = 0; i <= n; i++) {
      for (j = 0; j <= n - i; j++) {

        System.out.print(" ");
      }
      for (j = 0; j <= i; j++) {

        System.out.print(" " );
          System.out.print (fact(i) / (fact(j) * fact(i-j)));
      }

      System.out.println();
    }
  }
}
