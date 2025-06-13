public class encapsulation {
  
  public static void main(String[] args) {
      Student s1 = new Student();
      // System.out.println(s1.name);
      s1.name = "Prathiba";
      s1.roll = 1234;
      s1.password = "abcd";
      s1.marks[0] = 100;
      s1.marks[1] = 90;
      s1.marks[2] = 80;

      Student s2 = new Student(s1); //copy
      s2.password = "xyz";
      s1.marks[2] = 100;
      for(int i=0; i<3; i++) {
        System.out.println(s2.marks[i]);
      }
      // Student s2 = new Student("Prathiba");
      // Student s3 = new Student(123);
      // constructor overloading(many constructors)
      // Polymorphism
  }

}
// encapsulation contains(wrapping) data and menthod in single unit (class)(like capsules contains something inside in this way data(properties), methods(functions) contains.
// it is used for data hidiing)

// ** DEFINITION : encapsulation is defined as the wrapping up of data & methods under a single unit. It also implements data hiding.


// constructor is invokes when object creates ex:Pen p1 = new Pen();

class Student {
  String name;
  int roll;
  String password;
  int marks[];

  // copy constructor
  // Student(Student s1) {
  //   this.name = s1.name;
  //   this.roll = s1.roll;
  // }

  // shallow copy constructor
  // Student(Student s1) {
  //   this.name = s1.name;
  //   this.roll = s1.roll;
  //   this.marks = s1.marks;
  // }

  // deep copy constructor
  Student(Student s1) {
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    for(int i=0;i<marks.length;i++) {
      this.marks[i] = s1.marks[i];
    }
  }

  Student() {
    // this.name = name;
    System.out.println("constructor is called...");
  }
  Student(String name) {
    this.name = name;
  }
  Student(int roll) {
    this.roll = roll;
  }
}

// constructors types :----
// 01. non parameterized constructor
// 02. Parameterized
// 03. Copy Constructor

// copy constructor have issues like it will reflect to another changes references in this
// Shallow & Deep Copy
// Shallow (reference ) changes reflect
// Deep copy [new marks array making]
// stack overflow website pratice learn