
import java.util.Scanner;
public class array1 {
  public static void main(String[] args) {
    
    //creating an array
    //dataType arrayName[] = new dataType[size];
    //int marks[]=new int[50];
    //int numbers[]={1,2,3};

   // int scores[]=new int[30];
   // int score[]={10,20,30};
    //string fruits[]={"apple","banana"};

    int marks[]=new int[100];
    
    Scanner scanner = new Scanner(System.in);
    
    marks[0]=scanner.nextInt();//phy
    marks[1]=scanner.nextInt();//chem
    marks[2]=scanner.nextInt();//math
     
   

    System.out.println("phys : "+ marks[0]);
    System.out.println("chem : "+ marks[1]);
    System.out.println("math : "+ marks[2]);

   
    
    scanner.close();
  }
}

