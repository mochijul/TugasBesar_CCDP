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
public class Mp4Player implements AdvancedMediaPlayer{

   @Override
   public void playMp4(String fileName) {
      System.out.println("Playing MP4 file. Name: "+ fileName);		
   }
}
