import java.util.*;

public class Main {
  class node {
    int data;
    node next;

    node(int data) {
      this.data = data;
    }
  }

  node h;
  node t;

  void ins(int data) {
    node nn = new node(data);
    if (h == null) {
      h = nn;
      t = nn;
    } else {
      t.next = nn;
      t = nn;

    }

  }

  void dis(int k) {
    t = h;

    int count = 0;
    while (t != null) {
      if (t.data == k) {
        count++;
        t = t.next;
      } else {

        t = t.next;
      }
    }

    if (count > 0) {
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Main m = new Main();

    int n;
    while (true) {
      n = in.nextInt();
      if (n < 0) {
        break;
      }
      m.ins(n);
    }

    int k = in.nextInt();

    m.dis(k);
  }
}
