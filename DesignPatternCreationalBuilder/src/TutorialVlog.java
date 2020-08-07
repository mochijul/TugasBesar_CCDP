public abstract class TutorialVlog implements VideoPlayerElement {

    @Override
    public VideoViewType videoviewtype() {
        return new OfflineVideo();
    }

    @Override
    public abstract int views();
}