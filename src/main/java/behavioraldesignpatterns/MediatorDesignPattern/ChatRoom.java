package main.java.behavioraldesignpatterns.MediatorDesignPattern;

import java.util.Date;

public class ChatRoom {
   public static void showMessage(User user, String message){
      System.out.println("\n" + new Date().toString() + " [" + user.name() + "] : " + message);
   }
}