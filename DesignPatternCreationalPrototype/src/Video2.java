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
public class Video2 extends User {

   public Video2(){
     type = "Misery (Official Video)";
   }

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}
