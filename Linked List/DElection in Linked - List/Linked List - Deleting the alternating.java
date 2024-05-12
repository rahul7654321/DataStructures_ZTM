import java.util.Scanner;
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

    node h;
    node t;

    void ins(int data)
    {
      node nn = new node(data);

      if(h==null)
      {
        h =nn;
        t =nn;
      }
      else{
        t.next = nn;
        t = nn;
        
      }
    }

    void delAlter()
    {
      if(h.next==null)
      {
        return;
      }
      else{
        node f= h; //f = 10
        node s ;

        while(f!=null && f.next!=null)
          {
            s = f.next; //s = 20 where f.next 10 -> 20
            f.next = s.next; //f.next =20 where s = 20 s.next = 30 so f.next =  30
            f = f.next; //f = 30 // 20 is neglgated
            
          }
      }
    }

    void display()
    {
      node t = h;

      while(t!=null)
        {
          System.out.print(t.data+" ");
          t = t.next;
        }
    }

    
     public static void main(String[] args)
       {
          Scanner in = new Scanner(System.in);
       Main m = new Main();
       


      while(true)
        {
         int n= in.nextInt();

          if(n==-1)
          {
            break;
          }
          m.ins(n);

          
          
        }
       m.delAlter();

         m.display();  


       
       }
  }

// inputs are 10  20 30 40 50 60 70 80 90 100 -1