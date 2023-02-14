package main.java.FactoryDesignPattern;

public class Worker {
    public Person getJob(String personJob) {
        switch (personJob.toLowerCase()) {
            case "beekeeper":
                return new Beekeeper();
            case "shoplifter":
                return new Shoplifter();
            case "accountant":
                return new Accountant();
            default:
                return null;

        }
    }
}
