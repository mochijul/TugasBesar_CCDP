public class PlayVideo implements Command {
    private Video video;

    public PlayVideo(Video vid) {
        this.video = vid;
    }

    @Override
    public void execute() {
        video.onPlay();

    }
}
