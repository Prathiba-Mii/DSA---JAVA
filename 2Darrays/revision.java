public class revision{

  public static void printSpiral(int[][] matrix) {
    // int x = 0;
    // int col = x;//col fixed 
    // for(int row = 0; row<matrix.length; row++){ //printing coloums 
      // for(int row =matrix.length-1; row>=0; row--){ //it is for reverse order
      // System.out.println(matrix[row][col]);
    // }

    // int y = 4;
    // int row = y;

    // for(int col=0; col<matrix[0].length; col++) { //for printing rows
    //   System.out.println(matrix[row][col]);
    // }

    int n=matrix.length;
    int m=matrix[0].length;

    int sr = 0, sc = 0, er = n-1, ec = m-1; //sr=starting row,sc=starting col,er=ending row,ec=ending col
   int row,col;

    while(sr<=er && sc<=ec) {
      //print starting col sr to er
       col = sc; //col=0
      for( row=sr; row<=er &&sr<=er && sc<=ec; row++) { //row=0,1,2,3,4
        System.out.print(matrix[row][col]+",");
      }
      sc++;
      //print ending row sc to ec
      row = er;//row=4
      for(col = sc; col<=ec && sr<=er && sc<=ec; col++) { //col=1,2,3,4
        System.out.print(matrix[row][col]+",");
      }
      er--;
      //print ending col er to sr
     col = ec; //col=4
     for(row=er;row>=sr && sr<=er && sc<=ec; row--) { //row=3,2,1,0
      System.out.print(matrix[row][col]+",");
     }
     ec--;
      // print starting row ec to sc
      row = sr;//row=0
      for(col = ec; col>=sc && sr<=er && sc<=ec;col--) { //col=3,2,1
        System.out.print(matrix[row][col]+",");
      }
      sr++;//this line ending no need to come again this line

      System.out.println();
    }
  }
  public static void main(String[] args) {
      int[][] arr = {
        {1,6,11,14,21},
        {2,7,12,15,25},
        {3,8,13,16,22},
        {4,9,17,19,24},
        {5,10,20,18,23}};
        printSpiral(arr);
  }
  //home work : leetcode 54 it is same like this try
}
  

