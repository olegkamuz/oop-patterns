package serviceLocator;

public class ServiceLocator {
    public static Market getMarket(String concreteMarket) {
        Market market;

        if((market = Cash.lookUp(concreteMarket)) != null){
            System.out.println("service from cash: " + market.getClass().getSimpleName());
            return market;
        }
        if((market = Register.lookUp(concreteMarket)) != null){
            return market;
        }
        return null;
    }
}
