public class DecoratorDemo {

    public static void main(String[]args) {
        Video thumbnail = new Thumbnail(new JudulVideo());
        thumbnail.tambah();
        System.out.println("\n=======YukCoding Media=========");

        Video subtitle = new Thumbnail(new Subtitle(new JudulVideo()));
        subtitle.tambah();
    }
}