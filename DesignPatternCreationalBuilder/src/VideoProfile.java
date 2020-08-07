import java.util.ArrayList;
import java.util.List;

public class VideoProfile {
    private List<VideoPlayerElement> items = new ArrayList<VideoPlayerElement>();

    public void addVideoPlayerElement(VideoPlayerElement item){
        items.add(item);
    }

    public int getTotalView(){
        int totalview = 0;

        for (VideoPlayerElement item : items) {
            totalview += item.views();
        }
        return totalview;
    }

    public void showVideoPlayerElements(){

        for (VideoPlayerElement item : items) {
            System.out.print("Judul : " + item.judul());
            System.out.print(", Tipe Video : " + item.videoviewtype().videoviewtype());
            System.out.println(", Jumlah View : " + item.views());
        }
    }
}