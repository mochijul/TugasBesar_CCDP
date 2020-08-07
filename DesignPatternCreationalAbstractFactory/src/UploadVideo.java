/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hijul
 */
public class UploadVideo {
    private Deskripsi deskripsi;
    private Judul judul;
    private Video video;
    
    public UploadVideo(VideoFactory f){
        deskripsi = f.createFieldDeskripsi();
        judul = f.createFieldJudul();
        video = f.createFieldVideo();
    }
    
    public void create(){
        deskripsi.create();
        judul.create();
        video.create();
    }
}
