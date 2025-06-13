public class basic {
  
  // Recursion => Recursion is a method of solving a computational problem where the solution depends on solutions to smaller instances of the same problem.
  // (it is defination learn)
  // Base case = final case 
  // 2 directions =>
  // 01. Top to down (Towards Base Case) (dividing problem)
  // 02.down to up (solutions combines)

  // 3 steps (1. Base Case , 2. Kaam , 3. f(n-1) (inner call) )


  // void means kuch bi return nahi hora


  // Print numbers from n to 1 (Decreading Order)
  
  public static void printDec(int n) {
    if(n == 1) {
      System.out.println(1);
      return;
    }
    System.out.print(n+" ");
    printDec(n-1);
  }

// call stack in this way it will excute
  public static void main(String[] args) {
      int n = 10;
      printDec(n);
  }
}


// stack overflow (callStack is full ) if base case is not there then stack overflow happens we cant print anything