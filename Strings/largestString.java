public class largestString {
  
  // lexicographic order means from ascending order (small to large)
  // question :--- 
  // for a given set of strings, print the largest string
  // "apple","mango","banana"

  // compareTo --function


  public static void main(String[] args) {
      String fruits[] = {"apple","mango","banana"};

      String largest = fruits[0];
      for(int i=1; i<fruits.length; i++) {
         if(largest.compareTo(fruits[i])<0){
         largest = fruits[i]; 
         }
      }
      System.out.println(largest);
  }
}
