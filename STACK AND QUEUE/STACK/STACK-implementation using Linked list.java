import java.security.PublicKey;
import java.util.*;
class Node
  {
    int data;
    Node next;
    Node(int data)
    {
      this.data=data;
    }
  }

class stack
  {
    Node top;

    public void push(int data)
    {
      Node nn = new Node(data);

      if(top==null)
      {
        top = nn;
      }
      else
      {
        nn.next = top;
        top = nn;
      
      }
      
    }

    public void pop()
    {
      if(top==null)
      {
        System.out.println("Stack is empty");
      }
      else{
        top = top.next;
        
      }
    }

    public void peek()
    {
      if(top==null)
      {
        System.out.println("Stack is empty");
      }
      else{
        System.out.println(top.data);
      }
    }

    public void display()
    {
      if(top==null)
      {
        System.out.print("stack is empty");
      }
      else
      {
        Node t = top;
  
        while(t!=null)
          {
            System.out.print(t.data+" ");
            t=t.next;
          }
        
      }
    }
     
  }

public class Main
  {
    public static void main(String[] args)
    {
      stack s = new stack();
      s.push(10);
      s.push(20);
      s.push(30);
      s.push(40);
      s.push(50);
      s.display();
      System.out.println("Pushed sucess!!");
      s.pop();
      System.out.println("Pop - meand remove the top element fromt the stack");
      s.display();
      System.out.println("Peek - meand display the top element of the stack");
      s.peek();
    }
  }