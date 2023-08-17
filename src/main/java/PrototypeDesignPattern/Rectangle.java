package main.java.PrototypeDesignPattern;

public class Rectangle extends Shape{
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void Draw() {
        System.out.println("Indise Rectangle draw method.");
    }
}
