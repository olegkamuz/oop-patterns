package Strategy;

public class SimilarThing1 extends Things {

    public SimilarThing1() {
        behavior1 = new ConcreteBehavior1OfType2();
        behavior2 = new ConcreteBehavior2OfType3();
    }

    @Override
    void identifyYourself() {
        System.out.println("I`m similar thing 1");
    }
}
