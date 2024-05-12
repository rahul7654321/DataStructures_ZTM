import java.util.*;

public class Main
  {
    static class node
      {
        int data;
        node left,right;
        node(int data)
        {
          this.data = data;
          left = null;
          right =null;
        }
        
      }
    static node append(node root ,int data)
    {
      if(root==null)
      {
        node nn = new node(data);
        return nn;
      }
      else{
        if(data> root.data)
        {
          root.right = append(root.right , data);
          
        }
        else
        {
          root.left = append(root.left , data);
          
        }
  
        return root;
      }
    }

    void dis(node root)
    {
      if(root==null)
      {
        return;
      }
      System.out.print(root.data+" ");
      dis(root.left);
      dis(root.right);
    }

    static int add(node root )
    {
      if(root==null)
      {
        return 0;
      }
      return root.data  + add(root.left) + add(root.right);
    }
    
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      

          node root = null;
      while(true)
        {
          int n = in.nextInt();
          if(n==-1)
          {
            break;
          }
          root = append(root , n);
          
        }
          System.out.println(add(root));
      

    }
  }