package main.java.creationaldesignpatterns.AbstractFactoryDesignPattern;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("TRIANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory2.getShape("TRIANGLE");
        shape3.draw();

        Shape shape4 = shapeFactory2.getShape("RECTANGLE");
        shape4.draw();

    }
}
