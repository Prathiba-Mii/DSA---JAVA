public class Classobject {
  
  // class is collection of entity 
  // object is a entity in real world ex: car, pen , book
  // then class is a blueprint of the object
  // class ex: in classroom have students like same subjects , same age ,same teacher, same periods subjects etc
  // class starts with first letter is capital letter
  // in functions class starts with small letter 

  public static void main(String[] args) {
    Pen p1 = new Pen(); // created an object called p1
    p1.setColor("Blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    // p1.setColor("Yellow");
    // System.out.println(p1.color);
    p1.color = "Yellow";
    System.out.println(p1.color);
  }
}


class Pen {
  String color;
  int tip;//thickness = tip
  
  void setColor(String newColor) {
    color = newColor;
  }

  void setTip(int newTip) {
    tip = newTip;
  }
}



class Student {
  String name;
  int age;
  float percentage; //cgpa

  void calcPercentage(int phy, int chem, int math) {
    percentage = (phy + chem + math) /3;
  }
}