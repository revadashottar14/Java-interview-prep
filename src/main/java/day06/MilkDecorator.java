package day06;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost()+10.0; //ads milk
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Milk";
    }
}
