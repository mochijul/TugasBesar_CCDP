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
public class MediaAdapter implements MediaPlayer {

   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String videoType){
   
      if(videoType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();			
         
      }
   }

   @Override
   public void play(String videoType, String fileName) {
   
      if(videoType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}
