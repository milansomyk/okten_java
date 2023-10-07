package task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zooclub zooclub = new Zooclub();
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet(2,"Kail"));
        pets.add(new Pet(1,"Bobby"));
        pets.add(new Pet(3,"Tonny"));
        zooclub.setClub(2,"Lora",pets);
        zooclub.addMember(4,"Mike");
        zooclub.addPet(2,4,"Joey");
        zooclub.addPet(4,3,"Tonny");
        zooclub.absoluteDeletePet(3);
        zooclub.viewClub();

    }
}
