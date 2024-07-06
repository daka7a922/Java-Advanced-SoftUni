package carshopextended;

public class Seat extends  CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        String firstRow = super.toString();
        String secondRow = "%s sells for %f".formatted(getModel(), price);

        sb.append(firstRow).append(System.lineSeparator());
        sb.append(secondRow);

        return sb.toString();
    }

    @Override
    public Double getPrice() {
        return price;
    }
}