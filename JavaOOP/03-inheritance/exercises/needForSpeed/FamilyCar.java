package needForSpeed;

public class FamilyCar extends needForSpeed.Car {

    public FamilyCar(double fuel, int horsePower){

        super(fuel,horsePower);
        super.setFuelConsumption(super.getFuelConsumption());
    }
}
