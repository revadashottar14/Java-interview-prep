package day06;

public class ChocolateDecorator extends CoffeeDecorator{
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost()+30.0;
    }

    @Override
    public String getDescription() {
    return coffee.getDescription()+" + Chocolate";
    }
}
