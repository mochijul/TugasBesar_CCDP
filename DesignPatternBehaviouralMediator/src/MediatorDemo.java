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
public class MediatorDemo {
    public static void main(String[] args) {
      Pengguna reza = new Pengguna("Reza");
      Pengguna hijul = new Pengguna("Hijul");

      reza.sendMessage("Video kamu bagus, saya suka");
      hijul.sendMessage("Iya terimakasih!");
   } 
}
