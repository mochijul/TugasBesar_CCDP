public class VideoPlayerBuilder {

    public VideoProfile prepareVideoOffline(){
        VideoProfile videoprofile = new VideoProfile();
        videoprofile.addVideoPlayerElement(new MakeupTutorial());
        videoprofile.addVideoPlayerElement(new DesignTutorial());
        return videoprofile;
    }

    public VideoProfile prepareVideoLivestream(){
        VideoProfile videoprofile = new VideoProfile();
        videoprofile.addVideoPlayerElement(new Onlinegame());
        videoprofile.addVideoPlayerElement(new OfflineGame());
        return videoprofile;
    }
}