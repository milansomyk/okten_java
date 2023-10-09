package task3;

public class Owner {
    String name;
    int age;
    int experience;

    public Owner(){}
    public Owner(String name, int age, int experience){
        this.age = age;
        this.name = name;
        this.experience = experience;
    }
    public void improveQualification(){
        this.experience +=1;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}
