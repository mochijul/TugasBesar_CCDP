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
public class Video1 extends User {

   public Video1(){
     type = "Sugar (Official Video)";
   }

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}
