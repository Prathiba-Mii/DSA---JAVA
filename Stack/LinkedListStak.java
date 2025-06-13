
public class LinkedListStak {
  // LinkedList using Stack
  static class Node{
    int data;
    Node next;
    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Stack {
    static Node head = null;

    public static boolean isEmpty() {
      return head == null;
    }

    //push
    public static void push(int data) {
      Node newNode = new Node(data);

      if(isEmpty()) {
        head = newNode;
        return;
      }

      newNode.next = head;
      head = newNode;
    }

    //pop
    public static int pop() {
      if(isEmpty()) {
        return -1;
      }
      int top = head.data;
      head = head.next;
      return top;
    }

    // peek
    public static int peek() {
      if(isEmpty()) {
        return -1;
      }
      return head.data;
    }
  }

  public static void main(String[] args) {
      Stack s = new Stack();
      // java collection framework is happens with the 
      // Stack<Integer> s = new Stack<>();
      // with this single line and have to import java.util.*; by this collection framework no need to write this much lengthy code
      // till they ask in interviews or in coding platforms write this code using java (collection framework) untill they ask in deep 
      s.push(1);
      s.push(2);
      s.push(3);

      while(!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
      }
  }

}
