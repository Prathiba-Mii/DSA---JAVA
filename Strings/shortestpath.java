//Given a route containing 4 directions (E,W,N,S), find the shortest path to reach destination.
// "WNEENESENNN"=====>w=west,e=east,n=north,s=south

public class shortestpath {
    
  public static float  getShortestPath(String path){
    int x = 0, y=0;

    for(int i=0; i<path.length();i++) {
      char dir = path.charAt(i);
      //south 
      if(dir == 'S') {
        y--;
      }
      //North
      else if(dir == 'N'){
        y++;
      }
      //West
      else if(dir == 'W') {
        x--;
      }
      //East
      else {
      x++;
      }
    }
    int X2= x*x;
    int Y2 = y*y;
    return (float)Math.sqrt(X2 + Y2);
  }

  public static void main(String[] args) {
      String path = "WNEENESENNN";
      // String path ="Ns";
      System.out.println(getShortestPath(path));
  }
}
