public class Inheritance {
  
  // Inheritance is when properties & methods of base class are passed on to a derived class.

  public static void main(String args[]) {
    //  Fish shark = new Fish();
    //  shark.eat();
    Dog dobby = new Dog();
    dobby.eat();
    // dobby.legs = 4;
    // System.out.println(dobby.legs);

  }
}



// Base class(parent)
class Animal {
  String color;

  void eat() {
    System.out.println("eats");
  }

  void breathe() {
    System.out.println("breathes");
  }
}


class Mammal extends Animal {
  // int legs;//multi level
  // void walk();
  // System.out.println("walks");
}

class Dog extends Mammal {
  String breed;
}

// Derived Class / sub class (child)
class Fish extends Animal {
  // int fins;

  void swim() {
    System.out.println("swims in water");
  }
}

// single level inheritance it is fish
// Multi level inheritance =>Animal,Mammal, dog
// hierarchial inheritance
// Hybrid Inheritance
// Multiple Inheritance