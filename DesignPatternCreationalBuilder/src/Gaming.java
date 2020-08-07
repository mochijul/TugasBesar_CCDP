public abstract class Gaming implements VideoPlayerElement {

    @Override
    public VideoViewType videoviewtype() {
        return new Livestream();
    }

    @Override
    public abstract int views();
}
