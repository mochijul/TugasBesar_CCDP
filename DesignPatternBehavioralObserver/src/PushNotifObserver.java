/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hijul
 */
public class PushNotifObserver extends Observer {

    public PushNotifObserver(NewVideo newVideo) {
        super(newVideo);
        this.subject.attach(this);
    }
    

    public void update() {
        System.out.println("=== Push notification ===");
        System.out.println(subject.getChannelName() + ", baru saja mengupload video baru");
        System.out.println("Berjudul "+ subject.getVideoName());
    }    
}
