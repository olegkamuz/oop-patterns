package strategy;

public class TestDriver {
    public static void main(String... args) {
        Things thing1 = new SimilarThing1();
        Things thing2 = new SimilarThing2();
        Things thing3 = new SimilarThing3();

        thing1.identifyYourself();
        thing1.sameActionAllThings();
        thing1.performBehavior1();
        thing1.performBehavior2();
        System.out.println("Change action of behavior 1 to type 2");
        thing1.setBehavior1(new ConcreteBehavior1OfType2());
        thing1.performBehavior1();
        System.out.println();

        thing2.identifyYourself();
        thing2.sameActionAllThings();
        thing2.performBehavior1();
        thing2.performBehavior2();
        System.out.println("Change action of behavior 2 to type 3");
        thing2.setBehavior2(new ConcreteBehavior2OfType3());
        thing2.performBehavior2();
        System.out.println();

        thing3.identifyYourself();
        thing3.sameActionAllThings();
        thing3.performBehavior1();
        thing3.performBehavior2();
    }
}
