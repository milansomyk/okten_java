package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        Collections.addAll(users,
                new User(1, "Vasya",false, 20),
                new User(2,"Petya",true,30),
                new User(3,"Katya",false,22),
                new User(4,"Dima",false,32),
                new User(5,"Olya",true,19),
                new User(6,"Nina",false,20),
                new User(7,"Mark",true,22),
                new User(8,"Artem",false,24),
                new User(9,"Artur",false,21)
                );
        users.sort(Comparator.comparingInt(User::getAge));
        printIter(users);

        System.out.println("//////////////");

        users.sort((a,b)-> b.getAge()- a.getAge());
        printIter(users);

        System.out.println("//////////////");

        users.sort(Comparator.comparingInt(a -> a.getName().length()));
        printIter(users);

        System.out.println("//////////////");

        users.sort((a,b)->b.getName().length()-a.getName().length());
        printIter(users);

    }
    public static void printIter(List<User> usersList){
        for (User user : usersList) {
            System.out.println(user);
        }
    }
}