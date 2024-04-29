// "static void main" must be defined in a public class.
import java.util.Scanner;
public class Main {

    class node
    {
        int data;
        node next;

        node(int data)
        {
            this.data = data; // refers to the global value
        }

    }
    node h;//head
    node t;//temp
    void ins(int data)
    {
        node nn = new node(data);

        if(h==null)
        {
            h = nn; //insert at the begining

        }
        else
        {
            t = h ;
            while(t.next!=null)
            {
                if(nn.data == t.data)                
                    return;               

                t = t.next;                
            }   
            if(t.data!=data){
            t.next = nn;
            t = nn;
            }

        }

    }

    void dis()
    {
        t = h;
        while(t!=null)
        {
            System.out.print(t.data);
            t = t.next;
        }


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Main m = new Main();

        int n ; 

        while(true)
        {
            n = in.nextInt();
            if(n==-1)
            {
                break;
            }

                m.ins(n);

        }

        m.dis();





    }
}

//inputs should be 1 2 3 4 5 -1

//simple lined list inserting at the beginaing
