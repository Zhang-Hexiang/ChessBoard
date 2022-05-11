public class isGameOver {
    public boolean GG(piece[][] board){
        if(board[1][2] == piece.KING
                && board[1][1] == piece.ROOK
                && board[1][0] == piece.ROOK
                && board[0][0] == piece.BISHOP
                && board[0][1] == piece.BISHOP){
            return true;
        }
        else
          return false;
    }
    public boolean giveUp(){
        return false;
    }
}
