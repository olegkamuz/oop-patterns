package abstractFactory;

public class DodgeAutoParts extends AutoParts{

    @Override
    public AutoParts createParts(String item) {
        if(item.equals("sport")) {
            return new DodgeSportAutoParts();
        } else if (item.equals("city")) {
            return new DodgeCityAutoParts();
        }
        return null;
    }
}
