/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalprototype;

/**
 *
 * @author Reza
 */
public class Video3 extends User {

   public Video3(){
     type = "Daylight (Lyric Video)";
   }

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}
