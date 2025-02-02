
import java.util.*;
public class leetcode33 {
  public int search(int[] arr, int target) {
 
    int n = arr.length;
    
    int left = 0;
    int right = n-1;

    while(left < right) {
      int mid = (left + right)/2;

      if(arr[mid] > arr[right]) { //should not possible
        left = mid +1;
      } else {
        right = mid;
      }
    } //left == right
    int shift = left;

    left = 0;
    right = n-1;

    while(left <= right) {
      int mid = (left + right)/2;

      int realMid = (mid + shift) % n;

      if(arr[realMid] == target) {
        return realMid;
      } else if(arr[realMid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  // public static void main(String[] args) {
    
  // }
}
//try to do Rotate Array in leetcode . its 189 question in leetcode.

//3Sum problem also in leetcode 15 question 
//2sum also doo 