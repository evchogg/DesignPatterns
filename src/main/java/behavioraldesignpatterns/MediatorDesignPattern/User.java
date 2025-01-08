package main.java.behavioraldesignpatterns.MediatorDesignPattern;

public record User(String name) {
 
    public void sendMessage(String message){
       ChatRoom.showMessage(this,message);
    }
 }
