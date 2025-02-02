import java.util.Arrays;
//time complexity:O(n logn)
public class inbuiltsort {
  
  public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String args[]){
    int arr[] ={ 4,3,1,2,5};
    Arrays.sort(arr);
   //Arrays.sort(arr,0,3);
    printArr(arr);
  }
}
