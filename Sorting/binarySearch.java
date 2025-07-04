
public class binarySearch{

  public static int binarySearch(int[] arr, int target) {
    int n = arr.length;

    int left = 0;
    int right = n-1;

    while(left <= right) {
      int mid = (left + right)/2;

      if(arr[mid] == target) {
         return mid;
      } else if(arr[mid] < target) {
            left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
      int[] arr = {5,3,2,1,4};
      System.out.println(binarySearch(arr,3));
  }
}

// time complexity :O(log n)