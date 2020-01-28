package facade;

public class MakeBreakfast {
    public static void main(String... args) {
        Juice juice = new Juice();
        Coffee coffee = new Coffee();
        Toaster toaster = new Toaster();
        Cheese cheese = new Cheese();
        Butter butter = new Butter();
        Breakfast breakfast = new Breakfast(juice, coffee, toaster, cheese, butter);
        breakfast.makeBreakfast();
        breakfast.cleanUpTheMess();
    }
}
