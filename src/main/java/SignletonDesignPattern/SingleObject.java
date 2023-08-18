package main.java.SignletonDesignPattern;

public class SingleObject {
    private SingleObject(){};
    private static SingleObject instance = new SingleObject();
    public static  SingleObject getInstance(){
        return instance;
    }

    public String showMessage() {
        return "Somethingobject";
    }
}
