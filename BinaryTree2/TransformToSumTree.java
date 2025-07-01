import java.util.*;

public class TransformToSumTree {

  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static int transform(Node root) {
    int leftChild = transform(root.left);
    int data = root.data;
    root.data = root.left.data + leftChild ;
    return data;
  }


   public static void main(String[] args) {
      /*
         1
        /  \
       2    3
      / \  /  \
     4   5 6   7
       */

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    int k = 3;
    kLevel(root, 1, k);
  
  }


}
