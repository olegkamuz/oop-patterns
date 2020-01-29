package Strategy;

public class SimilarThing3 extends Things {

    public SimilarThing3() {
        behavior1 = new ConcreteBehavior1OfType3();
        behavior2 = new ConcreteBehavior2OfType3();
    }

    @Override
    void identifyYourself() {
        System.out.println("I`m similar thing 3");
    }
}
