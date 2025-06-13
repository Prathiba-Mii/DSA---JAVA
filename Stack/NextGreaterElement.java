
import java.util.Stack;


public class NextGreaterElement {
  
  public static void main(String[] args) {
      int arr[] = {5,4,3,7,1};
      Stack<Integer> s = new Stack<>();
      int nxtGreater[] = new int[arr.length];

      //from right 
      for(int i=arr.length-1; i>=0; i--) {
        // step1 : while
        while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
          s.pop();
        }

        //2 if-else
        if(s.isEmpty()) {
          nxtGreater[i] = -1;
        } else {
          nxtGreater[i] = arr[s.peek()];
        }

        //3 push in s
        s.push(i);
      }

      for(int i=0; i<nxtGreater.length; i++) {
        System.out.print(nxtGreater[i] + " ");
      }
      System.out.println();
  }
}
//O(N)

// same problem' like this

//01. next Greater Right
//02. next Greater left
//03. next Smaller Right
//04. next Smaller Left