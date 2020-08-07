import java.util.ArrayList;
import java.util.List;

public class Video {
        private String name;
        private String videotype;
        private int views;
        private List<Video> information;

        // constructor
        public Video(String name,String videotype, int view) {
            this.name = name;
            this.videotype = videotype;
            this.views = view;
            information = new ArrayList<Video>();
        }

        public void add(Video e) {
            information.add(e);
        }

        public void remove(Video e) {
            information.remove(e);
        }

        public List<Video> getInformation(){
            return information;
        }

        public String toString(){
            return ("VideoChannel :[ Name : " + name + ", Video Type : " + videotype + ", Views :" + views+" ]");
        }
    }
