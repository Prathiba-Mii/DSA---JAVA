public class dcountsort {
  
  public static void main(String[] args) {
      int arr[] = {1,6,3,3,2};
      int n = arr.length;

      int maxElement = 0;

      for(int i=0; i<n; i++) {
        if(arr[i] > maxElement) {
          maxElement = arr[i];
        }
      }

      int count[] = new int[maxElement+1];
      for (int i = 0; i <n; i++) {
          count[arr[i]]++;
           }

           for(int i=maxElement; i>0; i--) {
            int freq = count[i];
            for(int k=1; k<=freq; k++) {
              System.out.print(i+ " ");
              
            }
           }
  }
}
 