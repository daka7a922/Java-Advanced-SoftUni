package _June_ExamPrep.parrots;

public class Parrot {

    private String name;
    private String species;
    private boolean available = true;


    public Parrot(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String toString() {

        return String.format("Parrot (%s): %s", this.species, this.name);
    }

}
