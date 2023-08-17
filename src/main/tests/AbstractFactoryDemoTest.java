package main.tests;

import main.java.AbstractFactoryDesignPattern.AbstractFactory;
import main.java.AbstractFactoryDesignPattern.FactoryProducer;
import main.java.AbstractFactoryDesignPattern.Shape;
import main.java.AbstractFactoryDesignPattern.ShapeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryDemoTest {


    @Test
    public void testShape() {
        AbstractFactory abstractFactoryTest = FactoryProducer.getFactory(true);
        String shapeTestOne = abstractFactoryTest.getShape("Triangle").draw();

        String drawOne = "Inside the draw() of RoundedTriangle";
        assertEquals(drawOne,shapeTestOne);

    }

    @Test
    public void testShapeTwo() {
        AbstractFactory abstractFactoryTestTwo = FactoryProducer.getFactory(false);
        String shapeTestTwo = abstractFactoryTestTwo.getShape("RECTANGLE").draw();

        String drawTwo = "Inside Rectangle draw()";
        assertEquals(drawTwo,shapeTestTwo);

    }




}