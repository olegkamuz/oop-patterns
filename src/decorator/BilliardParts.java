package decorator.kata;

public abstract class BilliardParts {
    protected String description = "All needed billiard parts are: ";
    String getDescription() {
        return description;
    }
    abstract double cost();
}
