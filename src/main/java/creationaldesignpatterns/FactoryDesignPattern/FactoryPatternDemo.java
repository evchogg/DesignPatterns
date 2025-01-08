package main.java.creationaldesignpatterns.FactoryDesignPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Person james = worker.getJob("shoplifter");
        Person charles = worker.getJob("BEEkeeper");
        Person fred = worker.getJob("ACCOUNTANT");
        james.jobSelection();
        charles.jobSelection();
        fred.jobSelection();

    }
}

