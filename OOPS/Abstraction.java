public class Abstraction {
  
  // Abstraction => Hiding all the unnecessary details and showing only the important parts to the user
  // (idea)
  // implement by :-
  // Abstract classes
  // interfaces

public static void main(String[] args) {
    Horse h = new Horse();
    h.eat();
    h.walk();
    System.out.println(h.color);

    Chicken c = new Chicken();
    c.eat();
    c.walk();
}


  // Abstarct class :---
  // instance(object)
}

abstract class Animal {
  String color;

  Animal() {
    color = "brown";
  }
  void eat() {
    System.out.println("animal eats");
  }

  abstract void walk();//abstract 
}

class Horse extends Animal{
  void changeColor() {
    color = "dark brown";
  }
  void walk() {
    System.out.println("Walks on 4 legs");
  }
}

class Chicken extends Animal {
  void changeColor() {
    color = "pink";
  }
  void walk() {
    System.out.println("Walks on 2 legs");
  }
}