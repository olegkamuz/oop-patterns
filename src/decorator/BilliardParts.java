package decorator;

import java.math.BigDecimal;

public abstract class BilliardParts {
    protected String description = "All needed billiard parts are: ";
    String getDescription() {
        return description;
    }
    abstract BigDecimal cost();
}
