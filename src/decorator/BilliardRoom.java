package decorator.kata;

public class BilliardRoom extends BilliardParts {
    private BilliardParts billiardParts;
    public BilliardRoom(BilliardParts billiardParts) {
        this.billiardParts = billiardParts;
    }
    public String getDescription() {
        return billiardParts.getDescription() + "\n - billiard room";
    }
    public double cost() {
        return billiardParts.cost() + 2145.33;
    }

}
