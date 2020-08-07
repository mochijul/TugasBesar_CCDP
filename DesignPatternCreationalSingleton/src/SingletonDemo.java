public class SingletonDemo {
    public static void main(String[] args) {
        VideoPlayer vidplay = VideoPlayer.getVideoPlayer();
        VideoPlayer vidplay2 = VideoPlayer.getVideoPlayer();

        vidplay.putarVideo("Peterpan - Mungkin Nanti [Official Video]",  ".mp4");
        vidplay2.putarVideo("Peterpan - Menunggumu [Video Lirik]", ".mp4");
    }
}
