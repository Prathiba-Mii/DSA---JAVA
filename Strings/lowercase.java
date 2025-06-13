
import java.util.*;
public class lowercase {
  // count how many times lowercase vowels occured in a string enetered by user (a,e,i,o,u)
  // ex: "Abcoprverx" => count = 2 
   
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    int count = 0;

    for(int i=0; i<=s.length(); i++) {
      char ch = s.charAt(i);

      if( ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
        count++;
      }
    }

    System.out.println("lowercase vowels count: " + count);
  }

}
