import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {

        Chessboard chessboardIns = new Chessboard();
        chessboardIns.swap(0,0,1,1);
        System.out.println(Arrays.deepToString(chessboardIns.getcBoard()));

        for(int i = 0; i<1;i++){
            System.out.println(i);
        }
    }
}
