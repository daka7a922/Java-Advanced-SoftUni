package carshopextended;

public class Audi extends CarImpl implements Rentable {

    private Double pricePerDay;

    private Integer minRentDay;


    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay= minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();

        String firstRow = super.toString();
        String secondRow = "Minimum rental period of %d days. Price per day %f".formatted(getMinRentDay(), getPricePerDay());

        sb.append(firstRow).append(System.lineSeparator());
        sb.append(secondRow);

        return sb.toString();

    }
}
