

public class arraySearch{
  public static void main(String[] args) {
     // Scanner sc=new Scanner(System.in);
      int arr[]={10,20,30,40,50};
      int target = 40;
      boolean found=false;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
          found=true;
          break;
        }
      }
      if(found==true){
         System.out.println("Element Present");
      }else{
        System.out.println("Element Absent");
      }
  }
}