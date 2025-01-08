package main.java.creationaldesignpatterns.BuilderDesignPattern;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

//    @Override
//    public abstract float price();
}
