public class Thumbnail extends VideoDecorator {
    
    public Thumbnail(Video video) {
        super(video);
    }

    @Override
    public void tambah() {
        video.tambah();
        setThumbnail(video);
    }

    private void setThumbnail(Video video) {
        System.out.println("Thumbnail : Intro.jpg");
    }
}