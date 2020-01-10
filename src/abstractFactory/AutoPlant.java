package abstractFactory;

public abstract class AutoPlant {
    public abstract Auto createAuto(String type);

    public Auto orderAuto(String item) {
        Auto auto = createAuto(item);
        System.out.println();
        System.out.println("Order received, creation process started...");
        auto.marryBodyToChassis();
        auto.putEngineIn();
        auto.installInterior();
        System.out.println("Your " + auto + " is ready!");
        return auto;
    }
}
