package task2;

public class Drum implements Instrument{
    int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Грає барабан з розміром "+ size);
    }
}
