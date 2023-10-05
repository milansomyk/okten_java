package task3;

import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
        Car car1 = new Car("toyota",2003,250);
        Car car2 = new Car("Volkswagen",2010,150);
        Car car3 = new Car("Audi",2018,320);

        List<Skill> skills = new ArrayList<>();
        Collections.addAll(skills,
                new Skill(SkillTitles.JS.getSkill(),10),
                new Skill(SkillTitles.JAVA.getSkill(),5),
                new Skill(SkillTitles.CPP.getSkill(),7)
                );

        User user1 = new User(1, "Ben", "Harry", "Ben@gmail.com", 30, Gender.MALE.toString(), skills.subList(0,3), car1);
        User user2 = new User(2, "Jimmy", "Willson", "Jimmy@gmail.com", 20, Gender.MALE.toString(), skills.subList(0,1), car1);
        User user3 = new User(3, "Lora", "Tomas", "Lora@gmail.com", 23, Gender.FEMALE.toString(), skills.subList(1,3), car1);
        User user4 = new User(4, "Nani", "Nora", "Nani@gmail.com", 40, Gender.FEMALE.toString(), skills.subList(2,3), car1);
        User user5 = new User(5, "Usop", "Loki", "Usop@gmail.com", 31, Gender.MALE.toString(), skills.subList(0,2), car1);
        User user6 = new User(6, "Leki", "Monkey", "Leki@gmail.com", 20, Gender.FEMALE.toString(), skills.subList(0,3), car1);
        User user7 = new User(7, "Kin", "Bavbor", "Kin@gmail.com", 19, Gender.MALE.toString(), skills.subList(1,2), car1);
        User user8 = new User(8, "Mak", "Bors", "Mak@gmail.com", 17, Gender.MALE.toString(), skills.subList(1,3), car1);
        User user9 = new User(9, "Lowrens", "Crack", "Lowrens@gmail.com", 27, Gender.MALE.toString(), skills.subList(1,2), car1);
        User user10 = new User(10, "Bob", "Looney", "Bob@gmail.com", 25, Gender.MALE.toString(), skills.subList(2,3), car1);

        Collections.addAll(users,user2,user3,user4,user1,user5,user6,user7,user8,user9,user10);
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            User next = iterator.next();
            if(next.gender.equals(Gender.MALE.toString())){
                iterator.remove();
            }
        }
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("////////////////////////////////");
        Set<User> treeSet = new TreeSet<>();
        Collections.addAll(treeSet,user1,user2,user3,user4,user5,user6,user7,user8,user9,user10);
        for (User user : treeSet) {
            System.out.println(user);
        }


    }
}
