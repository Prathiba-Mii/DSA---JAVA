public class NQueens {
  // N-Queens
  // place N queens on N*N chessboard such that no 2 queens can attack each other
  // In this we r solving for all possible outcomes

  public static boolean isSafe(char board[][],int row, int col) {
    // vertical up
    for(int i=row-1; i>0;i--) {
      if(board[i][col] == 'Q') {
        return false;
      }
    }

    // diagonal left up
    for(int i=row-1,j=col-1;i>=0 && j>0; i--,j--) {
      if(board[i][j] == 'Q') {
        return false;
      }
    }
    // diagonal right up
    for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
      if(board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }

  public static void nQueens(char board[][],int row) {

    // base
    if(row == board.length) {
      printBoard(board);
      return;
    }

    // column loop
    for(int j=0;j<board.length;j++) {
      if(isSafe(board,row,j)){
        board[row][j] = 'Q';
        nQueens(board, row+1); //function call
        board[row][j] = 'x'; //backtracking step
      }
      
    }
  }

  public static void printBoard(char board[][]) {
    System.out.println("______ chess board ________");
    for(int i=0;i<board.length;i++) {
       for(int j=0; j<board.length; j++){
        System.out.print(board[i][j] + " ");
       }
       System.out.println();
    }
  }

  public static void main(String[] args) {
      int n = 5;
      char board[][] = new char[n][n];
      // initialize
      for(int i=0;i<n;i++) {
        for(int j=0; j<n; j++) {
           board[i][j] = 'x';
        }
      }
      nQueens(board,0);
  }
}

// time complexity : O(n!)
// T(n) = n*T(n-1) + isSafe()
// n Knights also comes in this way same this approach