package design.pacakge.template;

public abstract class AbstractClass {
    protected abstract String pourIngredients();

    protected abstract String addSeasoning();

    private void finish(){
        System.out.println("出锅");;
    }

    public final void cook(){
        pourIngredients();
        addSeasoning();
        finish();
    }
}

