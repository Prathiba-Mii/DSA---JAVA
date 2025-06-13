public class creationstring{
     public static void printLetters(String str) {
      for(int i=0; i<str.length(); i++) {
        System.out.print(str.charAt(i) + " ");
      }
      System.out.println();
     }
  
    public static void main(String args[]) {
      // char arr[] = {'a','b','c','d'};
      // String str = " abcd";//ways to write string but this is the best way
      // String str2 = new String("xyz");

      // //Strings are IMMUTABLE(dont change value)

      // Scanner sc = new Scanner(System.in);
      // String name;
      //  name = sc.nextLine();//next is used for only one word and nextLine is for all words
      //  System.out.println(name);

      //  String fullName = "Prathiba Kamle";
      //  System.out.println(fullName.length());//length is for to know length of the string
       //space also count in length

       // concatenation
       String firstName = "Prathiba";
       String lastName = "Kamle";
       String fullName= firstName + " "+ lastName;
    //   System.out.println(fullName.charAt(1));
       //charAt is used for character at particular index, used in searching

       printLetters(fullName);
    }
}