package abstractFactory;

public class FordAutoParts extends AutoParts{
    @Override
    public AutoParts createParts(String item) {
        if(item.equals("sport")) {
            return new FordSportAutoParts();
        } else if (item.equals("city")) {
            return new FordCityAutoParts();
        }
        return null;
    }
}
