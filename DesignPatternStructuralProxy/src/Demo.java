/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hijul
 */
public class Demo {
    public static void main(String[] args) {
        VideoApi videoApi = new ProxyVideoApi("Tutorial Design Perttern");
        
        System.out.println("Load video detail ke-1");
        videoApi.getDetailVideo();
        
        System.out.println("Load video detail ke-2");
        videoApi.getDetailVideo();
    }
}
