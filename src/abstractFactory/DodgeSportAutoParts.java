package abstractFactory;

public class DodgeSportAutoParts extends DodgeAutoParts {
    public Body getBody() {
        return new Hatchback();
    }
    public Chassis getChassis() {
        return new Precision();
    }
    public Engine getEngine() {
        return new Economy();
    }
    public Interior getInterior() {
        return new Leather();
    }
}
