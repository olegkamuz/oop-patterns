package abstractFactory;

public class FordSportAutoParts extends FordAutoParts {
    public Body getBody() {
        return new Roadster();
    }
    public Chassis getChassis() {
        return new Comfort();
    }
    public Engine getEngine() {
        return new Muscle();
    }
    public Interior getInterior() {
        return new Carbon();
    }
}
