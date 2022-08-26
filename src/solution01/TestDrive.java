package solution01;

public class TestDrive {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();

        Tea tea = new Tea();

        coffee.prepareRecipe();

        System.out.println("");
        
        tea.prepareRecipe();
    }
}
