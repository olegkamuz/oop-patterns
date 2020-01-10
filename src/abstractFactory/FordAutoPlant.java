package abstractFactory;

public class FordAutoPlant extends AutoPlant {
    AutoParts autoParts;

    @Override
    public Auto createAuto(String type) {
        Auto auto = null;
        if (type.equals("sport")) {
            autoParts = (new FordAutoParts()).orderParts("sport");
            auto = new Sport(autoParts);
            auto.setName("Ford sports car");
        } else if (type.equals("city")) {
            autoParts = (new FordAutoParts()).orderParts("city");
            auto = new City(autoParts);
            auto.setName("Ford city car");
        }
        return auto;
    }
}
