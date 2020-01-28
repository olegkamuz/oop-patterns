package facade;

public class Breakfast {
    private Juice juice;
    private Coffee coffee;
    private Toaster toaster;
    private Cheese cheese;
    private Butter butter;

    public Breakfast(Juice juice, Coffee coffee, Toaster toaster, Cheese cheese, Butter butter) {
        this.juice = juice;
        this.coffee = coffee;
        this.toaster = toaster;
        this.cheese = cheese;
        this.butter = butter;
    }

    public void makeBreakfast() {
        System.out.println("Making breakfast...");
        juice.squeeze();
        coffee.makeCoffee();
        toaster.makeToast();
        cheese.cutCheese();
        butter.spreadButter();
        System.out.println("Breakfast is ready");
        System.out.println();
    }
    public void cleanUpTheMess() {
        System.out.println("Clean up the mess...");
        juice.waistToTrash();
        coffee.cupToSink();
        toaster.pullPlugFromOutlet();
        cheese.putToFridge();
        butter.putToFridge();
        System.out.println("All clean");
        System.out.println();
    }
}
