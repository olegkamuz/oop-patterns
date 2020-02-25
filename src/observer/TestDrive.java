package observer;

public class TestDrive {
    public static void main(String... args) {
        Bank bank = new Bank();


        bank.updateDollarBuyPrice("24.15");
        bank.updateDollarSellPrice("24.45");
        bank.updateEuroBuyPrice("26.33");
        bank.updateEuroSellPrice("26.91");

        Stand stand1 = new Stand1();
        Stand stand2 = new Stand2();
        Stand stand3 = new Stand3();
        bank.register(stand1);
        bank.register(stand2);
        bank.register(stand3);
        bank.updateStands();
        System.out.println("removing stand at: " + stand1.getAddress());
        bank.unregister(stand1);
        bank.displayAll();
    }
}
