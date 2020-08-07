public class StrategyPatternDemo {
    public static void main(String[] args) {
        Update update = new Update(new AddVideo());
        System.out.println("Uploaded Videos Count");
        System.out.println("Menambah 4 video, Total Video Sekarang :" + update.executeStrategy(10, 4));

        update = new Update(new DeleteVideo());
        System.out.println("Menghapus 2 video Total Video Sekarang :" + update.executeStrategy(14, 2));

    }
}