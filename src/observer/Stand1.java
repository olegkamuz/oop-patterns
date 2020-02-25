package observer;

public class Stand1 extends Stand {
    public String address;
    public Stand1() {
        address = "Khreschatyk Str.";
    }
    public void nameYourSelf() {
        System.out.println("Currency exchange stand at " + this.address + ":");
    }
    public String getAddress() { return address; }

}
