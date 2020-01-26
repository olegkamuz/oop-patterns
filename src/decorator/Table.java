package decorator;

import java.math.BigDecimal;

public class Table extends BilliardParts{
    private BilliardParts billiardParts;

    public Table(BilliardParts billiardParts) {
        this.billiardParts = billiardParts;
    }
    public String getDescription() {
        return billiardParts.getDescription() + "\n - table";
    }

    @Override
    public BigDecimal cost() {
        BigDecimal price = new BigDecimal("312.03");
        return billiardParts.cost().add(price);
    }
}
