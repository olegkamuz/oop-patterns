package decorator;

import java.math.BigDecimal;

public class Chalk extends BilliardParts{
    private BilliardParts billiardParts;

    public Chalk(BilliardParts billiardParts) {
        this.billiardParts = billiardParts;
    }
    public String getDescription() {
        return billiardParts.getDescription() + "\n - chalk";
    }

    @Override
    public BigDecimal cost() {
        BigDecimal price = new BigDecimal("0.33");
        return billiardParts.cost().add(price);
    }
}
