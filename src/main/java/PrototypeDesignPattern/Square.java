package main.java.PrototypeDesignPattern;

public class Square extends Shape{
    public Square() {
        type = "Square";
    }

    @Override
    public  void Draw() {
        System.out.println("Inside Square draw method.");
    }
}
