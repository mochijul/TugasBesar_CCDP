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
import java.util.Hashtable;

public class UserCache {
	
   private static Hashtable<String, User> userMap  = new Hashtable<String, User>();

   public static User getUser(String shapeId) {
      User cachedShape = userMap.get(shapeId);
      return (User) cachedShape.clone();
   }

   // for each shape run database query and create shape
   // shapeMap.put(shapeKey, shape);
   // for example, we are adding three shapes
   
   public static void loadCache() {
      Video1 video1 = new Video1();
      video1.setId("1");
      userMap.put(video1.getId(),video1);

      Video3 video3 = new Video3();
      video3.setId("2");
      userMap.put(video3.getId(),video3);

      Video2 video2 = new Video2();
      video2.setId("3");
      userMap.put(video2.getId(), video2);
   }
}
