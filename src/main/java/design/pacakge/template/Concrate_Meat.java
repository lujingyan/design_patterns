package design.pacakge.template;

public class Concrate_Meat extends AbstractClass{
    @Override
    protected String pourIngredients() {
        System.out.println("pour meat");
        return "pour meat";
    }

    @Override
    protected String addSeasoning() {
        System.out.println("add cooking wine");
        return "add cooking wine";
    }
}
