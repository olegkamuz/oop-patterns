package decorator;

import java.math.BigDecimal;

public class BilliardRoom extends BilliardParts {
    private BilliardParts billiardParts;
    public BilliardRoom(BilliardParts billiardParts) {
        this.billiardParts = billiardParts;
    }
    public String getDescription() {
        return billiardParts.getDescription() + "\n - billiard room";
    }
    public BigDecimal cost() {
        BigDecimal price = new BigDecimal("2145.33");
        return billiardParts.cost().add(price);
    }

}
