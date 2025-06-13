public class interfaces {
  // interface is blueprint of class
  // ==> uses :--
  // used in multiple inheritance
  // to achieve total abstraction

  // class ko extends karthey
  // interfaces ko implement karthey
  public static void main(String[] args) {
       Queen q = new Queen();
       q.moves();
  }
}


interface ChessPlayer {
  void moves();
}

class Queen implements ChessPlayer {
  public void moves() {
    System.out.println("up,down,left,right,diagonally(in all 4 directions)");
  }
}

class Rook implements ChessPlayer {
  public void moves() {
    System.out.println("up,down,left,right");
  }
}

class King implements ChessPlayer {
  public void moves() {
    System.out.println("up,down,left,right,diagonally(by one step)");
  }
}