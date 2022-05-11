import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean start = true;
        boolean pause = false;
        boolean contiNUE = false;
        boolean giveUp = false;
        boolean win = false;
        long totalTime = 0;
        int count = 0;

        int locationRow =0,locationCol =0;

        playerInfo player = new playerInfo();

        System.out.println("Please enter your ID : ");

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        player.setID(str);
        input.close();

        player.setCount(count);

        Date dateNow = new Date();

        player.setStartDate(dateNow);
        player.setGameOver(gameStatus.RUNNING);

       // chessboard.startInstance();


        //首先接收一个棋子位置信息
        //调用pieceMove.isMovable 检查是否可以移动
        //调用chessBoard.swap 进行移动
        //以上步骤结束后调用 chessboard.winOrNot 检查游戏是否结束
        //若未结束则提示玩家进行下一次棋子选择
        //若结束则对当前玩家数据 与 highscore board中数据进行比较
        //若能够上榜则进行插入操作 并将playerInfo 进行存储
        //
//-------------------模拟移动过程-------------------------------------------------------
        Piece[][] pieceB = new Piece[2][3];


        while(true){
           // pieceB = chessboard.getcBoardInstance();
            pieceMove movable = new pieceMove();
            if(movable.isMovable(pieceB,locationRow,locationCol)){


                int emptyRow = 0, emptyCol = 0;     //记录空棋格位置信息
                for(int r = 0; r < locationRow; r++){       //遍历棋盘找出空棋格位置
                    for (int c = 0; c < locationCol; c++){
                        if(pieceB[r][c] == Piece.EMPTY){
                            emptyCol = c;
                            emptyRow = r;
                        }
                    }
                }

            //    chessboard.swapInstance(locationRow,locationCol,emptyRow,emptyCol);
                count++;
            //    win = chessboard.winOrNotInstance();
                if(win) break;
                else continue;
            }
            else{
                System.out.println("EMPTY!");
                continue;
            }

        }
//-------------------游戏结束------------------------------------------------
        if(win){
            Date now = new Date();
            long total1 = player.getTotalTime();
            long total2 = now.getTime() - dateNow.getTime();
            //player.setPauseDate(now);
            player.setEndDate(now);
            player.setGameOver(gameStatus.WIN);
            player.setTotalTime(total1 + total2);
            player.setCount(count);

        }
//------------------暂停-------------------------------------------------
        if(pause){

            Date now = new Date();

            long total = now.getTime() - dateNow.getTime();
            //player.setPauseDate(now);
            player.setEndDate(now);
            player.setGameOver(gameStatus.PAUSE);
            player.setTotalTime(total);
            player.setCount(count);
        }
//--------------------放弃-------------------------------------------------
        if(giveUp){
            boolean rUSure = false;
            while(rUSure){

            }
        }

    }
}
