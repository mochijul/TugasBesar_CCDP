public class Subtitle extends VideoDecorator {

    public Subtitle(Video video) {
        super(video);
    }

    @Override
    public void tambah() {
        video.tambah();
        setSubtitle(video);
    }

    private void setSubtitle(Video video) {
        System.out.println("Subtitle : Bahasa Indonesia");
    }
}