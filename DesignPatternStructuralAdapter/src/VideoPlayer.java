/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuraladaptormediaplayer;

/**
 *
 * @author Reza
 */
public class VideoPlayer implements MediaPlayer {
   MediaAdapter mediaAdapter; 

   @Override
   public void play(String videoType, String fileName) {		

      //inbuilt support to play mp3 music files
      if(videoType.equalsIgnoreCase("vlc")){
         System.out.println("Playing VLC file. Name: " + fileName);			
      } 
      
      //mediaAdapter is providing support to play other file formats
      else if(videoType.equalsIgnoreCase("vlc") || videoType.equalsIgnoreCase("mp4")){
         mediaAdapter = new MediaAdapter(videoType);
         mediaAdapter.play(videoType, fileName);
      }
      
      else{
         System.out.println("Invalid media. " + videoType + " format not supported");
      }
   }   
}
