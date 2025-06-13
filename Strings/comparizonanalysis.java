public class comparizonanalysis {

  public static void main(String[] args) {
      String s1 ="Prathiba";
      String s2 ="Prathiba";
      String s3 = new String("Prathiba");
      // interming 

      if(s1==s2){
        System.out.println("Strings are equal");
      }else{
        System.out.println("Strings are not equal");
      }

      if(s1==s3){
        System.out.println("Strings are equal");
      }else{
        System.out.println("Strings are not equal");
      }

      if(s1.equals(s3)){
        System.out.println("Strings are equal");
      }else{
        System.out.println("Strings are not equal");
      }
  }
  //.equals is used for comparision of the content of the string
  
}
