package serviceLocator;

import java.util.ArrayList;
import java.util.List;

public class Register {
    private static List<Market> marketList = new ArrayList<>();
    public static Market lookUp(String concreteMarket) {
        if (concreteMarket.equals("Silpo")) {
            return Cash.addMarket(new Silpo());
        }
        if (concreteMarket.equals("Novus")) {
            return Cash.addMarket(new Novus());
        }
        if (concreteMarket.equals("Billa")) {
            return Cash.addMarket(new Billa());
        }
        return null;
    }
}
