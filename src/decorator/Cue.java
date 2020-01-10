package decorator.kata;

public class Cue extends BilliardParts{
    private BilliardParts billiardParts;

    public Cue(BilliardParts billiardParts) {
        this.billiardParts = billiardParts;
    }
    public String getDescription() {
        return billiardParts.getDescription() + "\n - cue";
    }

    @Override
    public double cost() {
        return billiardParts.cost() + 51.93;
    }
}
