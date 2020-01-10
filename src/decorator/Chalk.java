package decorator;

public class Chalk extends BilliardParts{
    private BilliardParts billiardParts;

    public Chalk(BilliardParts billiardParts) {
        this.billiardParts = billiardParts;
    }
    public String getDescription() {
        return billiardParts.getDescription() + "\n - chalk";
    }

    @Override
    public double cost() {
        return billiardParts.cost() + .33;
    }
}
