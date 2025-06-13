import java.util.Scanner;

public class arraystarting{
  public static void main(String[] args) {
      int n=5;
      Scanner sc = new Scanner(System.in);
      int arr[]=new int[n];

      System.out.println("Enter "+ n +"elements : ");

      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }

      System.out.println("Array Displayed : ");
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+ " ");
      }
      sc.close();
  }
}