public class sortedmatrix {
  public boolean searchMatrix(int[][] matrix,int target)  {

    int n=matrix.length;
    int m = matrix[0].length;

    int row = 0;
    int col = n-1;

    while(row<n && col>=0) {
      if(matrix[row][col] < target) {
        row++;

      } else if(matrix[row][col] > target) {
        col--;
      } else {
        return true;
      }
    }
    return false;
  }
}
//rotate 90degree, diagonal matrix also see