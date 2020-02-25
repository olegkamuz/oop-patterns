package observer;

public class Stand2 extends Stand {
    public Stand2() {
        address = "Tsiolkovsky Str.";
    }
    public void nameYourSelf() {
        System.out.println("Currency exchange stand at " + address + ":");
    }

    @Override
    String getAddress() {
        return address;
    }

}
