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
public class PrototypeDemo {
   public static void main(String[] args) {
      UserCache.loadCache();

      User clonedUser = (User) UserCache.getUser("1");
      System.out.println("Maroon 5 : " + clonedUser.getType());		

      User clonedUser2 = (User) UserCache.getUser("2");
      System.out.println("Maroon 5 : " + clonedUser2.getType());		

      User clonedUser3 = (User) UserCache.getUser("3");
      System.out.println("Maroon 5 : " + clonedUser3.getType());		
   }
}
