public class pieceMove {
    public boolean isMovable(piece[][] board, int row, int col){
        piece thisPiece = board[row][col];  //记录当前所选择的棋子种类
        int emptyRow = 0, emptyCol = 0;     //记录空棋格位置信息
        for(int r = 0; r < row; r++){       //遍历棋盘找出空棋格位置
            for (int c = 0; c < col; c++){
                if(board[r][c] == piece.EMPTY){
                    emptyCol = c;
                    emptyRow = r;
                }
            }
        }
        int thisPieceMark = row + col;
        int emptyPieceMark = emptyCol + emptyRow;
        int absCoordinateValue = Math.abs(thisPieceMark - emptyPieceMark);  //当前棋子坐标之和  与  空棋格坐标之和  之差  若为1 则是直线关系  若为0或2 则是对角关系
        if(thisPiece != piece.EMPTY && Math.abs(col - emptyCol) != 2){     // 当前棋子不为空  且  当前棋子与空棋格相邻
            if(absCoordinateValue == 1 && thisPiece != piece.BISHOP){      // 当前棋子与空棋格为直线关系  且  当前棋子不为 象
                return true;
            }
            else if(absCoordinateValue == 0 || absCoordinateValue == 2 && thisPiece != piece.ROOK){  // 当前棋子与空棋格为对角关系  且  当前棋子不为 车
                return true;
            }
            else
                return false;
        }

        else
           return false;
    }
}
// 棋子移动