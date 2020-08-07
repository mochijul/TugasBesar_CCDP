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
public class Pengguna {
    private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Pengguna(String name){
      this.name  = name;
   }

   public void sendMessage(String message){
      RoomChat.showMessage(this,message);
   }
}
