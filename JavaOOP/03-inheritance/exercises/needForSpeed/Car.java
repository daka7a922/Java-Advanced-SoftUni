package needForSpeed;

public class Car extends needForSpeed.Vehicle {

    private final static double DEFAULT_FUEL_CONSUMPTION = 3;


    public Car(double fuel, int horsePower){

        super(fuel,horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
