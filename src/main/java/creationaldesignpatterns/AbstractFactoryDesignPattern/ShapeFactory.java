package main.java.creationaldesignpatterns.AbstractFactoryDesignPattern;

public class ShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
        return null;
    }
}
