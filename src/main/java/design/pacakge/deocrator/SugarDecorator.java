package design.pacakge.deocrator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brew() {
        super.brew();
        addSugar();
    }

    private void addSugar() {
        System.out.println("Adding sugar");
    }
}