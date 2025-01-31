public class dbubblesort {
  //dbubblesort is decending order bubblesort i gave name it as dbubblesort
  public static void main(String[] args) {
      int arr[] = {1,3,5,7,9};
      int n = arr.length;
      for(int i=0; i<n-1;i++) {
        for(int j=0;j<n-1-i;j++) {
          if(arr[j] < arr[j+1]) { //dencending symbol used  with if condition
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }
        }
      }
      for(int i=0;i<n;i++) {
        System.out.print(arr[i]+ " ");
      }
  }
}
