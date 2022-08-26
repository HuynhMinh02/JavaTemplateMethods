package solution05;

public class TestDrive {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea....");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee....");
        coffeeHook.prepareRecipe();
    }
}
