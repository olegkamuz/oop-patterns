package abstractFactory;

public abstract class AutoParts {
    private Body body;
    private Chassis chassis;
    private Engine engine;
    private Interior interior;

    public abstract AutoParts createParts(String item);

    public AutoParts orderParts(String type) {
        return createParts(type);
    }

    public Body getBody() {
        return body;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public Engine getEngine() {
        return engine;
    }

    public Interior getInterior() {
        return interior;
    }

}
