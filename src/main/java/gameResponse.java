public class gameResponse {

    public void response (gameStatus status) throws Exception {
        switch (status){
            case WIN:
                break;

            case PAUSE:
                break;

            case GIVEUP:
                break;

            case RUNNING:
                break;

            default:
                throw new Exception("ERROR in the gameResponse script");
        }


    }
}
