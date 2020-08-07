public class PauseVideo implements Command {
    private Video video;

    public PauseVideo(Video vid) {
        this.video = vid;
    }

    @Override
    public void execute() {
        video.onPause();

    }
}
