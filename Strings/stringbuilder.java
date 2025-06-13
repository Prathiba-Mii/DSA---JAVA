public class stringbuilder {
  // strings immutable
  // to make changes in string we use stringbuilder
  // sb.toString() to convert stringbuilder to string

  public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("");
      for(char ch='a'; ch<='z'; ch++) {
        sb.append(ch);
        // append means joining in the end
      }
      System.out.println(sb);
      System.out.println(sb.length());
  }
}
