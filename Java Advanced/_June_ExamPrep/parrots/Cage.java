package _June_ExamPrep.parrots;

import java.util.ArrayList;
import java.util.List;

public class Cage {

    private String name;
    private int capacity;
    private List<Parrot> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void add(Parrot parrot) {

        if (data.size() > capacity) {

        }else {
            data.add(parrot);
        }
    }

    public boolean remove(String name) {

        return data.removeIf(parrot -> parrot.getName().equals(name));
    }

    public Parrot sellParrot(String name) {

//        Parrot currentParrot = data.stream().filter(parrot -> parrot.getName().equals(name)).findFirst().orElse(null);
//        currentParrot.setAvailable(false);
//        return currentParrot;

        for (Parrot parrot : data) {
            if (parrot.getName().equals(name)){
                parrot.setAvailable(false);
                return parrot;
            }
        }
        return null;
    }

    public List<Parrot> sellParrotBySpecies(String species) {

        List<Parrot> soldParrots = new ArrayList<>();
        for (Parrot parrot : this.data) {
            if (parrot.getSpecies().equals(species)) {
                parrot.setAvailable(false);
                soldParrots.add(parrot);
            }

        }
        return soldParrots;
    }

    public int count() {

        return this.data.size();
    }

    public String report() {

//        String parrotData = data.stream().filter(parrot -> parrot.isAvailable())
//                .map(Parrot::toString)
//                .collect(Collectors.joining(System.lineSeparator()));
//
//        return String.format("Parrots available at %s:\n",this.getName()) +
//                parrotData;

        StringBuilder sb = new StringBuilder();
        String firstLine = String.format("Parrots available at %s:", this.name);
        sb.append(firstLine).append(System.lineSeparator());
        for (Parrot parrot : this.data) {
            if (parrot.isAvailable()) {
                sb.append(parrot.toString()).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

}

//⦁	"Parrots available at {cageName}:
//{Parrot 1}
//{Parrot 2}
//(…)"

