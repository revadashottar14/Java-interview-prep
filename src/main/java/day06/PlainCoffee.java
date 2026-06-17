package day06;

public class PlainCoffee implements Coffee{
    @Override
    public double getCost() {
        return 50.0;
    }

    @Override
    public String getDescription() {
        return "Plain Coffee";
    }
}
