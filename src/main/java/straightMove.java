public class straightMove {
    public int movable(piece[][] board, int row, int col){
        // 0,0 --> 0,1    1,0
        if(row == 0 && col == 0){
            if(board[0][1] == piece.EMPTY){
                return 5;
            }
            else if(board[1][0] ==piece.EMPTY){
                return 7;
            }
            else
                return 0;
        }
        // 0,1  --> 0,0  0,2  1,1
        if(row == 0 && col == 1){
            if(board[0][0] == piece.EMPTY){
                return 4;
            }
            else if(board[0][2] == piece.EMPTY){
                return 5;
            }
            else if(board[1][1] == piece.EMPTY){
                return 7;
            }
            else
                return 0;
        }
        // 0,2 --> 0,1  1,2
        if(row == 0 && col == 2){
            if(board[0][1] == piece.EMPTY){
                return 4;
            }
            else if(board[1][2] == piece.EMPTY){
                return 7;
            }
            else
                return 0;
        }
        // 1,0  --> 0,0  1,1
        if(row == 1 && col == 0){
            if(board[0][0] == piece.EMPTY){
                return 2;
            }
            else if (board[1][1] == piece.EMPTY){
                return 5;
            }
            else
                return 0;
        }
        // 1,1  --> 1,0  0,1  1,2
        if(row == 1 && col == 1){
            if(board[1][0] == piece.EMPTY){
                return 4;
            }
            else if(board[0][1] == piece.EMPTY){
                return 2;
            }
            else if(board[1][2] == piece.EMPTY){
                return 5;
            }
            else
                return 0;
        }

        // 1,2  -->  1,1  0,2

        if(row == 1 && col == 2){
            if(board[1][1] == piece.EMPTY){
                return 4;
            }
            else if (board[0][2] == piece.EMPTY){
                return 2;
            }
            else
                return 0;
        }
        return 0;
    }
}
/**  1  2  3
 *   4  0  5
 *   6  7  8
 */
/**  0,0   0,1   0,2
 *   1,0   1,1   1,2
 */