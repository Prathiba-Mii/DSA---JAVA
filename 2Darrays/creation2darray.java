import java.util.*;

public class creation2darray {

  public static boolean search(int matrix[][],int key) {
    for(int i=0; i<matrix.length; i++) {
      for(int j=0; j<matrix[0].length; j++) {
        if(matrix[i][j] == key) {
          System.out.println("found at cell (" + i +","+j+")");
          return true;
         }
      }
     
   }
   System.out.print("key not found");
   return false;
   }
  public static void main(String args[]) {
    int matrix[][] = new int[3][3];
    int n=matrix.length, m=matrix[0].length;  
    //n=rows=3,m=columns=3
    //cells = rows * columns 
    // if rows=4, columns=3 , then cells=4*3=12 ..... now we have 3rows and 3 columns so cells=3*3=9

    Scanner sc = new Scanner(System.in);
    for(int i=0; i<n; i++) {
      for(int j=0; j<m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    //output
    for(int i=0; i<n; i++) {
      for(int j=0; j<m; j++) {
        System.out.print( matrix[i][j] + " ");
      }
      System.out.println();
  }
  search(matrix, 5);
}
}