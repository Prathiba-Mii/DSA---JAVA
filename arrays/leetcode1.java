public class leetcode1 {
  //leetcode 238 problem Product of Array Except Self
}

// class Solution {
//   public int[] productExceptSelf(int[] nums) {
      
//   int n = nums.length;
//   int[] res = new int[n];

//   for(int i = 0; i < n; i++) {
//     int product = 1;
//     for(int j = 0; j < n;j++) {
//       if(j != i) {
//         product = product * nums[j];
//       }
//     }
//     res[i] = product;
//   }
// return res;
//   }
// }
//this code made by brute force algorithm in this they dont calculate i=j both same values if they stay in , if 2 people in same room they dont take like this remaining values they take and add

//prefix and suffix 
//prefix adds all values from before it till it , suffix opposite of it multiply with last backside

// public int[] prefixsuffix(int[] nums) {
  //int n = nums.length;
// int[] prefix = new int[n];
// int[] suffix = new int[n];

// prefix[0] = nums[0];
// for(int i=1; i<n; i++) {
//   prefix[i] = nums[0];
//   prefix[i] = prefix[i-1] * nums[i];
// }

// suffix[n-1] = nums[n-1];
// for(int i=n-2; i>=0; i--) {
//   suffix[i] = suffix[i+1] * nums[i];
// }

// int[] res = new int[n];
// for(int i=1;i<n;i++){
//   res[i] = prefix[i-1]*suffix[i+1];
// }

// res[0] = suffix[1];
// res[n-1] = prefix[n-2];
// return res;

//now Majority Element 169 problem  Boyer morre voting algorithm

// public int majorityElement(int[] nums) {
//   int majority = nums[0], lead = 1;

//   for(int idx=1;idx < nums.length; idx++) {
//     if(nums[idx] == majority) {
//       lead++;
//     }
//     else if(lead >0) {
//       lead--;
//     }
//     else {
//       majority = nums[idx];
//       lead = 1;
//     }
//   }
//   return majority;
// }