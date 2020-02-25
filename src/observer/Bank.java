package observer;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
    BigDecimal dollarBuyPrice;
    BigDecimal dollarSellPrice;
    BigDecimal euroBuyPrice;
    BigDecimal euroSellPrice;

    ArrayList<Stand> stands = new ArrayList<Stand>();

    public void register(Stand s) {
        stands.add(s);
    }

    public void unregister(Stand s) {
        stands.remove(s);
    }

    public void updateStands() {
        for(Stand s: stands) {
            s.update(String.valueOf(dollarBuyPrice), String.valueOf(dollarSellPrice), String.valueOf(euroBuyPrice), String.valueOf(euroSellPrice));
        }
        this.displayAll();
    }

    public void updateDollarBuyPrice(String dbp) {
        this.dollarBuyPrice = new BigDecimal(dbp);
    }
    public void updateDollarSellPrice(String dsp) {
        this.dollarSellPrice = new BigDecimal(dsp);
    }
    public void updateEuroBuyPrice(String ebp) {
        this.euroBuyPrice = new BigDecimal(ebp);
    }
    public void updateEuroSellPrice(String esp) {
        this.euroSellPrice = new BigDecimal(esp);
    }

    public void updateAllCurrenciesRates(String dbp, String dsp, String ebp, String esp) {
        this.dollarBuyPrice = new BigDecimal(dbp);
        this.dollarSellPrice = new BigDecimal(dsp);
        this.euroBuyPrice = new BigDecimal(ebp);
        this.euroSellPrice = new BigDecimal(esp);
    }

    public void displayAll() {
        if (!stands.isEmpty()){
            for(Stand s: stands) {
                System.out.println();
                s.nameYourSelf();
                s.display();
                System.out.println();
            }
        } else {
            System.out.println("No registered stands");
        }
    }
}
