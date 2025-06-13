

public class LLMergeSort {
  //Merge sort in Linked List

   static Node head;
  
    public static class Node {
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
   }
  }

  public void addFirst(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
}

public void print() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}


  private Node getMid(Node head) {
    Node slow = head;
    Node fast = head.next;

    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow; // mid node
  }

  private Node merge(Node head1,Node head2) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while(head1 != null && head2 != null) {
      if(head1.data <= head2.data) {
        temp.next = head1;
        temp = temp.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }
    while(head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }

    while(head2 != null) {
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;
    }
    return mergedLL.next;
  }
  public Node mergeSort(Node head) {
    if(head == null || head.next == null) {
      return head;
    }
    //find mid
    Node mid = getMid(head);
    //left & right MS
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    //MERGE
    return merge(newLeft,newRight);
  }

  public void zigZag() {
    // find mid
    Node slow = head;
    Node fast = head.next;
    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    Node mid = slow;

    //reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;

    while(curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node left = head;
    Node right = prev;
    Node nextL, nextR;

    //alt merge - zig-zag merge
    while(left != null && right != null) {
      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;

      left = nextL;
      right = nextR;
    }
  }
  public static void main(String[] args) {
    LLMergeSort ll = new LLMergeSort();

      ll.addFirst(1);
      ll.addFirst(2);
      ll.addFirst(3);
      ll.addFirst(4);
      ll.addFirst(5);
      //5->4->3->2-> 1

      ll.print();
      ll.head = ll.mergeSort(ll.head);
      ll.print();
      ll.zigZag();
      ll.print();
  }
}
//O(n) = T.Complexity