package hw1;

public class GetterSetter {
    int age;
    String name;
    //Загальне: всі поля класу приватні, додати гетери сетери (не використовуючи ломбок)
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
