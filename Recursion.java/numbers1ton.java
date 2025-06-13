public class numbers1ton {
  // print numbers from 1 to n (increasing Order)

  // if n=5 then it should print 1 2 3 4 5

  public static void printInc(int n) {
    if(n == 1) {
      System.out.print(n+" ");
      return;
    }
    printInc(n-1);
    System.out.print(n+" ");
  }
  public static void main(String[] args) {
      int n = 10;
      printInc(n);
  }
}
