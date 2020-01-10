package abstractFactory;

public abstract class Auto {
    AutoParts autoParts;
    private String name;

    public void marryBodyToChassis() {
        System.out.println("Marry " + autoParts.getBody() + " body to " + autoParts.getChassis() + " chassis");
    }

    public void putEngineIn() {
        System.out.println("Putting " + autoParts.getEngine() + " engine in");
    }

    public void installInterior() {
        System.out.println("Installing " + autoParts.getInterior() + " interior");
    }

    public String toString() {
        return getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
