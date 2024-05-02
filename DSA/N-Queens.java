
// You are using Java
import java.util.*;

class look {
  static int n;

  static void printmat(int[][] mat) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }

  static boolean isSafe(int[][] mat, int r, int c) {
    // vertical
    for (int i = 0; i < n; i++)
      if (mat[i][c] == 1)
        return false;

    // horizontal
    for (int j = 0; j < n; j++)
      if (mat[r][j] == 1)
        return false;

    // upper left diagonal

    for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
      if (mat[i][j] == 1)
        return false;

    // right upper diagonal
    for (int i = r, j = c; i >= 0 && j < n; i--, j++)
      if (mat[i][j] == 1)
        return false;

    return true;

  }

  static void nqueensolve(int[][] mat, int r) {
    if (r == n) {
      printmat(mat);
    } else {
      for (int c = 0; c < n; c++) {
        if (isSafe(mat, r, c)) {
          mat[r][c] = 1;
          nqueensolve(mat, r + 1);
          mat[r][c] = 0;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    n = in.nextInt();

    int[][] mat = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = 0;
      }
    }

    nqueensolve(mat, 0);

  }
}