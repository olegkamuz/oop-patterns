package Strategy;

public abstract class Things {
    Behavior1 behavior1;
    Behavior2 behavior2;

    public void setBehavior1(Behavior1 behavior1) {
        this.behavior1 = behavior1;
    }
    public void setBehavior2(Behavior2 behavior2) {
        this.behavior2 = behavior2;
    }
    public void performBehavior1() {
        behavior1.performActionOfBehavior1();
    }

    public void performBehavior2() {
        behavior2.performActionOfBehavior2();
    }

    abstract void identifyYourself();
    public void sameActionAllThings(){ System.out.println("This is some action for all things"); };
}
