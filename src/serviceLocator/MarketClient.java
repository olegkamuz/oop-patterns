package serviceLocator;

public class MarketClient {
    private final Market market;
    public MarketClient(String concreteMarket){
        market =ServiceLocator.getMarket(concreteMarket);
    }
    public void getDelivery() {
        market.delivery();
    }
}
