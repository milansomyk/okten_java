package task1;

public class User {
    int id;
    String name;
    Boolean status;
    int age;

    public User(int id, String name, Boolean status, int age){
        this.id = id;
        this.name = name;
        this.status = status;
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "id: "+id+", name: "+name+", status: "+status+", age: "+age;
    }
}
