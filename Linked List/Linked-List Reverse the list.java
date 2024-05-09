import java.util.*;

public class Main
  {
    class node
      {
        int data;
        node next;
        node(int data)
        {
          this.data=data;
          this.next=null;
        }
      }
    node head;
    node temp;

    void ins(int data)
    {
      node nn =new node(data);
      if(head==null)
      {
        head = nn;
        temp =nn;
      }
      
      else
      {
      
        temp.next=nn;   // we are acessing the next node of the last node
        temp=nn; //we are updating the last node
      }
    }

    void reverse()
    {
      node t = head;
      node prev = null;

      while(t!=null)
        {
          node nn = t.next; //create new node and store the next node of the current node
          
          t.next = prev; //update the next node of the current node to the previous node
          prev = t; //update the previous node to the current node
          t = nn; //update the current node to the next node
        }
      head = prev;
    }
 
    

    

    void dis()
    {
      temp = head;

      while(temp!=null)
        {
          System.out.print(temp.data );
          temp = temp.next;
        }
    }
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);

      Main m = new Main();

      int c = 0;

      while(true)
        {
          int n = in.nextInt();

          if(n==-1)
          {
            break;
          }
          else{
            m.ins(n);
            c++;
          }

          
        }
      m.reverse();

      m.dis();
      
    }
  }