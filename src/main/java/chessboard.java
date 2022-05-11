public class chessboard {
    private piece[][] cBoard = new piece[2][3];
    public void start(){  //设定初始棋盘
        this.cBoard[0][0] = piece.KING;
        this.cBoard[0][1] = piece.BISHOP;
        this.cBoard[0][2] = piece.BISHOP;
        this.cBoard[1][0] = piece.ROOK;
        this.cBoard[1][1] = piece.ROOK;
        this.cBoard[1][2] = piece.EMPTY;

    }

    public static void startInstance(){    // start 的实例
        chessboard a = new chessboard();
        a.start();
    }


    public void setcBoard(piece[][] data){
        this.cBoard = data;
    }
  /*  public static void setcBoardInstance(piece[][] data){    // setcBoard 的实例
        chessboard a = new chessboard();
        a.setcBoard(data);
    }*/


    public piece[][] getcBoard() { //查询当先棋盘状态

        return this.cBoard;
    }

    public static piece[][] getcBoardInstance() { //查询当先棋盘状态Instance
        chessboard a = new chessboard();
        piece[][] pieceNow;
        pieceNow = a.getcBoard();
        return pieceNow;
    }

    public boolean winOrNot(){  //查询当前游戏是否完成
        if(this.cBoard[0][0] == piece.BISHOP
                && this.cBoard[0][1] == piece.BISHOP 
                && this.cBoard[0][2] == piece.EMPTY 
                && this.cBoard[1][0] == piece.ROOK
                && this.cBoard[1][1] == piece.ROOK
                && this.cBoard[1][2] == piece.KING){
            return true;
        }

        return false;
    }

    public static boolean winOrNotInstance(){    // start 的实例
        chessboard a = new chessboard();
        return a.winOrNot();
    }


    public void swap(int rowA, int colA, int rowB, int colB){  //交换AA 格子 和BB 格子的棋子
        piece mark = this.cBoard[rowA][colA];
        this.cBoard[rowA][colA] = this.cBoard[rowB][colB];
        this.cBoard[rowB][colB] = mark;
    }


    public static void swapInstance(int rowA, int colA, int rowB, int colB){  //交换AA 格子 和BB 格子的棋子
        chessboard a = new chessboard();
        a.swap(rowA,colA,rowB,colB);

    }
}
