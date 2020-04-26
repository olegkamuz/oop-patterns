package serviceLocator;

public class TestMarketClient {
    public static void main(String[] args) {
        (new MarketClient("Silpo")).getDelivery();
        (new MarketClient("Novus")).getDelivery();
        (new MarketClient("Billa")).getDelivery();
        (new MarketClient("Novus")).getDelivery();
    }
}
