package decorator.kata;

public class AllNeededBilliardParts extends BilliardParts{
    @Override
    public double cost() {
        System.out.println("All that costs in sum: ");
        return 0.0;
    }
}
