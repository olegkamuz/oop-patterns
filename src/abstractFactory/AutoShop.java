package abstractFactory;

public class AutoShop {
        public static void main(String[] args) {
            AutoPlant fordAutoPlant = new FordAutoPlant();
            fordAutoPlant.orderAuto("sport");
            fordAutoPlant.orderAuto("city");

            AutoPlant dodgeAutoPlant = new DodgeAutoPlant();
            dodgeAutoPlant.orderAuto("sport");
            dodgeAutoPlant.orderAuto("city");

        }
}
