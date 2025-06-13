
import java.util.*;
public class PushBottom {
  // Question : Push at Bottom of the stack

  //Method :  remove then add from stack 

  public static void pushAtBottom(Stack<Integer> s, int data) {
    if(s.isEmpty()) {
      s.push(data);
      return;
    }
    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);
  }

  //reverse Stack
  public static void reverseStack(Stack<Integer> s) {
    if(s.isEmpty()) {
      return;
    }

    int top = s.pop();
    reverseStack(s);
    pushAtBottom(s, top);
  }

  public static void printStack(Stack<Integer> s) {
    while(!s.isEmpty()) {
      System.out.println(s.pop());
    }
  }


  public static void main(String[] args) {
    Stack<Integer> s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    //3,2,1
    // pushAtBottom(s, 4);
    // while(!s.isEmpty()) {
      // System.out.println(s.pop());
    // }

   // printStack(s);
    reverseStack(s);
    printStack(s);
    //1,2,3
  }
}
