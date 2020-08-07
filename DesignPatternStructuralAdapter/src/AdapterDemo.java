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
public class AdapterDemo {
   public static void main(String[] args) {
      VideoPlayer mediaPlayer = new VideoPlayer();

     
      mediaPlayer.play("mp4", "PREP - Futures.mp4");
      mediaPlayer.play("vlc", "HIVI - Remaja.vlc");
      mediaPlayer.play("avi", "Stuck With U.avi");
   }
}
