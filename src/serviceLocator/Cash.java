package serviceLocator;

import java.util.ArrayList;
import java.util.List;

public class Cash {
    private static List<Market> markets = new ArrayList<>();
    public static List<Market> getMarkets() {
        return markets;
    }
    public static Market addMarket(Market market){
        markets.add(market);
        return market;
    }
    public static Market lookUp(String concreteMarket) {
        if(markets.size() == 0) {
            return null;
        }
        for(Market m: markets) {
            if(m.getClass().getSimpleName().equals(concreteMarket)) {
                return m;
            }
        }
        return null;
    }
}
