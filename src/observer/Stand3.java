package observer;

public class Stand3 extends Stand {
    public Stand3() {
        address = "Anna Akhmatova Str.";
    }
    public void nameYourSelf() {
        System.out.println("Currency exchange stand at " + address + ":");
    }

    @Override
    String getAddress() {
        return address;
    }

}
