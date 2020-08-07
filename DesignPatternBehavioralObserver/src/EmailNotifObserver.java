/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hijul
 */
public class EmailNotifObserver extends Observer{

    public EmailNotifObserver(NewVideo newVideo) {
        super(newVideo);
        this.subject.attach(this);
    }
    

    @Override
    public void update() {
        System.out.println("=== Email notification ===");
        System.out.println("Video baru dari: "+ subject.getChannelName());
        System.out.println("Berjudul : "+ subject.getVideoName());
    }
}
