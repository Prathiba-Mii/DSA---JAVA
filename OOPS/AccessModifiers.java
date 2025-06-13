

public class AccessModifiers {
  
  // private,Default,Protected,Public
  // private access is within class.
  // Default acess is within class and within package
  // Protected access is within class, within package, outside package by subclass only
  // public access is within class, within package, outside package by subclass only, outside package

  // BankAccount myAcc = new BankAccount();
  // myAcc.username = "Prathiba";
  


// class BankAccount {
//   public String username;
//   private String password;
//   public void setPassword(String pwd) {
//     // password = pwd;
//   }
// }


public static void main(String args[]) {
  // Pen p1 = new Pen();
  // p1.setColor("Blue");
  // System.out.println(p1.getColor());
} }
// getter and setter

class Pen {
  // Private String color;
  // Private int tip;

  // String getColor() {
    // return this.color;
  // }

  // int getTip() {
    // return this.tip;
  // }

// this is used for referencing the current object

//  void setColor(String newColor) {
  // this.color = newColor;
 }
// }


// private we dont use outside class and protected also

// class should not be private and protected