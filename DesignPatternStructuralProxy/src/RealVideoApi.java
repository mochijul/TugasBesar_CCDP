/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hijul
 */
public class RealVideoApi implements VideoApi{
    
    private String videoName;

    public RealVideoApi(String videoName){
        this.videoName =  videoName;
        loadFromDataBase(videoName);
    }
    
    @Override
    public void getDetailVideo() {
        System.out.println("Menampilkan detail dari video : "+videoName);
    }
    
    private void loadFromDataBase(String fileName){
      System.out.println("Loading data video : " + fileName);
   }
    
}
