public class intern {
  
  public static void main(String[] args) {
    String str1 = new String("Prathiba"); // string object -> heap

    String str2 = "Prathiba";//string literal -> string pool

    str1 = str1.intern();//intern method is used to store the string object in the string pool

    System.out.println(str1==str2);
  }
}
