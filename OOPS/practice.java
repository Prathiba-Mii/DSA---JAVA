// public class practice {
//   public static void main(String args[]) {
//     Student s = new Student();
//     s.name = "Prathiba";
//     System.out.println(s.name);
//   }
// }

// class Student{
//   String name;
//   int marks;
// }

// ||||||||||||||||||||||||||||||||||||||||

// practice 2 

// public class practice {
//   public static void main(String args[]) {
//     int a=2, n=8;
//     int ans=1;

//     while(n>0) {
//       if(n%2==1) {
//         ans = ans*a;
//       }
//       n=n/2;
//       a=a*a;
//     }
//     System.out.println(ans);
//   }
//  }


// kadanes algorithm 
// negative values leaving max sum calculating , values adding positive

public class practice {
  public static void main(String[] args) {
      int a[] = {2,3,-1,-5,10,12};
      int ans = 0;
      int sum = 0;

      for(int i=0; i<a.length; i++) {
        sum+= a[i];

        if(sum>ans) 
          ans = sum;

          if(sum<0)
          sum=0;
      }
      System.out.println(ans);
  }
}