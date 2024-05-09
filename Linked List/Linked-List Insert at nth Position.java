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

    // void removeMiddle(int c)
    // {
    //   if(c==1)
    //   {
    //     head=head.next;
    //   }
    //  node t  = head;

    //    c = c/2;
    //   for(int i=1;i<c;i++)
    //     {
    //       t=t.next;
    //     }
    //   t.next=t.next.next;
    // }

    void insNPosition(int key ,int pos ,int c)
    {
      if(pos>c)
      {
        // node nn  = new node(key);
        
      }
         node nn  =new node(key);

      if(pos==0)
      {
        nn.next=head;
        head=nn;
      }
      temp = head;
      for(int i=1;i<pos;i++)
        {
          temp=temp.next; // iterating and creating a temp node
        }
      nn.next=temp.next; // 
      temp.next = nn; 
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
      int key = in.nextInt();
      int pos = in.nextInt();
      
      m.insNPosition(key,pos,c);

      m.dis();
      
    }
  }