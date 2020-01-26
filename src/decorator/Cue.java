package decorator;

import java.math.BigDecimal;

public class Cue extends BilliardParts{
    private BilliardParts billiardParts;

    public Cue(BilliardParts billiardParts) {
        this.billiardParts = billiardParts;
    }
    public String getDescription() {
        return billiardParts.getDescription() + "\n - cue";
    }
    BigDecimal price = new BigDecimal("51.93");
    @Override
    public BigDecimal cost() {
        return billiardParts.cost().add(price);
    }
}
