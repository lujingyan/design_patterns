package design.pacakge.deocrator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brew() {
        super.brew();
        addMilk();
    }

    private void addMilk() {
        System.out.println("Adding milk");
    }
}