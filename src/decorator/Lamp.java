package decorator;

import java.math.BigDecimal;

public class Lamp extends BilliardParts {
    protected BilliardParts billiardParts;
    public Lamp (BilliardParts billiardParts) {
        this.billiardParts = billiardParts;
    }
    String getDescription() { return billiardParts.getDescription() + "\n - lamp";}
    @Override
    BigDecimal cost() {
        BigDecimal price = new BigDecimal("1000.50");
        return billiardParts.cost().add(price);
    }
}
