package hw1;


public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("tesla", 200, 0, false),
                new Car("golf", 75, 1.4, false),
                new Car("passat", 180, 2.0, false),
                new Car("camry", 150, 3.5, false),
                new Car("lada", 90, 1.5, false)
        };

        Dog[] dogs = new Dog[]{
                new Dog("bobby", 5, "haski"),
                new Dog("dodik", 3, "vivcharka"),
                new Dog("pups", 2, "mops"),
                new Dog("rikki", 15, "mops"),
                new Dog("dodos", 9, "alabai")
        };

        Book[] books = new Book[]{
                new Book("Abracadabra", 50, new String[]{"John", "Jimmy"},"fantasy"),
                new Book("Abracadabra", 50, new String[]{"Palmer", "Tony"},"fantasy"),
                new Book("Abracadabra", 50, new String[]{"Tom", "Garry"},"fantasy"),
                new Book("Abracadabra", 50, new String[]{"Logan", "George"},"fantasy"),
                new Book("Abracadabra", 50, new String[]{"Ken", "Clark"},"fantasy")
        };
        JsonObject[] jsonObjects = new JsonObject[]{
                new JsonObject(1, 1, "lol","azaza"),
                new JsonObject(2, 3, "ahahah","jojojo"),
                new JsonObject(3, 7, "sdfsdfsdfsdf","zcvzxcvzxcvzx"),
                new JsonObject(4, 10, "boom boom","lol12312"),
                new JsonObject(5, 2, "Hi","World")
        };
        JsonComment[] jsonComments = new JsonComment[]{
                new JsonComment(1,1,"aboba", "aboba@gmail.com","adafasdfasdfa"),
                new JsonComment(1,1,"friend", "friend@gmail.com","l;kjklj;kjol;k"),
                new JsonComment(1,1,"kokos", "kokos@gmail.com","Kokos inp"),
                new JsonComment(1,1,"Abrahja", "Abrahja@gmail.com","Isla upit on usim"),
                new JsonComment(1,1,"Tan", "Tan@gmail.com","Empire Exists")
        };
        System.out.println("Cars:");
        for (Car car : cars){
            System.out.println(car);
        }
        System.out.println("Dogs:");
        for (Dog dog : dogs){
            System.out.println(dog);
        }
        System.out.println("Books:");
        for (Book book : books){
            System.out.println(book);
        }
        System.out.println("JsonPosts:");
        for (JsonObject jsonObject : jsonObjects){
            System.out.println(jsonObject);
        }
        System.out.println("JsonComments:");
        for (JsonComment jsonComment : jsonComments){
            System.out.println(jsonComment);
        }
    }
}