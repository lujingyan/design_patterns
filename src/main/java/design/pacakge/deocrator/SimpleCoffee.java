package design.pacakge.deocrator;

public class SimpleCoffee implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing simple coffee");
    }
}