public class firstoccurance {
  
  // write a function to find the first occurance of an element in an array
  
  public static int firstOccurance(int arr[], int key, int i) {
    if(i == arr.length) {
      return -1;
    }
    if(arr[i] == key) {
      return i;
    }

    return firstOccurance(arr, key, i+1);
  }


  public static void main(String[] args) {
    int arr[] = {8,3,6,9,5,10,2,5,3};
    System.out.println(firstOccurance(arr, 5, 0));
  }
}
