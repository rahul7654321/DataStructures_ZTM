import java.io.*;
import java.util.*;

public class Main {

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    Node head;
    Node Temp;

    void ins(int data)
    {
        Node nn = new Node(data);

        nn.next = head;
        head = nn;
    }

    void dis()
    {
        Temp = head;

        while(Temp!=null)
        {
            System.out.println(Temp.data);
            Temp = Temp.next;
        }
    }

    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       Main m = new Main();
       // int n = in.nextInt();

      while(true)
        {
          int n = in.nextInt();
          if(n==-1)
          {
            break;
          }
          m.ins(n);
        }

       m.dis();
        in.close();
    }
}
