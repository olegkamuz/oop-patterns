package decorator.kata;

public class Table extends BilliardParts{
    private BilliardParts billiardParts;

    public Table(BilliardParts billiardParts) {
        this.billiardParts = billiardParts;
    }
    public String getDescription() {
        return billiardParts.getDescription() + "\n - table";
    }

    @Override
    public double cost() {
        return billiardParts.cost() + 312.03;
    }
}
