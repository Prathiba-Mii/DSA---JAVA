import java.util.*;
public class ValidParantheses {
  public static boolean isValid(String str) {
    Stack<Character> s = new Stack<>();

    for(int i=0; i<str.length(); i++) {
      char ch = str.charAt(i);

      if(ch == '(' || ch == '{' || ch == '[') { // opening
        s.push(ch);
      } else {
        // closing
       if(s.isEmpty()) {
        return false;
       }
       if((s.peek() == '(' && ch == ')' ) 
       || (s.peek() == '{' && ch == '}')
       || (s.peek() == '[' && ch == ']')) {
        s.pop();
       } else{
        return false;
       }
      }
    }

    if(s.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

//duplicate parentheses :-- fid if it cotais duplicate parenthese or not. a set of parentheses are duplicate if the same suexpression is surrounded by multiple parentheses.return a true if it cotais duplicates else return false.


public static boolean isDuplicate(String str) {  // O(n)
  Stack<Character> s = new Stack<>();

  for(int i=0; i<str.length(); i++) {
    char ch = str.charAt(i);

    // closing
    if(ch == ')') {
      int count = 0;
      while(s.pop() != '(') {
        count++;
      }
      if(count < 1) {
        return true; //duplicate
      }

    } else {
      //opening
      s.push(ch);
    }
  }
  return false;
}

  public static void main(String[] args) {
      String str = "({()})[]";//True
        String str1 = "(a-b)"; //false
         String str2 = "((a-b))"; //true
      System.out.println(isValid(str));
      System.out.println(isDuplicate(str1));
     
  }
}
