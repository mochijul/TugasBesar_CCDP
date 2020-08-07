public abstract class VideoDecorator implements Video {
    protected Video video;

    public VideoDecorator(Video v) {
        this.video = v;
    }

    @Override
    public void tambah() {
        video.tambah();
    }
}
