public class QuickSort {

  public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void quickSort(int arr[],int si, int ei) {
    if(si >= ei){
      return;
    }
//last element
  int pIdx = partition(arr,si,ei);
  quickSort(arr, si, pIdx-1);//left part
  quickSort(arr, pIdx+1, ei); //right
  }

  public static int partition(int arr[],int si,int ei) {
   int pivot = arr[ei];
   int i = si-1; //to make place for else smaller than pivot

   for(int j=si; j<ei; j++) {
    if(arr[j] <= pivot) {
      i++;
      //swap 
      int temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;
    }
   }

   i++;
   int temp = pivot;
   arr[ei] = arr[i];
   arr[i] = temp;
   return i;
  }

  public static void main(String[] args) {
      int arr[] = {6,3,9,8,2,5};
      quickSort(arr, 0, arr.length-1);
      printArr(arr);
  }
}


// its worst case time complexity is O(n^2)  
// Worst case occurs when pivot is always the smallest or the largest element.