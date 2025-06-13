public class powern {
  
  public static int power(int x, int n) {
    if(n == 0) {
      return 1;
    }
    // int xnm1 = power(x, n-1);
    // int xn = x* xnm1;
    // return xn;

    return x * power(x, n-1);
  }

  public static void main(String[] args) {
     System.out.println(power(2, 10)); 
  }
}

// time complexity : O(n)
// space complexity : O(n)


// Power Function2

// public static int power2(int a, int n) {
//   if(n == 0) {
//     return 1;
//   }
//   int halfPowerSq = power2(a,n/2) * power2(a,n/2);
//   if(n%2 != 0) {
//     return a*halfPowerSq;
//   }
//   return halfPowerSq;
// }

// time complexity : O(n)

// *********************************


// optimised Power function :

// public static int power3(int a, int n) {
  //   if(n == 0) {
  //     return 1;
  //   }
  //   int halfPowerSq = power3(a,n/2) * power2(a,n/2);
  //   int halfPowerSq = halfPower * halfPower;
  //   if(n%2 != 0) { // a is odd
  //     return a*halfPowerSq;
  //   }
  //   return halfPowerSq;
  // }

  // this only write when asked
  // this time complexity is : O(logn)
   
  