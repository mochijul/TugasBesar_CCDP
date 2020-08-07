/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hijul
 */
public class Demo {
    private static UploadVideo uploadNewVideo(String category){
        UploadVideo upVideo = null;
        VideoFactory factory;
        
        if(category.toLowerCase().contains("music")){
            factory = new MusicVideo();
            upVideo = new UploadVideo(factory);
        }else if(category.toLowerCase().contains("game")){
            factory = new GameVideo();
            upVideo = new UploadVideo(factory);
        }else{
            System.out.println("Kategori tidak ditemukan..");
        }
        return upVideo;
    }
    
    public static void main(String[] args) {
        String kategori = "";
        UploadVideo upVideo;
                
        kategori = "game";
        upVideo = uploadNewVideo(kategori);
        upVideo.create();
        
        kategori = "music";
        upVideo = uploadNewVideo(kategori);
        upVideo.create();
    }
}
