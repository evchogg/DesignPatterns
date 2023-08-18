package main.tests;

import main.java.SignletonDesignPattern.SingleObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonPatternDemoTest {

    @Test
    public void testSingleton() {
        String singleObjectTest = SingleObject.getInstance().showMessage();
        String expectedSingleton = "Somethingobject";
        assertEquals(expectedSingleton,singleObjectTest);
    }


}