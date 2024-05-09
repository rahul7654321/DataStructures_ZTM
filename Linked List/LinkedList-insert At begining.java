// "static void main" must be defined in a public class.
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

        if(head==null)
        {
          head = nn;
          Temp = nn;
        }
      else
        {
          Temp.next = nn;
          Temp = nn;
        }
          
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


//inputs should be 1 2 3 4 5 -1

//simple lined list inserting at the beginaing
