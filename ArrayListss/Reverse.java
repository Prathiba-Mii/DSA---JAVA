// package ArrayListss;
import java.util.ArrayList;

public class Reverse {
  // print Reverse of an ArrayList
  // list = 1,2,3,4,5  // output = 5 4 3 2 1

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    // Reverse print
    for(int i=list.size()-1; i>=0; i--) {
      System.out.print(list.get(i)+" ");
    }
    System.out.println();
  }
}

// Time complexity : O(n)