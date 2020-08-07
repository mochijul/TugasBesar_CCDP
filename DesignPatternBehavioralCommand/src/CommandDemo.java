public class CommandDemo {
    public static void main(String[] args){
        Video video = new Video();
        Command clickPlayButton = new PlayVideo (video);
        Command clickPauseButton = new PauseVideo (video);

        Button btn = new Button();

        String client = "PAUSE";

        if(client.equalsIgnoreCase("PLAY")){
            btn.storeAndExecute(clickPlayButton);
        }else if(client.equalsIgnoreCase("PAUSE")){
            btn.storeAndExecute(clickPauseButton);
        }
    }
}
