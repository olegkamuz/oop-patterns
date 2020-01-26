package decorator;

public class TestBilliard {
    public static void main(String... args) {
        BilliardParts allNeededBilliardParts = new AllNeededBilliardParts();
        allNeededBilliardParts = new Lamp(allNeededBilliardParts);
        allNeededBilliardParts = new BilliardRoom(allNeededBilliardParts);
        allNeededBilliardParts = new Table(allNeededBilliardParts);
        allNeededBilliardParts = new Cue(allNeededBilliardParts);
        allNeededBilliardParts = new Chalk(allNeededBilliardParts);
        System.out.println(allNeededBilliardParts.getDescription());
        System.out.println("$ " + allNeededBilliardParts.cost());
    }
}
