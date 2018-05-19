
import java.util.Scanner;
import java.lang.Integer;
import java.util.HashMap;
//import java.lang.Math;
import java.io.*;
import java.util.*;
// A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class Tree_Left_View
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		//Node root=null;
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root=null;
            while (n > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);
                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }
            GfG g = new GfG();
			g.leftView(root);
			System.out.println();
         t--;	
        }
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class GfG
{
    class NewNode {
        Node node;
        int depth;
        NewNode(Node n, int d) {
            node = n;
            depth = d;
        }
    }
    void leftView(Node root)
    {
      // Your code here
      //idea is to do level traversal 
      ArrayList<Integer> out = new ArrayList<>();

      Queue<NewNode> q = new LinkedList<NewNode>();
      if(root == null) {
          return;
      }

      q.add(new NewNode(root, 0));
      int currentlevel = -1;

      while(!q.isEmpty()) {
          NewNode nn = q.remove();
          int d = nn.depth;
          if(d != currentlevel) {
              out.add(nn.node.data);
              currentlevel = d;
          }
          if(nn.node.left != null) {
              q.add(new NewNode(nn.node.left, d+1));
          }
          if(nn.node.right != null) {
              q.add(new NewNode(nn.node.right, d+1));
          }

          
      }

      for(int i : out) {
          System.out.print(i + " ");
      }
    }
void rightView(TreeNode node) {
//add code here.
max = 0;
levelTraverse(node, 1);
}
void levelTraverse(TreeNode node, int depth) {
    if(node == null) {
        return;
    }
    if(depth > max) {
        max = depth;
        System.out.print(node.data + " ");
    }
    levelTraverse(node.right, depth + 1);
    levelTraverse(node.left, depth + 1);
    }

}
}