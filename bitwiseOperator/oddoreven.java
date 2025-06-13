public class oddoreven {
  
  public static void OddorEven(int n) {
    int bitMask = 1;
    if((n & bitMask) == 0) {
      // even
      System.out.println("even number");
    } else {
      // odd
      System.out.println("odd number");
    }


  }
  public static void main(String[] args) {
      OddorEven(3);
      OddorEven(11);
      OddorEven(14);
  }
}
