package day06;

public class DecoratorDemo {
    public static void main(String[]args){
        Coffee coffee = new PlainCoffee();
        System.out.println(coffee.getDescription()+" costs rs. "+coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription()+ " costs rs. "+coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription()+ " costs rs. "+coffee.getCost());

        coffee = new ChocolateDecorator(coffee);
        System.out.println(coffee.getDescription()+ " costs rs. "+coffee.getCost());

        System.out.println("\n--- Final Order ---");
        System.out.println(coffee.getDescription());
        System.out.println("Total Cost: ₹" + coffee.getCost());

    }
}
