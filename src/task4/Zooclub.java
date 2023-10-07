package task4;

import java.util.*;

public class Zooclub{
    private TreeMap<Person, List<Pet>> club = new TreeMap<>();

    public void setClub(int id, String name, List<Pet> pets) {
        this.club.put(new Person(id, name), pets);
    }
    public void addMember(int id, String name){
        this.club.put(new Person(id, name), new ArrayList<Pet>());
    }
    public void addPet(int personId, int petId, String petName){
        Set<Person> persons = this.club.keySet();
        Person specperson = null;
        for (Person person1 : persons) {
            if (personId == person1.getId()){
                specperson = person1;
            }
        }
        List<Pet> pets = this.club.get(specperson);
        pets.add(new Pet(petId,petName));
    }

    public void deletePet(int personId, int petId){
        Set<Person> persons = this.club.keySet();
        Person specperson = null;
        for (Person person1 : persons) {
            if (personId == person1.getId()){
                specperson = person1;
            }
        }
        List<Pet> pets = this.club.get(specperson);
        pets.removeIf(pet -> pet.getPetId()==petId);
    }

    public void deleteMember(int personId){
        Set<Person> persons = this.club.keySet();
        persons.removeIf(person -> person.getId()==personId);
    }
    public void absoluteDeletePet(int petId){
        Iterator<List<Pet>> iterator = this.club.values().iterator();
        while (iterator.hasNext()){
            iterator.next().removeIf(pet -> pet.getPetId()==petId);
        }
    }
    public void viewClub(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Zooclub{" +
                "club=" + club +
                '}';
    }
}
