import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class PlayerInfo {



       @JSONField(name = "ID")
       private String ID;

       @JSONField(name = "Count")
       private int count;

       @JSONField(name = "Start Date")
       private Date startDate;

       @JSONField(name = "End Date", format = "yyyy/MM/dd", ordinal = 3)
       private Date endDate;

       @JSONField(name = "Game Status")
       private GameStatus gameOver;

       @JSONField(name = "Total Time")
       private Long totalTime;

       @JSONField(name = "Board Status")
       private Piece[][] boardStatus;

       public void setGameOver(GameStatus code){
           this.gameOver = code;
       }
       public GameStatus getGameOver(){
           return this.gameOver;
       }

       public void setID(String code){
           this.ID = code;
       }
       public String getID(){
           return this.ID;
       }

       public void setCount(int code){
           this.count = code;
       }
       public int getCount(){
           return this.count;
       }

       public void setStartDate(Date code){
           this.startDate = code;
       }
       public Date getStartDate(){
           return this.startDate;
       }

/*       public void setPauseDate(Date code){
        this.pauseDate = code;
    }
       public Date getPauseDate(){
        return this.pauseDate;
    }*/

       public void setTotalTime(Long code){
          this.totalTime = code;
       }
       public Long getTotalTime(){
           return this.totalTime;
       }

       public void setEndDate(Date code){
           this.endDate = code;
       }
       public Date getEndDate(){
           return this.endDate;
       }

       public void setChessBoard(Piece[][] boardNow){
                 this.boardStatus = boardNow;
       }
       public Piece[][] getChessBoard(){
           return this.boardStatus;
       }


}
