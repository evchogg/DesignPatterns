package main.java.creationaldesignpatterns.AbstractFactoryDesignPattern;

public class RoundedShapeFactory implements AbstractFactory{

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return new RoundedTriangle();
        }
        return null;
    }
}
