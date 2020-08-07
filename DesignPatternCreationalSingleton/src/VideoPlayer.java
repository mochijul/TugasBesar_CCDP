public class VideoPlayer implements MediaPlayer {
    private static VideoPlayer videoPlayer;


    public static synchronized VideoPlayer getVideoPlayer(){
        if(videoPlayer==null){
            videoPlayer = new VideoPlayer();
        }

        return videoPlayer;
    }

    @Override
    public void putarVideo(String namaFile, String jenisVideo) {
        if(jenisVideo.equalsIgnoreCase(".mp4")){
            System.out.println("Sedang memutar : " + namaFile + jenisVideo);
        }
        else if(jenisVideo.equalsIgnoreCase(".mp4") || jenisVideo.equalsIgnoreCase(".vlc")){
        }

        else{
            System.out.println("Tidak dapat memutar video. " + jenisVideo + " format tidak didukung");
        }
    }
}
