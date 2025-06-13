public class lastoccurance {
  
  // write a function to find the last occurance of an element in an array

  public static int lastOccurance(int arr[], int key, int i) {
    if(i == arr.length) {
      return -1;
    }
    int isFound = lastOccurance(arr, key, i+1);
    if(isFound == -1 && arr[i] == key) {
      return i;
    }
    // check with self
    
      return isFound;
    
  }


  public static void main(String[] args) {
      int arr[] = {8,3,6,9,5,10,2,5,3};
      System.out.println(lastOccurance(arr, 5, 0));
  }
}
