public class selectionsort {
  //smallest all once put in the beginning of the array , it removes unnessary swaps (which is happened in bubble sort)
  //Time complexity is O(n^2)
  public static void selectionSort(int arr[]) {
    for(int i=0; i<arr.length-1; i++) {
      int minPos = i;
      for(int j=i+1; j<arr.length; j++) {
        if(arr[minPos] > arr[j]) {
          minPos = j;        
        }
      }
    
    //swap
    int temp = arr[minPos];
    arr[minPos] = arr[i];
    arr[i] = temp;
    }
  }

  public static void printArr(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+ " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = {2,5,3,4,1};
    selectionSort(arr);
    printArr(arr);
  }
}
