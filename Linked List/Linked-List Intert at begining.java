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
//in this program inpusts are 1 2 3 4 5 -1
//where the output will be the 5 4 3 2 1 
//becasue it insert very new node at the begining of the link like the stack 
