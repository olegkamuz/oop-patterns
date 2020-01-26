package decorator;

import java.math.BigDecimal;

public class AllNeededBilliardParts extends BilliardParts{
    BigDecimal price1 = new BigDecimal("0.00");
    @Override
    public BigDecimal cost() {
        System.out.println("All that costs in sum: ");
        return price1;
    }
}
