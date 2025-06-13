public class immutablestring {
  // strings are immutable so we use stringbuilder
  // string buffer , string builder both same

  public static void main(String[] args) {
    
    StringBuilder sb = new StringBuilder("Prathiba");

    System.out.println("before append : " + sb.hashCode());

    // hashcode is unique code for each object

    sb.append("Kamle");

    
    System.out.println("after append : " + sb.hashCode());
  }
}
