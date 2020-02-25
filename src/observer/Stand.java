package observer;

import java.math.BigDecimal;

public abstract class Stand {
    BigDecimal dollarBuyPrice;
    BigDecimal dollarSellPrice;
    BigDecimal euroBuyPrice;
    BigDecimal euroSellPrice;
    protected String address;

    abstract void nameYourSelf();
    abstract String getAddress();
    public void update(String dbp, String dsp, String ebp, String esp) {
        if(!dbp.equals("null")) {
            this.dollarBuyPrice = new BigDecimal(dbp);
        }
        if(!dsp.equals("null")){
            this.dollarSellPrice = new BigDecimal(dsp);
        }
        if(!ebp.equals("null")){
            this.euroBuyPrice = new BigDecimal(ebp);
        }
        if(!esp.equals("null")){
            this.euroSellPrice = new BigDecimal(esp);
        }
    }

    void display() {
        if(dollarBuyPrice != null) {
            System.out.println("Dollar buy price: " + dollarBuyPrice);
        } else {
            System.out.println("Dollar buy price: undefined");
        }
        if(dollarSellPrice != null) {
            System.out.println("Dollar sell price: " + dollarSellPrice);
        } else {
            System.out.println("Dollar sell price: undefined");
        }
        if(euroBuyPrice != null) {
            System.out.println("Euro buy price: " + euroBuyPrice);
        } else {
            System.out.println("Euro buy price: undefined");
        }
        if(euroSellPrice != null) {
            System.out.println("Euro sell price: " + euroSellPrice);
        } else {
            System.out.println("Euro sell price: undefined");
        }
    }

}
