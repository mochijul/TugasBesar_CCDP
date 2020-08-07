public class CompositePattern {
    public static void main(String[] args) {

        Video dailyVlog = new Video("RANS Entertainment","Top Rank dailyVlog", 30000);
        Video liveStream = new Video("ARAP","Top Rank livestream", 20000);
        
        Video entertainment = new Video("BrandonKent","Top Rank Entertainment", 20000);
        Video prank1 = new Video("Uya Kuya","Entertainment", 10000);
        Video prank2 = new Video("Angga Chandra","Entertainment", 10000);

        Video gaming1 = new Video("MiawAug","livestream", 10000);
        Video gaming2 = new Video("Tara Arts","livestream", 10000);

        dailyVlog.add(liveStream);
        dailyVlog.add(entertainment);

        liveStream.add(gaming1);
        liveStream.add(gaming2);

        entertainment.add(prank1);
        entertainment.add(prank2);

        //print all employees of the organization
        System.out.println(dailyVlog);

        for (Video topRatevideo : dailyVlog.getInformation()) {
            System.out.println(topRatevideo);

            for (Video secondrate : topRatevideo.getInformation()) {
                System.out.println(secondrate);
            }
        }
    }
}
