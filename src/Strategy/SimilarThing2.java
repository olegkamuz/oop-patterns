package Strategy;

public class SimilarThing2 extends Things {

    public SimilarThing2() {
        behavior1 = new ConcreteBehavior1OfType1();
        behavior2 = new ConcreteBehavior2OfType2();
    }

    @Override
    void identifyYourself() {
        System.out.println("I`m similar thing 2");
    }
}
