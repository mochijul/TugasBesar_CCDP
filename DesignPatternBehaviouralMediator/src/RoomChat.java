/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author Reza
 */

public class RoomChat {
   public static void showMessage(Pengguna user, String message){
      System.out.println(" [" + user.getName() + "] : " + message);
   }
}
