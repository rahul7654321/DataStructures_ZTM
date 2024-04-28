public class Main {
  public int search(int[] a, int t) {
    int low = 0;
    int high = a.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (a[mid] == t) {
        return mid;
      } else if (a[mid] > t) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    Main solution = new Main();

    int[] a = { 1, 3, 5, 7, 9 };
    int target = 5;

    int index = solution.search(a, target);
    if (index != -1) {
      System.out.println("Target " + target + " found at index " + index);
    } else {
      System.out.println("Target " + target + " not found in the array");
    }
  }
}
