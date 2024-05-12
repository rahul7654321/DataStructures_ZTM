import java.util.*;

public class Main
  {
    static class node
      {
        int data;
        node left , right;

        node(int data)
        {
          this.data = data;
          
        }
      }

    public static node append(node root , int data)
    {
        if (root == null) {
            node nn = new node(data);
            return nn;
        }
      else
      {
        if(data > root.data)
        {
          root.right = append(root.right , data);
        }
        else
        {
          root.left = append(root.left , data);
        }
      }

      return root;
    }

    static void dis(node root)
    {
      if(root == null)
      {
        return ;
      }
      
      
      // System.out.print(root.data+" ");  //preorder
          dis(root.left);
      // System.out.print(root.data+" "); // inorder
          dis(root.right);
          // System.out.print(root.data + " "); //postorder
      

    }


    public static void main(String[] args)
    {
      Scanner in  = new Scanner(System.in);
      node root = null;

      while(true)
        {
          int data = in.nextInt();
          if(data <0)
          {
            break;
          }

          root = append(root , data);

          
        }

      dis(root);
    }
  }