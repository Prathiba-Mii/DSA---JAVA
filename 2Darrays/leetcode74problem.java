public class leetcode74problem {
//   class Solution {
//linear search approach
//     public boolean searchMatrix(int[][] mat, int target) {
//         int rows = mat.length,  cols= mat[0].length;

//       for(int r=0; r < rows; r++) {
//         for(int c=0; c < cols; c++) {
//             if(mat [r][c] == target) return true;
//         }
//       }
//         return false;
      
//     }
    
// }
//***************************************************************************************
// class Solution {
//   public boolean searchMatrix(int[][] mat, int target) {
//      for(int r=0;  r<mat.length; r++) {
//       //binary search
//          int left = 0, right= mat[0].length-1;
//          while(left <= right) {
//           int mid = (left + right)/2;

//           if(mat[r][mid] == target) return true;
//           if(mat[r][mid] < target) left=mid+1;
//           else right=mid-1;
//          }
//      }
//     return false;
//   }
  
// }
// // *******************************************************************************
 }
