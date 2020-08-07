/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hijul
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewVideo newVideo = new NewVideo();

        new EmailNotifObserver(newVideo);  
        new PushNotifObserver(newVideo);
        
        System.out.println("--------------------------------------");
        System.out.println("First notif");
        newVideo.setChannelAndVideoName("Kelas Terbuka","Pengenalan java OPP");

        System.out.println("--------------------------------------");
        System.out.println("Second notif");
        newVideo.setChannelAndVideoName("Adam Mukharil Bachtiar","CCDP Clean Class");
    }  
}
