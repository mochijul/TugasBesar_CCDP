/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hijul
 */
public class ProxyVideoApi implements VideoApi{
    
    private RealVideoApi realVideoApi;
    private String videoName;
    
    public ProxyVideoApi(String videoName){
        this.videoName =  videoName;
    }

    @Override
    public void getDetailVideo() {
        if(realVideoApi == null){
            realVideoApi = new RealVideoApi(videoName);
        }else{
            System.out.println("Load Detail Video From Proxy");
        }
        realVideoApi.getDetailVideo();
    }
   
}
