import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;


public class DataSave {
    JSONArray jsonArray = new JSONArray();
    PlayerInfo player = new PlayerInfo();
    //playerInfo player, piece[][] board
    public void setPlayer(PlayerInfo player1){
        this.player = player1;
    }


    @Test
    public void save(){

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("ID", player.getID());
        jsonObject.put("Count", player.getCount());
        jsonObject.put("Start Date", player.getStartDate());
        jsonObject.put("End Date", player.getEndDate());
        jsonObject.put("Game Status", player.getGameOver());
        jsonObject.put("Total Time", player.getTotalTime());
        jsonObject.put("Board Status", player.getChessBoard());

        jsonArray.add(jsonObject);

        String jsonOutput = jsonArray.toJSONString();
        System.out.println(jsonOutput);
    }


}
