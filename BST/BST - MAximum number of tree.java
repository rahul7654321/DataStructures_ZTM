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

    static int max(node root)
    {
      // int max = 0;
      if(root == null)
      {
        return 0;
      }

      return Math.max(root.data , Math.max(max(root.left) , max(root.right)));
     
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
          System.out.println(max(root));
      

    }
  }