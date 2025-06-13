public class MethodOverriding {
  // Method Overriding => Parent and classes both contain the same function with a different definition
  // Run time

  public static void main(String[] args) {
      Deer d = new Deer();
      d.eat();
  }
}


class Animal {
  void eat() {
    System.out.println("eats anything");
  }
}

class Deer extends Animal {
  void eat() {
    System.out.println("eats grass");
  }
}