package design.pacakge.deocrator;

public class Client {
    public static void main(String[] args) {
        // 创建基础咖啡
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Simple Coffee:");
        simpleCoffee.brew();
        
        // 添加牛奶的咖啡
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("\nMilk Coffee:");
        milkCoffee.brew();

        // 同时添加牛奶和糖的咖啡
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println("\nMilk and Sugar Coffee:");
        milkSugarCoffee.brew();
    }
}