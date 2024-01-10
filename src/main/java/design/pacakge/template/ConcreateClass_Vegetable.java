package design.pacakge.template;

public class ConcreateClass_Vegetable extends AbstractClass{
    @Override
    protected String pourIngredients() {
        System.out.println("pour vegetable");
        return "pour vegetable";
    }

    @Override
    protected String addSeasoning() {
        System.out.println("add salt");
        return "add salt";
    }
}
