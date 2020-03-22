package adapter;

public class TestDrive {
    public static void main(String... args) {
        Car car = new Car();
        gasAndSteer(car);

        CarInterface boatAdapter = new BoatAdapter(new Boat());
        gasAndSteer(boatAdapter);
    }
    public static void gasAndSteer(CarInterface vehicle){
        vehicle.hitTheGas();
        vehicle.steerTheWheel();
    }
}
