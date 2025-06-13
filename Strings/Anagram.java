import java.util.Arrays;
// same characters in words but in different order
public class Anagram {
   public static void main(String[] args) {
    
    String str1= "eat";
    String str2 = "tea";

    char[] s1Arr = str1.toCharArray();//['e','a'.'t']
    char[] s2Arr = str2.toCharArray();//['t','e','a']

    Arrays.sort(s1Arr);
    Arrays.sort(s2Arr);

    System.out.println(Arrays.equals(s1Arr,s2Arr));
  }
}
// time complexity is O(nlogn+mlogm)
// nlogn is first string and mlogm is second string