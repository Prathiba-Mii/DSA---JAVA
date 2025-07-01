import java.util.*;

public class QueueJavaCollectionFramework {
  // Queue using java collection Framework

  public static void main(String[] args) {
      // Queue q = new Queue();
      // Queue<Integer> q = new LinkedList<>(); //ArrayDeque
      Queue<Integer> q = new ArrayDeque<>(); //O(n)



      q.add(1);
      q.add(2);
      q.add(3);

      while(!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
      }
  }
}

// always write code using java collection framework without using java collection framework dont write code in interviews , coding plateforms untill they ask u to write from scratch.