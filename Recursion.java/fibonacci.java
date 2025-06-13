
public class fibonacci {
  // calculate nth term in fibonacci

  public static int fib(int n) {
    if(n==0 || n==1) { //base case //small value
      return n;
    }
    int fnm1 = fib(n-1); //1
    int fnm2 = fib(n-2); //2
    int fn = fnm1 + fnm2;
    return fn;
  }

  public static void main(String args[]) {
   
    int n = 25;
    System.out.print(fib(n));
  }
}

// O(n) space complexity
// O(2^n) time complexity