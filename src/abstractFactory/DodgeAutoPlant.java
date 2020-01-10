package abstractFactory;

public class DodgeAutoPlant extends AutoPlant {
    AutoParts autoParts;

    @Override
    public Auto createAuto(String type) {
        Auto auto = null;
        if (type.equals("sport")) {
            autoParts = (new DodgeAutoParts()).orderParts("sport");
            auto = new Sport(autoParts);
            auto.setName("Dodge sports car");
        } else if (type.equals("city")) {
            autoParts = (new DodgeAutoParts()).orderParts("city");
            auto = new City(autoParts);
            auto.setName("Dodge city car");
        }
        return auto;
    }
}
