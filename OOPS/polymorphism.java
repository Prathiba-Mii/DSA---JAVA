public class polymorphism {
  
  // poly = many , morphism = forms
  // Compile time polymorphism [static] => Method Overloading
  // Compile time polymorphism [Dynamic]=> Method Overriding

  // Method Overloading => " Multiple functions with the same name but different parameters"

  public static void main(String[] args) {
      Calculator calc = new Calculator();
      System.out.println(calc.sum(1,2));
      System.out.println(calc.sum((float)1.5,(float)2.5));
      System.out.println(calc.sum(1,2,3));
  }
  
}

class Calculator {
  int sum(int a, int b) {
    return a + b;
  }
  float sum(float a, float b) {
     return a + b;
  }

  int sum(int a, int b, int c) {
    return  a+b+c;
  }
}
// function overloading 
// function overriding