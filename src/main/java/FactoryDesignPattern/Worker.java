package main.java.FactoryDesignPattern;

public class Worker {
    public Person getJob(String personJob) {
        return switch (personJob.toLowerCase()) {
            case "beekeeper" -> new Beekeeper();
            case "shoplifter" -> new Shoplifter();
            case "accountant" -> new Accountant();
            default -> null;
        };
    }
}
