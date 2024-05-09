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
       node t  = head; //starting from head we are iterating
        while(t!=null)
          {
            if(nn.data == t.data) // if the data is already present we return nothing where 
            {
              return;
            }
            t = t.next; //we are iterating  next node
          }
        temp.next=nn;   // we are acessing the next node of the last node
        temp=nn; //we are updating the last node
      }
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

      while(true)
        {
          int n = in.nextInt();

          if(n==-1)
          {
            break;
          }
          else{
            m.ins(n);
          }

          
        }

      m.dis();
      
    }
  }