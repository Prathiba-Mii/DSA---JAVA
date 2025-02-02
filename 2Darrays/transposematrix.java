import java.util.*;
public class transposematrix {
  class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] ans = new int[m][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}

// class Solution { leetcode 867 question only valid for sqaure matrix
//   public int[][] transpose(int[][] matrix) {
//       int n = matrix.length;

//       int curr_r = 0;
//       int curr_c = 0;

//       while(curr_r<n)  {
//           int i = curr_r;

//           for(int j=curr_c; j<n; j++) {
//               //swap row and col
//               int temp = matrix[i][j];

//               matrix[i][j] = matrix[j][i];
//               matrix[j][i] = temp;
//           }
//           curr_r++;
//           curr_c++;
//       }
//       return matrix;
//   }

//**************************************** */
}


