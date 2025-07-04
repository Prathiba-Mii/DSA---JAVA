public class factorialn {
  // Print factorial of a number n

  public static int fact(int n) {
    if(n == 0) {
      return 1;
    }
    int fnm1 = fact(n-1);
    int fn = n * fnm1;
    return fn;
  }

  public static void main(String args[]) {
    int n = 5;
    System.out.println(fact(n));
  }
}

// time complexity is O(n)
// space complexity is O(n)