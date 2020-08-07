public class VideoProfileBuilder {
    public static void main(String[] args) {

        VideoPlayerBuilder videoplayerbuilder = new VideoPlayerBuilder();

        VideoProfile uploadedVideoProfile = videoplayerbuilder.prepareVideoOffline();
        System.out.println("Uploaded Video Information");
        uploadedVideoProfile.showVideoPlayerElements();
        System.out.println("Total Views: " + uploadedVideoProfile.getTotalView());

        VideoProfile liveStreamVideoProfile = videoplayerbuilder.prepareVideoLivestream();
        System.out.println("Livestream Video Information");
        liveStreamVideoProfile.showVideoPlayerElements();
        System.out.println("Total Views: " + liveStreamVideoProfile.getTotalView());
    }
}
