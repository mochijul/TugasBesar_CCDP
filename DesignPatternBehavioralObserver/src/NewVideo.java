
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hijul
 */
public class NewVideo {
    private List<Observer> observers = new ArrayList<Observer>();
    private String channelName;
    private String videoName;
    
    public String getChannelName() {
        return channelName;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setChannelAndVideoName(String channelName, String videoName) {
        this.channelName = channelName;
        this.videoName = videoName;
        notifyAllObservers();
    }
    
    public void attach(Observer observer){
          observers.add(observer);
    }
    
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
