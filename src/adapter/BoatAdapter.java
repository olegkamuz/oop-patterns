package adapter;

public class BoatAdapter implements CarInterface {
    private Boat boat;

    BoatAdapter(Boat boat) {
        this.boat = boat;
    }
    public void hitTheGas(){boat.pushTheThrottle();}
    public void steerTheWheel(){boat.steerTheHelm();}
}
